package com.example.capstone.ui

import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import com.example.capstone.utils.DatePickerFragment
import com.example.capstone.R
import com.example.capstone.databinding.ActivityHomeBinding
import com.example.capstone.ui.mainActivity.MainActivity
import org.tensorflow.lite.Interpreter
import java.io.FileInputStream
import java.io.IOException
import java.lang.Exception
import java.nio.MappedByteBuffer
import java.nio.channels.FileChannel
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
class HomeActivity : AppCompatActivity(), View.OnClickListener, DatePickerFragment.DialogDateListener {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var tflite: Interpreter

   /* private val inputDate: FloatArray = floatArrayOf(0F,0F,0F)
    private val output: FloatArray = floatArrayOf(3F,0F,0F)*/

    companion object {
        private const val DATE_PICKER_TAG = "DatePicker"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pickDateButton.setOnClickListener(this)
        binding.cek.setOnClickListener(this)

        currentDate()
        calculateDays()

        try {
            tflite = Interpreter(loadModelFile())
        } catch (e: Exception){
            e.printStackTrace()
        }

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.pick_date_button -> {
                val datePickerFragment = DatePickerFragment()
                datePickerFragment.show(supportFragmentManager, DATE_PICKER_TAG)
            }
            R.id.cek -> {
                val intent = Intent(this, MainActivity::class.java)
                /*val prediction = inference(binding.result.toString())*/
                val data = binding.result.toString()
                intent.putExtra("TCI", data)
                startActivity(intent)
            }
        }
    }
   /* fun inference(s: String): IntArray?{
        val inputDate = binding.result.toString()
        val output = arrayOfNulls<IntArray>(2)
        tflite.run(inputDate, output)
        val inferedValue = output[0]
        return inferedValue
    }*/

    private fun loadModelFile(): MappedByteBuffer {
        val fileDescriptor: AssetFileDescriptor = this@HomeActivity.assets.openFd("TCI_Bangli_model.tflite")
        val fileInputStream = FileInputStream(fileDescriptor.fileDescriptor)
        val fileChannel : FileChannel = fileInputStream.channel
        val startOffSets = fileDescriptor.startOffset
        val declaredLength = fileDescriptor.declaredLength

        return fileChannel.map(FileChannel.MapMode.READ_ONLY,startOffSets,declaredLength) ?: throw IOException("invalid")
    }


    override fun onDialogDateSet(tag: String?, year: Int, month: Int, dayOfMonth: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(year,month,dayOfMonth)
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())

        binding.pickDate.text = dateFormat.format(calendar.time)
    }

    private fun currentDate(){
        val d  = Date()

        //date
        val date = SimpleDateFormat("dd", Locale.getDefault())
        binding.date.text = date.format(d)

        //day
        val day = SimpleDateFormat("EEEE", Locale.getDefault())
        binding.day.text = day.format(d)

        //month
        val month = SimpleDateFormat("MMM", Locale.getDefault())
        binding.month.text = month.format(d)

        //year
        val year = SimpleDateFormat("yyyy", Locale.getDefault())
        binding.year.text = year.format(d)


    }


    private fun calculateDays(){
        val current = LocalDate.of(2021,6,10)
        val test = LocalDate.of(2021,2,28)
        val d = ChronoUnit.DAYS.between(test,current)

        binding.result.text = d.toString()
    }


}