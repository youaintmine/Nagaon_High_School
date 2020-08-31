package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import com.example.nagaonhighschool.class7_subjectList.*

class subjectList_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list_7)

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.class_7_sub)

        setSingleEvent(mainGrid)
    }
    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_7_assamese::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_7_hindi::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_7_english::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_7_science::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_7_maths::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_7_socialscience::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_7_advancedmaths::class.java)
                        startActivity(intent)
                    }


                }
            }
        }
    }
}