package com.max.jsonstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val button:Button = findViewById(R.id.button)
        button.setOnClickListener {
            checkInput()
        }
    }
    private fun checkInput(){
        val serverPort:EditText= findViewById(R.id.numberText)
        val iPPort: EditText = findViewById(R.id.numberText2)
        val timeOutServer: EditText = findViewById(R.id.numberText3)
        if (inputCheck(serverPort.toString(),iPPort.toString(),timeOutServer.toString()))  {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        else {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        }
    }
    private fun inputCheck(serverPort: String, iPPort: String, timeOutServer: String): Boolean {
        return (!serverPort.isEmpty() && !iPPort.isEmpty() && !timeOutServer.isEmpty())
    }
}

