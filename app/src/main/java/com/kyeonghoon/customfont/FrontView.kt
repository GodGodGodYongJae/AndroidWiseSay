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


        val binding = DataBindingUtil.setContentView<FrontviewBinding>(this, R.layout.frontview)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }


    }
}

