package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    final val trueFirstName = "viver"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnBack = findViewById<Button>(R.id.buttonBack)
        btnBack.setOnClickListener {
            onClickBackButton()
        }

        var btnSave = findViewById<Button>(R.id.buttonSave)
        btnSave.setOnClickListener {
            onClickSaveButton()
        }


    }

    private fun onClickBackButton() {
        val firstScreen = Intent(this, MainActivity::class.java)
        startActivity(firstScreen)
    }

    private fun onClickSaveButton() {
        val thirdScreen = Intent(this, MainActivity3::class.java)

        val firstNameET = findViewById<EditText>(R.id.etFirstname).text.toString()

        if (trueFirstName.equals(firstNameET)){
            thirdScreen.putExtra("Firstname", firstNameET)
            startActivity(thirdScreen)
        }
    }
}