package com.zinoview.githubaactionsjunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.first_tv).setOnClickListener {
            findViewById<TextView>(R.id.second_tv).text = "Second new text"
        }

    }
}