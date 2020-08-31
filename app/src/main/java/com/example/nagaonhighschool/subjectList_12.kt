package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class subjectList_12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.class_streamchoose)

        val arts = findViewById<Button>(R.id.artbutton)
        val science = findViewById<Button>(R.id.sciencebutton)
        val commerce = findViewById<Button>(R.id.commercebutton)

        arts.setOnClickListener{
            val intent = Intent(this, subjectList_12_arts::class.java)
            startActivity(intent)
        }
        science.setOnClickListener{
            val intent = Intent(this, subjectList_12_science::class.java)
            startActivity(intent)
        }
        commerce.setOnClickListener{
            val intent = Intent(this, subjectList_12_comm::class.java)
            startActivity(intent)
        }
    }
}