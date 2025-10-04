package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoList = listOf(
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img1),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img2),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img3),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img4),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img5),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img6),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img7),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img8),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img9),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img10),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img1),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img2),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img3),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img4),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img5),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img6),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img7),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img8),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img9),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img10),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img1),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img2),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img3),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img4),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img5),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img6),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img7),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img8),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img9),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img10),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img1),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img2),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img3),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img4),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img5),
            VideoData("Kotlin for Beginners", "Tech Explained", "1.5M views", R.drawable.img6),
            VideoData("How to Cook Pasta", "Chef Master", "3.2M views", R.drawable.img7),
            VideoData("DIY Home Decor", "Creative Corner", "890K views", R.drawable.img8),
            VideoData("A Trip to the Mountains", "Travel Vlogs", "550K views", R.drawable.img9),
            VideoData("Understanding RecyclerView", "Android Devs", "2.1M views", R.drawable.img10)
        )

        val adapter = MyAdapter(videoList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.hasFixedSize()
        binding.recyclerView.adapter = adapter
    }
}