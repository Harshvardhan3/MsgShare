package com.example.msgshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val nameTextVIew = findViewById<TextView>(R.id.tv_name)
        val ageTextVIew = findViewById<TextView>(R.id.tv_age)
        val courseTextVIew = findViewById<TextView>(R.id.tv_course)

        nameTextVIew.text = intent.getStringExtra("Name")
        ageTextVIew.text = intent.getStringExtra("Age")
        courseTextVIew.text = intent.getStringExtra("Course")


    }
}