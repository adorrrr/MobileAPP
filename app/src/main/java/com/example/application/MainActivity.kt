package com.example.hellotoastapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var textViewCount: TextView? = null
    private var count: Int = 0

    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCount = findViewById(R.id.textViewCount)
        val buttonHelloToast: Button = findViewById(R.id.buttonHelloToast)
        val buttonToast: Button = findViewById(R.id.buttonToast)

        buttonHelloToast.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Hello Toast!", Toast.LENGTH_SHORT).show()
            }
        })

        buttonToast.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "TOAST", Toast.LENGTH_SHORT).show()
            }
        })

        textViewCount.setOnClickListener(object : OnClickListener() {
            @Override
            fun onClick(v: View?) {
                count++
                textViewCount.setText(String.valueOf(count))
            }
        })
    }
}