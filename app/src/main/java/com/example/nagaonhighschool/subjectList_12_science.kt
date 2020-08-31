package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import com.example.nagaonhighschool.class12_science.*

class subjectList_12_science : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.science_higherclass)

        val text = findViewById<TextView>(R.id.science_class)
        text.setText(getString(R.string.wel_science_12))

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.science_higher)
        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_12_science_phy::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_12_science_chem::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_12_science_maths::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_12_science_bio::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_12_science_infotech::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_12_science_assamese::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_12_science_eng::class.java)
                        startActivity(intent)
                    }
                    7-> {
                        val intent= Intent(this, class_12_science_alteng::class.java)
                        startActivity(intent)
                    }

                }
            }
        }
    }
}