package com.example.unidad3ejercicio7_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ActivityResultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        tvResultado.text = "Resultado: ${intent.getDoubleExtra("Resultado", 0.0)}"
    }
}