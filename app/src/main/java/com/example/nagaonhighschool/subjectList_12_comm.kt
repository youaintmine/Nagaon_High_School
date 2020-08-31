package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import com.example.nagaonhighschool.class12_comm.*

class subjectList_12_comm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.commerce_higherclass)

        val text = findViewById<TextView>(R.id.commerce_class)
        text.setText(getString(R.string.wel_12_comm))
        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.comm_higher)

        setSingleEvent(mainGrid)
    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                when(final) {
                    0 -> {
                        val intent= Intent(this, class_12_comm_acc::class.java)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent= Intent(this, class_12_comm_busi_study::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent= Intent(this, class_12_comm_econ::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent= Intent(this, class_12_comm_retail::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent= Intent(this, class_12_comm_infotech::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent= Intent(this, class_12_comm_assamese::class.java)
                        startActivity(intent)
                    }
                    6-> {
                        val intent= Intent(this, class_12_comm_eng::class.java)
                        startActivity(intent)
                    }
                    7-> {
                        val intent= Intent(this, class_12_comm_alteng::class.java)
                        startActivity(intent)
                    }

                }
            }
        }
    }
}