package com.max.jsonstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.io.IOException
import java.io.InputStream

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        read_json()
    }
    fun read_json(){
        val jsntxt : TextView = findViewById(R.id.editTextTextPersonName)
        var json: String? = null
    try{
        val inputStream:InputStream = assets.open("answers.json")
        json = inputStream.bufferedReader().use { it.readText() }
        jsntxt.text = json
    }
    catch (e:IOException)
    {

    }
    }
}