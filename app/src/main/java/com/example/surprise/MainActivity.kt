package com.example.surprise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt = findViewById<EditText>(R.id.editText1)
        val pageant = findViewById<ImageButton>(R.id.button2)
        val btn = findViewById<Button>(R.id.button1)
        val str = edt.text.toString()
        pageant.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java).putExtra("input",str))
        }
        btn.setOnClickListener {
            if ()
        }
    }
}