package com.example.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PagarActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar_actividad)

        // RadioGroup y RadioButtons
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioEfectivo = findViewById<RadioButton>(R.id.radioButtonEfectivo)
        val radioTarjeta = findViewById<RadioButton>(R.id.radioButtonTarjeta)

        // EditText del monto
        val editMonto = findViewById<EditText>(R.id.editMonto)

        // Botón Pagar
        val btnPagar = findViewById<Button>(R.id.btnPagar)
        btnPagar.setOnClickListener {

            // Validar monto ingresado
            val montoStr = editMonto.text.toString()
            if (montoStr.isEmpty()) {
                Toast.makeText(this, "Por favor ingrese el monto a abonar", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Obtener modo de pago seleccionado
            val selectedRadioId = radioGroup.checkedRadioButtonId
            if (selectedRadioId == -1) {
                Toast.makeText(this, "Por favor seleccione un modo de pago", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val modoPago = when (selectedRadioId) {
                radioEfectivo.id -> "Efectivo"
                radioTarjeta.id -> "Tarjeta / Transferencia"
                else -> "Desconocido"
            }

            // Pasar datos a la pantalla de confirmación
            val intent = Intent(this, PagoRegistradoActivity::class.java)
            intent.putExtra("NOMBRE_ACTIVIDAD", "Nombre de Actividad")
            intent.putExtra("FECHA", "01/01/2025")
            intent.putExtra("IMPORTE", montoStr)
            intent.putExtra("MODO_PAGO", modoPago)
            startActivity(intent)
        }
    }
}
