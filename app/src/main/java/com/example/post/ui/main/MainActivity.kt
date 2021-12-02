package com.example.post.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.post.R
import com.example.post.model.Post
import com.example.post.repository.PostRepository
import com.example.post.ui.adapter.PostAdapter

class MainActivity : AppCompatActivity() {
private lateinit var mainViewModel:MainViewModel
private val adapter by lazy {
    PostAdapter()
}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val repository =PostRepository()
        recyclerView.adapter = adapter
val mainViewModelFactory  = MainViewModelFactory(repository)
mainViewModel =ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)
        getData()
    }

    private fun getData() {
 mainViewModel.getDataFromApi()
        mainViewModel.response.observe(this, Observer {
            adapter.setData(it.body()!!)

        })
    }
}