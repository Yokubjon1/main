package com.example.main5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent2 = intent
        val name1 = intent2.getStringExtra("text1")
        val surname1 = intent2.getStringExtra("text2")
        val phone = intent2.getStringExtra("text3")
        txtview1.text = name1
        txtview2.text = surname1
        txtview3.text = phone
    }
}