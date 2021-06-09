package com.example.capstone.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.capstone.R
import com.example.capstone.databinding.ActivityDetailBinding
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_DATA = "extra_data"
        const val IMAGE = "image"
    }

    private lateinit var binding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val des = intent.getStringExtra(EXTRA_DATA)
        val image = intent.getIntExtra(IMAGE,0)


        val context = " $des"
        binding.des.text = context

        Glide.with(this@DetailActivity)
            .load(image)
            .into(binding.imageView)

        getData()

    }

    private fun getData(){
        val client = AsyncHttpClient()
        val url = "http://10.0.2.2:3000/weather?kota=bangli"
        client.get(url, object : AsyncHttpResponseHandler() {
            override fun onSuccess(
                statusCode: Int,
                headers: Array<Header>,
                responseBody: ByteArray
            ) {
                val result = String(responseBody)
                try {
                    val responObject = JSONObject(result)
                    val wind = responObject.getString("wind")
                    val min_hum = responObject.getString("min_hum")
                    val max_hum = responObject.getString("max_hum")
                    val wdirection = responObject.getString("wdirection")
                    val temp_min = responObject.getString("temp_min")
                    val temp_max = responObject.getString("temp_max")

                    binding.textView2.text = wind
                    binding.textView6.text = max_hum
                    binding.textView10.text = min_hum
                    binding.textView4.text = wdirection
                    binding.textView7.text = temp_max
                    binding.textView9.text = temp_min

                } catch (e: Exception){
                    Toast.makeText(this@DetailActivity, e.message, Toast.LENGTH_SHORT).show()
                    e.printStackTrace()
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<Header>,
                responseBody: ByteArray,
                error: Throwable
            ) {
                val errorMessage = when (statusCode) {
                    401 -> "$statusCode : Bad Request"
                    403 -> "$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found"
                    else -> "$statusCode : ${error.message}"
                }
                Toast.makeText(this@DetailActivity, errorMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}