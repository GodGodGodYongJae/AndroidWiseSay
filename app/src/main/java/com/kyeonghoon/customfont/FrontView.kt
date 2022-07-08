package com.kyeonghoon.customfont


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kyeonghoon.customfont.databinding.FrontviewBinding


class FrontView : AppCompatActivity () {

    private lateinit var binding : FrontviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frontview)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("명언2.")
        sentenceList.add("명언3.")
        sentenceList.add("명언4.")
        sentenceList.add("명언5.")
        sentenceList.add("명언6.")
        sentenceList.add("명언7.")
        sentenceList.add("명언8.")




        val binding = DataBindingUtil.setContentView<FrontviewBinding>(this, R.layout.frontview)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodword.text =   sentenceList.random()
    }
}

