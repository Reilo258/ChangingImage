package com.example.empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.jablko);
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.bear);
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.pies);
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            findViewById<ImageView>(R.id.zdj).setImageResource(R.drawable.petla);
        }
    }
}