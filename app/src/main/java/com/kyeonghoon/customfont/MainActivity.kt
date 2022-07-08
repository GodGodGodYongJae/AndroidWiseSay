package com.kyeonghoon.customfont

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<ListViewModel>()
//
//
//        list_item.add(ListViewModel("제목1","나는 내용1"))
//        list_item.add(ListViewModel("제목2","나는 내용2"))
//        list_item.add(ListViewModel("제목3","나는 내용3"))
//        list_item.add(ListViewModel("제목4","나는 내용4"))
//
//        val listview = findViewById<ListView>(R.id.mainListView)
//        val listadapter = ListViewAdapter(list_item)
//        listview.adapter = listadapter
    }

    override fun onBackPressed() {
        if(isDouble == true)
        {
            //finish()
            super.onBackPressed()
        }
        isDouble = true
        Toast.makeText(this,"종료하실려면 한번 더 눌러주세요!.",Toast.LENGTH_LONG).show()
        Handler().postDelayed(Runnable {
            isDouble = false
        },2000)

    }
}