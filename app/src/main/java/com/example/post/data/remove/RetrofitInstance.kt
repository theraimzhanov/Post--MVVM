package com.example.post.data.remove

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

  private val retrofit by lazy {
Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
  }
    val api by lazy {
retrofit.create(PostApi::class.java)
    }
}