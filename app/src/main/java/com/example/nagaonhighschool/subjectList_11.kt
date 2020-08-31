package com.example.nagaonhighschool

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class subjectList_11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.class_streamchoose)

        val arts = findViewById<Button>(R.id.artbutton)
        val science = findViewById<Button>(R.id.sciencebutton)
        val commerce = findViewById<Button>(R.id.commercebutton)

        arts.setOnClickListener{
            val intent = Intent(this, subjectList_11_arts::class.java)
            startActivity(intent)
        }
        science.setOnClickListener{
            val intent = Intent(this, subjectList_11_science::class.java)
            startActivity(intent)
        }
        commerce.setOnClickListener{
            val intent = Intent(this, subjectList_11_comm::class.java)
            startActivity(intent)
        }
    }
}