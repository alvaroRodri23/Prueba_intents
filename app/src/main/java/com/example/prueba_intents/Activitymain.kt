package com.example.prueba_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activitymain : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton=findViewById<Button>(R.id.Continuar)
        val Titulo=findViewById<EditText>(R.id.Titulo)
        val Paginas=findViewById<EditText>(R.id.Paginas)
        boton.setOnClickListener(){

            val titulo= intent.putExtra("Titulo",R.id.Titulo)
            val numpags=intent.putExtra("numpags",R.id.Paginas)
            startActivity(intent)


        }






    }




}