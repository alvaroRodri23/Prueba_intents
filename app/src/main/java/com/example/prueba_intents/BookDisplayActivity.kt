package com.example.prueba_intents


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val titulo=intent.getStringExtra("titulo")
        val numpags=intent.getStringExtra("numpag")
        val autor=intent.getStringExtra("titulo")
        val año=intent.getStringExtra("numpag")
    }
}