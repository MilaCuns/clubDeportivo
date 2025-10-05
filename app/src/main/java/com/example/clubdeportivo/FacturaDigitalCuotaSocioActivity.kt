package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ListarSociosCuotaVencidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar_socios_cuota_vencida)

       
        val btnPagarCuota = findViewById<Button>(R.id.btnPagarCuota)
        btnPagarCuota.setOnClickListener {
           
            val intent = Intent(this, PagarCuotaActivity::class.java)
            startActivity(intent)
        }

       
        val btnVerCarnet = findViewById<Button>(R.id.btnVerCarnet)
        btnVerCarnet.setOnClickListener {
            
            val intent = Intent(this, VerCarnetActivity::class.java)
            startActivity(intent)
        }

        
    }
}
