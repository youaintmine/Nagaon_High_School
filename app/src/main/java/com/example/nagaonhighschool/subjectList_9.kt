package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import com.example.nagaonhighschool.class9_subjectList.*

class subjectList_9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject_list_9)

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.class_9_sub)

        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_9_assamese::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_9_hindi::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_9_english::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_9_science::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_9_maths::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_9_socialscience::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_9_advancedmaths::class.java)
                        startActivity(intent)
                    }
                    7-> {
                        val intent= Intent(this, class_9_geography::class.java)
                        startActivity(intent)
                    }
                    8-> {
                        val intent= Intent(this, class_9_infotech::class.java)
                        startActivity(intent)
                    }
                    9-> {
                        val intent= Intent(this, class_9_retail::class.java)
                        startActivity(intent)
                    }
                    10-> {
                        val intent= Intent(this, class_9_sanskrit::class.java)
                        startActivity(intent)
                    }
                    

                }
            }
        }
    }
}