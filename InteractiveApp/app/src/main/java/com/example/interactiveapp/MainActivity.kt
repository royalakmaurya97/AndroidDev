package com.example.interactiveapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)

        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener {
            // Change to light mode
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
        }
        buttonDark.setOnClickListener {
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
        }
    }
}
