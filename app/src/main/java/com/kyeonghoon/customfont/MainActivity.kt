package com.kyeonghoon.customfont

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()


        list_item.add(ListViewModel("제목1","나는 내용1"))
        list_item.add(ListViewModel("제목2","나는 내용2"))
        list_item.add(ListViewModel("제목3","나는 내용3"))
        list_item.add(ListViewModel("제목4","나는 내용4"))

        val listview = findViewById<ListView>(R.id.mainListView)
        val listadapter = ListViewAdapter(list_item)
        listview.adapter = listadapter
    }
}