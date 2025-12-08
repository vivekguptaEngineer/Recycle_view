package com.example.recycler_view;

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (val kunal : ArrayList<News>,val context: Activity): RecyclerView.Adapter<MyAdapter.MyviewHolder>(){
    class MyviewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val ben=ItemView.findViewById<TextView>(R.id.tvheading_title)
        val img=ItemView.findViewById<ShapeableImageView>(R.id.heading_img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyviewHolder {
        val krishna= LayoutInflater.from(context).inflate(R.layout.each_row,parent,false)
        return MyviewHolder(krishna)


    }

    override fun onBindViewHolder(holder: MyAdapter.MyviewHolder, position: Int) {
        var current=kunal[position]
        holder.ben.text=current.newHeading
        holder.img.setImageResource(kunal[position].newImage)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, News::class.java)
            intent.putExtra("heading", current.newHeading)
            intent.putExtra("image", current.newImage)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return kunal.size
    }

}