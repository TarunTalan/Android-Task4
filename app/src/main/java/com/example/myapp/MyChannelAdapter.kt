package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyChannelAdapter(private val channelList: List<ChannelData>) : RecyclerView.Adapter<MyChannelAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.channel_item_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentChannel = channelList[position]
        holder.creatorName.text = currentChannel.creatorName
        holder.subscribers.text = currentChannel.subscriberCount
        holder.videos.text = currentChannel.videosCount
        holder.profile.setImageResource(currentChannel.profileResId)
    }

    override fun getItemCount(): Int {
        return channelList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val creatorName: TextView = itemView.findViewById(R.id.creatorName)
        val subscribers: TextView = itemView.findViewById(R.id.subscribers)
        val videos: TextView = itemView.findViewById(R.id.videos)
        val profile: ImageView = itemView.findViewById(R.id.profile)    }
}
