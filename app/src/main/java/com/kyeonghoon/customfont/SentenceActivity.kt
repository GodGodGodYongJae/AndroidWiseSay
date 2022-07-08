package com.kyeonghoon.customfont

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)
        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("명언2.")
        sentenceList.add("명언3.")
        sentenceList.add("명언4.")
        sentenceList.add("명언5.")
        sentenceList.add("명언6.")
        sentenceList.add("명언7.")
        sentenceList.add("명언8.")

        val sentenceadapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter
    }
}