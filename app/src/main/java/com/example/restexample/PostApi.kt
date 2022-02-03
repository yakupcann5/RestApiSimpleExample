package com.example.restexample

import retrofit2.Call
import retrofit2.http.GET

interface PostApi {
    @GET("/api/character")
    fun getPost(): Call<Model>
}