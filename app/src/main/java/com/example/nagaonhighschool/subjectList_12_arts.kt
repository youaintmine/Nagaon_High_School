package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import com.example.nagaonhighschool.class12_arts.*

class subjectList_12_arts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arts_higherclass)

        val text = findViewById<TextView>(R.id.arts_class)
        text.setText(getString(R.string.class_12_arts))

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.arts_higher)

        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for (x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final: Int = x
            cardView.setOnClickListener {

                when (final) {
                    0 -> {
                        val intent = Intent(this, class_12_arts_econ::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(this, class_12_arts_assamese::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(this, class_12_arts_alteng::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(this, class_12_arts_eng::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(this, class_12_arts_history::class.java)
                        startActivity(intent)
                    }
                    5-> {
                        val intent = Intent(this, class_12_arts_edu::class.java)
                        startActivity(intent)
                    }
                    6 -> {
                        val intent = Intent(this, class_12_arts_polscience::class.java)
                        startActivity(intent)
                    }
                    7 -> {
                        val intent = Intent(this, class_12_arts_log_phil::class.java)
                        startActivity(intent)
                    }
                    8 -> {
                        val intent = Intent(this, class_12_arts_geography::class.java)
                        startActivity(intent)
                    }
                    9 -> {
                        val intent = Intent(this, class_12_arts_infotech::class.java)
                        startActivity(intent)
                    }
                    10 -> {
                        val intent = Intent(this, class_12_arts_retail::class.java)
                        startActivity(intent)
                    }
                    11 -> {
                        val intent = Intent(this, class_12_arts_sanskrit::class.java)
                        startActivity(intent)
                    }


                }
            }
        }
    }
}