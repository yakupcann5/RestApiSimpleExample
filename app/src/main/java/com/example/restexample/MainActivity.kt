package com.example.restexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    val BASE_URL = "https://rickandmortyapi.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPost()

    }
    fun getApiService(): PostApi{
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return builder.create(PostApi::class.java)
    }
    fun getPost() {
        val start = System.currentTimeMillis()

        getApiService().getPost().enqueue(object : Callback<Model>{
            override fun onResponse(call: Call<Model>, response: Response<Model>) {
                Log.d("response", "${response.body()}")
                val finish = System.currentTimeMillis()
                val timeElapsed = finish - start
                Log.d("asd", timeElapsed.toString())
            }

            override fun onFailure(call: Call<Model>, t: Throwable) {
                print(t.localizedMessage)
            }
        })
    }
}