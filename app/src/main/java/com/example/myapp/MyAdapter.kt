package com.example.myapp

import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val videoList: List<VideoData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentVideo = videoList[position]
        holder.title.text = currentVideo.title
        holder.creator.text = currentVideo.creatorName
        holder.views.text = currentVideo.viewCount
        holder.image.setImageResource(currentVideo.thumbnailResId)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val creator: TextView = itemView.findViewById(R.id.creatorName)
        val views: TextView = itemView.findViewById(R.id.views)
        val image: ImageView = itemView.findViewById(R.id.thumbNail)    }
}
