package com.example.l4t1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }
    fun my_function(view: View){
        val myName = findViewById<EditText>(R.id.myName)
        val name = myName.text.toString()
        val intent1 = Intent(this, MainActivity2::class.java).apply{
            putExtra("name",name)
        }
        startActivity(intent)
    }
}


