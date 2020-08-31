package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import com.example.nagaonhighschool.class8_subjectList.*

class subjectList_8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list_8)

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.class_8_sub)

        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_8_assamese::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_8_hindi::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_8_english::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_8_science::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_8_maths::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_8_socialscience::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_8_advancedmaths::class.java)
                        startActivity(intent)
                    }

                }
            }
        }
    }
}