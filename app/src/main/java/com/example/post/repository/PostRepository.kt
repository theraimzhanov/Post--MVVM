package com.example.post.repository

import com.example.post.data.remove.RetrofitInstance
import com.example.post.model.Post
import retrofit2.Response
import retrofit2.Retrofit

class PostRepository {

suspend fun  getData():Response<List<Post>>{
return RetrofitInstance.api.getPosts()
}
}