package com.example.green_garden_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Consumo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumo);

        Button retro = findViewById(R.id.btn_menu);
        Intent regresar = new Intent(getApplicationContext(), Menu.class);
        retro.setOnClickListener(view -> startActivity(regresar));
    }
}