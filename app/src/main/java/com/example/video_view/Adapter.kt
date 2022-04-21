package com.example.video_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView
import java.io.Serializable


class Adapter(val products: ArrayList<List>, val activity2: MainActivity2) : RecyclerView.Adapter<Adapter.myHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.myHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.custom_view, parent, false)
        return myHolder(v)
    }

    override fun onBindViewHolder(holder: myHolder, position: Int) {
        holder.productItems(products [position])
    }
    override fun getItemCount(): Int {
        return products.size
    }


    inner class myHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun productItems(product:List) {
            val foto = itemView.findViewById<ImageView>(R.id.image_View)
            val name = itemView.findViewById<TextView>(R.id.Title)
            val text2 = itemView.findViewById<TextView>(R.id.Distecoin)
            val text3 = itemView.findViewById<TextView>(R.id.text3)
            val layfull = itemView.findViewById<CardView>(R.id.postLayout)

            foto.setImageResource(product.imageView)
            name.setText(product.title)
            text2.setText(product.discraption)
            text3.setText(product.text3)

            layfull.setOnClickListener {
               activity2.openItemDetail(product)
            }
        }


    }


}
class List (var title:String,var discraption:String,var text3:String,var imageView:Int):
    Serializable {

}