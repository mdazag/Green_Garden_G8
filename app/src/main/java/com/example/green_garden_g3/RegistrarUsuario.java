package com.example.green_garden_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RegistrarUsuario extends AppCompatActivity {

    private EditText  fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        TextView iniciar = findViewById(R.id.tv_iniciar);
        Button login = findViewById(R.id.btn_registrarse);
        Intent sesion = new Intent(getApplicationContext(), MainActivity.class);
        Intent inicio = new Intent(getApplicationContext(), MainActivity.class);

        iniciar.setOnClickListener(view -> startActivity(inicio));
        login.setOnClickListener(view -> startActivity(sesion));

        fecha = findViewById(R.id.et_fecha);
        fecha.setOnClickListener(view -> {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(RegistrarUsuario.this, (view1, year1, month1, dayOfMonth) -> {
            String selectedDate = dayOfMonth + "/" + (month1 + 1) + "/" + year1;
            fecha.setText(selectedDate);
        }, year, month, day);

        datePickerDialog.show();
});
    }
}