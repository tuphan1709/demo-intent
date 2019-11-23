package com.example.demo3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        button.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("ASD",editText.text.toString())
            startActivity(intent)
        }
    }

}
