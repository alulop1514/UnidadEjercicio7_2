package com.example.unidad3ejercicio7_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayOperaciones = arrayOf("Sumar", "Restar", "Multiplicar", "Dividir")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayOperaciones)
        spinner.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        btnOperar.setOnClickListener {
            if (etNum1.text.toString() != "" && etNum2.text.toString() != "") {
                val resultado = when (spinner.selectedItem) {
                    "Sumar" -> etNum1.text.toString().toDouble() + etNum2.text.toString().toDouble()
                    "Restar" -> etNum1.text.toString().toDouble() - etNum2.text.toString().toDouble()
                    "Multiplicar" -> etNum1.text.toString().toDouble() * etNum2.text.toString().toDouble()
                    "Dividir" -> etNum1.text.toString().toDouble() / etNum2.text.toString().toDouble()
                    else -> 0
                }
                val intent = Intent(applicationContext, ActivityResultado::class.java)
                intent.putExtra("Resultado", resultado)
                startActivity(intent)
            }
        }
    }
}