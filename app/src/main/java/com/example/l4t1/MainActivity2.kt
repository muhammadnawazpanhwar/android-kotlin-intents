package com.example.l4t1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val namer = intent.getStringExtra("name")
        val my_name_display = findViewById<TextView>(R.id.myNameRecieved)
        my_name_display.setText(namer)
    }
}