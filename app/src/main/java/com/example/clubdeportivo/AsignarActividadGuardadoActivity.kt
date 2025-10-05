package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AsignarActividadGuardadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar_actividad_guardado)

        val btnAsignarOtra = findViewById<Button>(R.id.btnAsignarOtra)
        val btnPagarActividad = findViewById<Button>(R.id.btnPagarActividad)

        // Vuelve a la pantalla de Asignar Actividad
        btnAsignarOtra.setOnClickListener {
            val intent = Intent(this, AsignarActividadActivity::class.java)
            startActivity(intent)
        }

        // Pasa a la pantalla de Pagar Actividad
        btnPagarActividad.setOnClickListener {
            val intent = Intent(this, PagarCuotaActivity::class.java)
            startActivity(intent)
        }
    }
}
