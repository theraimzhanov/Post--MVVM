package com.example.post.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.post.repository.PostRepository

class MainViewModelFactory(val repository: PostRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
 return MainViewModel(repository) as T
    }

}