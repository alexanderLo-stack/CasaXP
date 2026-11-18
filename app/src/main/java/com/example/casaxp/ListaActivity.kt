
package com.example.casaxp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        // Abrir Agregar tarea
        val btnAgregar = findViewById<Button>(
            R.id.btnAgregarTarea
        )

        btnAgregar.setOnClickListener {
            startActivity(
                Intent(this, AgregarActivity::class.java)
            )
        }

        // Abrir Asistente IA
        val btnIA = findViewById<Button>(
            R.id.btnAsistenteIA
        )

        btnIA.setOnClickListener {
            startActivity(
                Intent(this, IAActivity::class.java)
            )
        }

        // Abrir detalle de una tarea
        val tareas = listOf(
            R.id.tarjetaTarea1,
            R.id.tarjetaTarea2,
            R.id.tarjetaTarea3
        )

        tareas.forEach { id ->
            val tarjeta = findViewById<LinearLayout>(id)

            tarjeta.setOnClickListener {
                startActivity(
                    Intent(this, DetalleActivity::class.java)
                )
            }
        }
    }
}
