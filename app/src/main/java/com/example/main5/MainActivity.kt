package com.example.main5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnok.setOnClickListener {
            val name = edttext1.text.toString()
            val surname = edttext2.text.toString()
            val phonenumer = edttext3.text.toString()
            val intent1 = Intent(this,MainActivity2::class.java)
            intent1.putExtra("text1",name)
            intent1.putExtra("text2",surname)
            intent1.putExtra("text3",phonenumer)
            startActivity(intent1)
        }
    }
}