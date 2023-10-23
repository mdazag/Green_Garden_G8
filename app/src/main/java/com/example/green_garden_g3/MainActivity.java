package com.example.green_garden_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView registro = findViewById(R.id.tv_registro);
       TextView recuperar = findViewById(R.id.recuperar);

        Intent resgistra = new Intent(getApplicationContext(), RegistrarUsuario.class);
        Intent recupera = new Intent(getApplicationContext(), Recupera.class);

        registro.setOnClickListener(view -> startActivity(resgistra));
        recuperar.setOnClickListener(view -> startActivity(recupera));
    }
}