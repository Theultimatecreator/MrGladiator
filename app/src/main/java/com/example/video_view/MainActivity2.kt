package com.example.video_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val list=ArrayList<List>()
        list.add(List("Title","R.drawable.img","text",R.drawable.img ) )
        list.add(List("Title","R.drawable.img","text", R.drawable.img_1) )
        list.add(List("Title","R.drawable.img","text",R.drawable.img ) )
        list.add(List("Title","R.drawable.img","text", R.drawable.img_1) )
        list.add(List("Title","R.drawable.img","text", R.drawable.img_1) )



        recaycler_view.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(list, this)
        recaycler_view.adapter = adapter

    }
    fun openItemDetail(product: List) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("product",product)
        startActivity(intent)
    }

}