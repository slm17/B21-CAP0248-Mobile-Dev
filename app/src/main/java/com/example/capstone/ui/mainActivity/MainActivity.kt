package com.example.capstone.ui.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capstone.databinding.ActivityMainBinding
import com.example.capstone.model.Destination
import com.example.capstone.ui.DetailActivity
import com.example.capstone.utils.Data
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Destination> = arrayListOf()

    companion object{
        const val TCI = "tci"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list.addAll(Data.listData)
        showRecyclerList()

        currentDate()

        val tci = intent.getIntExtra(TCI,0)
        val data = " $tci"
        binding.tci.text = data
    }

    private fun showRecyclerList() {
        val adapter = mainAdapter(list)
        adapter.notifyDataSetChanged()
        adapter.setInClick(object : mainAdapter.OnClickCallBack{
            override fun onItemClicked(data: Destination) {
                Intent(this@MainActivity, DetailActivity::class.java).also {
                    it.putExtra(DetailActivity.IMAGE, data.image)
                    it.putExtra(DetailActivity.EXTRA_DATA, data.des)
                    startActivity(it)
                }
            }
        })

        binding.apply {
            binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            binding.recyclerView.adapter = adapter
            binding.recyclerView.setHasFixedSize(true)
        }

    }

    private fun currentDate() {
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
}