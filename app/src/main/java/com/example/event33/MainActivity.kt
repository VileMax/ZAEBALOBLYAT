package com.example.event33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add_button : Button = findViewById(R.id.add_button)

        add_button.setOnClickListener {
            val i = Intent(this,AddActivity::class.java)
            startActivity(i)
        }
    }
}