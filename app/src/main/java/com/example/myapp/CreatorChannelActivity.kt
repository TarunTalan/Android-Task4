package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp.databinding.ActivityCreatorChannelBinding

class CreatorChannelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreatorChannelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCreatorChannelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val channelList = listOf(
            ChannelData("Tech Explained", "1.2M Subscribers", "150 videos", R.drawable.img5),
            ChannelData("Creative Corner", "800K Subscribers", "95 videos", R.drawable.img2),
            ChannelData("Chef Master", "2.5M Subscribers", "300 videos", R.drawable.img3)
        )

        val adapter = MyChannelAdapter(channelList)

        binding.recyclerViewChannel.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewChannel.adapter = adapter

        // 3. Fix the method call
        binding.recyclerViewChannel.setHasFixedSize(true)
    }
}
