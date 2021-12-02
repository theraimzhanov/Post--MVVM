package com.example.post.data.remove

import com.example.post.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
suspend fun getPosts():Response<List<Post>>
}
//https://jsonplaceholder.typicode.com/posts