package com.example.msgshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tv_hello)
        textView.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondScreen::class.java).apply {
                putExtra("Name", "Harsh")
                putExtra("Age", "22")
                putExtra("Course", "B.Tech")
            })
        }

    }
}