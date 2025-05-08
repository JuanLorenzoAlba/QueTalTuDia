package com.unaj.quetaltudia

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textResultado = findViewById<TextView>(R.id.textResultado)
        val respuesta = intent.getStringExtra("resultado")

        val mensaje = when (respuesta) {
            getString(R.string.respuesta1) -> getString(R.string.msg_excelente)
            getString(R.string.respuesta2) -> getString(R.string.msg_bueno)
            getString(R.string.respuesta3) -> getString(R.string.msg_malo)
            getString(R.string.respuesta4) -> getString(R.string.msg_pesimo)
            else -> "Respuesta no reconocida."
        }

        textResultado.text = mensaje
    }
}