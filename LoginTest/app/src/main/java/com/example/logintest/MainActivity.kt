package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ZZZTEST", "Called on Create")


        btnSignUp = findViewById(R.id.button5)

        btnSignUp.setOnClickListener{
            Log.d("ZZZTEST", "Clicked Signup")
            var nextActivity: Intent
            nextActivity = Intent(this, MainActivity2::class.java)
            startActivity(nextActivity)
        }
    }
}