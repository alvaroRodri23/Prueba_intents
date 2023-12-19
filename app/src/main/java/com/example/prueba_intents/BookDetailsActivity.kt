package com.example.prueba_intents


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prueba_intents.R.id.Continuar2

class BookDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bookdetails)

        val boton=findViewById<Button>(Continuar2)
        boton.setOnClickListener(){


            val titulo=intent.getStringExtra("titulo")
            val numpag=intent.getStringExtra("numpag")

            intent.putExtra("titulo",R.id.Titulo)
            intent.putExtra("numpag",R.id.Paginas)
            val autor=intent.putExtra("Autor",R.id.Autor)
            val año=intent.putExtra("año",R.id.Año)
            startActivity(intent)

        }
        // val Libro=intent.getParcelableExtra<Book>("libro")

    }
}



