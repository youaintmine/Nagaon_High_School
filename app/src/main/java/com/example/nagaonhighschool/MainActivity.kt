@file:Suppress("DEPRECATION")

package com.example.nagaonhighschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    companion object {
        const val SPLASH_DELAY = 2500
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }, SPLASH_DELAY.toLong())


    }

}