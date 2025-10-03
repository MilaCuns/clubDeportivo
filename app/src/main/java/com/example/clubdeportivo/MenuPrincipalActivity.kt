package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_principal)

        val btnRegistrarSocio = findViewById<Button>(R.id.btnRegistrarSocio)
        btnRegistrarSocio.setOnClickListener{
            val intent = Intent(this, RegistrarSocioActivity::class.java)
            startActivity(intent)
        }

        val btnAsignarActividad = findViewById<Button>(R.id.btnAsignarActividad)
        btnAsignarActividad.setOnClickListener {
            val intent = Intent(this, AsignarActividadActivity::class.java)
            startActivity(intent)
        }

        val btnListarSociosCuotaVencida = findViewById<Button>(R.id.btnListarSociosCuotaVencida)
        btnListarSociosCuotaVencida.setOnClickListener {
            val intent = Intent(this, ListarSociosCuotaVencidaActivity::class.java)
            startActivity(intent)
        }
    }
}