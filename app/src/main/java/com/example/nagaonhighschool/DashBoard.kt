package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_subject_list_6.*

class DashBoard : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        val mainGrid: GridLayout = findViewById<GridLayout>(R.id.class_grid)

        setSingleEvent(mainGrid)

    }

//    private fun setToggleEvent (mainGrid:GridLayout) {    }

    private fun setSingleEvent (mainGrid: GridLayout) {
        for( x in 0 until mainGrid.childCount) {
            val cardView = mainGrid.getChildAt(x)

            val final:Int = x
            cardView.setOnClickListener {

                        when(final) {
                            0 -> {
                                val intent= Intent(this, subjectList_6::class.java)
                                startActivity(intent)
                            }
                            1 -> {
                                val intent= Intent(this, subjectList_7::class.java)
                                startActivity(intent)
                            }
                            2 -> {
                                val intent= Intent(this, subjectList_8::class.java)
                                startActivity(intent)
                            }
                            3 -> {
                                val intent= Intent(this, subjectList_9::class.java)
                                startActivity(intent)
                            }
                            4 -> {
                                val intent= Intent(this, subjectList_10::class.java)
                                startActivity(intent)
                            }
                            5 -> {
                                val intent= Intent(this, subjectList_11::class.java)
                                startActivity(intent)
                            }
                            6 -> {
                                val intent= Intent(this, subjectList_12::class.java)
                                startActivity(intent)
                            }
                        }
            }
        }
    }

}