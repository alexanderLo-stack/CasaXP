
package com.example.casaxp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Abrir pantalla de tareas
        val btnIngresar =
            findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {
            startActivity(
                Intent(this, ListaActivity::class.java)
            )
        }

        // Abrir pantalla de registro
        val btnRegistrarse =
            findViewById<Button>(R.id.btnRegistrarse)

        btnRegistrarse.setOnClickListener {
            startActivity(
                Intent(this, RegistroActivity::class.java)
            )
        }
    }
}
