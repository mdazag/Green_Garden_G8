package com.example.green_garden_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menu = findViewById(R.id.btn_inicio);
        TextView registro = findViewById(R.id.tv_registro);

        Intent resgistra = new Intent(getApplicationContext(), RegistrarUsuario.class);
        Intent ingresa = new Intent(getApplicationContext(), Menu.class);

        registro.setOnClickListener(view -> startActivity(resgistra));
        menu.setOnClickListener(view -> startActivity(ingresa));

    }
}