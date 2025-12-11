package com.example.recycler_view;

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (val vivek: ArrayList<News>,val context: Activity): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
private lateinit  var myListener:onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position:Int)
    }
    fun setItemClickListener(listener: onItemClickListener){
myListener=listener
    }



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
val  sharma= LayoutInflater.from(context).inflate(R.layout.each_row,parent,false)
        return MyViewHolder(sharma,myListener)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {

        holder.vivek_umesh.text=vivek[position].NewsTile
        holder.gupta.setImageResource(vivek[position].NewImg)
//        holder.Akash.text=vivek[position].NewHeading
    }

    override fun getItemCount(): Int {
       return vivek.size
    }

    class MyViewHolder(item: View,listener:onItemClickListener): RecyclerView.ViewHolder(item){
        val gupta=item.findViewById<ShapeableImageView>(R.id.img_type)
        val vivek_umesh=item.findViewById<TextView>(R.id.TextTile)

        init {
            item.setOnClickListener {
            listener.onItemClick(adapterPosition)
            }
        }


    }


}
