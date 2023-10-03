package com.example.logintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val firstNameTV = findViewById<TextView>(R.id.firstNameActivity3)

        val firstNameExtra = intent.getStringExtra("Firstname").toString()

        firstNameTV.text = firstNameExtra
    }
}