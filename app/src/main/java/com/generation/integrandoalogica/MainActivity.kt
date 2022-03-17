package com.generation.integrandoalogica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botaod6 = findViewById<Button>(R.id.botaod6)
        val botaod12 = findViewById<Button>(R.id.botaod12)
        val botaod20 = findViewById<Button>(R.id.botaod20)



        botaod6.setOnClickListener {

            rolardados(6)
        }

        botaod12.setOnClickListener {

            rolardados(12)
        }


        botaod20.setOnClickListener {

            rolardados(20)
        }
    }
    fun rolardados(lados:Int){

        var valor = (1..lados).random()


        val textoresultado=findViewById<TextView>(R.id.texto1)


        textoresultado.text=valor.toString()

    }

}