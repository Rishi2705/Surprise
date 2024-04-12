package com.example.surprise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv = findViewById<TextView>(R.id.tv1)
        var txt = tv.text.toString()
        val btn2 = findViewById<Button>(R.id.button2)
        txt+= intent.getStringExtra("inputx")
        tv.text =txt
        btn2.setOnClickListener {
            startActivity(intent)
        }
    }
}