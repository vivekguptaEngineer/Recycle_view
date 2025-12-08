package com.example.recycler_view;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    lateinit var Arrylist: ArrayList<News>
    lateinit var recylc: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NewHeading=arrayOf("pradhu","narayan","gopal","lrishna","vaishnu")
        val Newsimg=arrayOf(R.drawable.img2
            ,R.drawable.img1,R.drawable.img3,R.drawable.img4,R.drawable.img5)
        Arrylist= ArrayList()
        for (i in Newsimg.indices){
            val news= News(NewHeading[i],Newsimg[i])
            Arrylist.add(news)
        }
        val list=findViewById<RecyclerView>(R.id.recycle_view)

        list.layoutManager= LinearLayoutManager(null)

        list.adapter= MyAdapter(Arrylist,this)

intent




    }
}