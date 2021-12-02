package com.example.post.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.post.R
import com.example.post.model.Post

class PostAdapter():RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
 private var list:List<Post> = emptyList()
    class PostViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
           val text_title:TextView = itemView.findViewById(R.id.text_title)
           val text_body:TextView = itemView.findViewById(R.id.text_body)
           val text_id:TextView = itemView.findViewById(R.id.text_id)
           val text_user_id:TextView = itemView.findViewById(R.id.text_user_id)
    }
    fun setData( newList:List<Post>){
        this.list = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val postt = list[position]
        holder.text_body.text = postt.body
        holder.text_id.text = postt.id.toString()
        holder.text_title.text = postt.title
        holder.text_user_id.text = postt.userId.toString()
    }

    override fun getItemCount(): Int {
      return list.size
    }
}