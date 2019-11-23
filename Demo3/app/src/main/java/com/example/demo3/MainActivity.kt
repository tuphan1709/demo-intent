package com.example.demo3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("#### create 1")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.type="text/plain"
            startActivity(intent)
        }

        val user = intent.getStringExtra("ASD")
        text_feedback.text = user
    }

    override fun onDestroy() {
        super.onDestroy()
        println("#### destroy 1")
    }
}