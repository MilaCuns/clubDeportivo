package com.example.clubdeportivo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AsignarActividadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asignar_actividad);

        Button btnAsignar = findViewById(R.id.btnAsignar);
        btnAsignar.setOnClickListener(v -> {
            Intent intent = new Intent(AsignarActividadActivity.this, AsignarActividadGuardadoActivity.class);
            startActivity(intent);
        });
    }
}
