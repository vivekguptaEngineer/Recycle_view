package com.example.recycler_view;

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    lateinit var vivek: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kunal = findViewById<RecyclerView>(R.id.recylc)

        val Text1 = arrayOf("Government curbs IndiGo flights by 10%", "Satya Nadella pledges USD 17.5 billion","Government curbs IndiGo flights by 10%", "Satya Nadella pledges USD 17.5 billion","Government curbs IndiGo flights by 10%","Government curbs IndiGo flights by 10%", "Satya Nadella pledges USD 17.5 billion",)
        val TextHeading = arrayOf(getString(R.string.Indiago), getString(R.string.Indiago),getString(R.string.Indiago),getString(R.string.Indiago),getString(R.string.Indiago),getString(R.string.Indiago),getString(R.string.Indiago))
        val inmg = arrayOf(R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img2,R.drawable.img)

        vivek = ArrayList()
        for (i in TextHeading.indices){
            val kuna = News(Text1[i], TextHeading[i], inmg[i])
            vivek.add(kuna)
        }

        val myAdapter = MyAdapter(vivek, this)
        kunal.layoutManager = LinearLayoutManager(this)   // 🔑 Added
                    // 🔑 Added
        kunal.adapter = myAdapter

        myAdapter.setItemClickListener(object: MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
               intent = Intent(this@MainActivity, NewsDetail::class.java)
                intent.putExtra("heading", vivek[position].NewHeading)
                intent.putExtra("image", vivek[position].NewImg)
                intent.putExtra("newsContent", vivek[position].NewsTile)
                startActivity(intent)
            }
        })
    }
}
