package com.example.recycler_view;

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewsDetail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        val heading=intent.getStringExtra("heading")
        val newsContent=intent.getStringExtra("newsContent")
        val imageid=intent.getIntExtra("image",R.drawable.img4)

        val headingTv=findViewById<TextView>(R.id.Heading)
        val headingIv=findViewById<ImageView>(R.id.img_type)
        val newContent=findViewById<TextView>(R.id.TextTile)

        headingTv.text=heading
        newContent.text=newsContent
        headingIv.setImageResource(imageid)

    }
}