package com.astorga.lista_de_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // creamos la variable que hara referencia a los widgets
    private TextView txtTitulo;
    private Button btnIniciarAPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Realizar las referencias
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciarAPP = findViewById(R.id.btnIniciarApp);

    }

    public void Saludar(View view)
    {
        Toast.makeText(this, "hiciste click", Toast.LENGTH_LONG).show();
    }
}