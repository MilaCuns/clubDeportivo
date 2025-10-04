package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PagarCuotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagar_cuota)

        val btnPagar = findViewById<Button>(R.id.btnPagar)
        btnPagar.setOnClickListener {
            val intent = Intent(this, PagoCuotaRegistradoActivity::class.java)
            startActivity(intent)
        }
    }
}