package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class AsignarActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignar_actividad)

        val grupoActividades = findViewById<RadioGroup>(R.id.grupoActividades)
        val etDni = findViewById<EditText>(R.id.etDni)
        val btnAsignar = findViewById<Button>(R.id.btnAsignar)
        val btnPagar = findViewById<Button>(R.id.btnPagar)

        // Botón para asignar actividad
        btnAsignar.setOnClickListener {
            val intent = Intent(this, AsignarActividadGuardadoActivity::class.java)
            startActivity(intent)
        }

        // Botón para ir a la pantalla de pago
        btnPagar.setOnClickListener {
            val intent = Intent(this, PagarCuotaActivity::class.java)
            startActivity(intent)
        }
    }
}
