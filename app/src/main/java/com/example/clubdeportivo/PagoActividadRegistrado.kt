package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PagoRegistradoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pago_registrado)

       
        val btnMostrarFactura = findViewById<Button>(R.id.btnMostrarFactura)
        btnMostrarFactura.setOnClickListener {
     
            val intent = Intent(this, FacturaDigitalActivity::class.java)
            startActivity(intent)
        }

       
    }
}
