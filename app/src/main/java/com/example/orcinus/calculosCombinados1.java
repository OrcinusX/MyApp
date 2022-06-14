package com.example.orcinus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class calculosCombinados1 extends AppCompatActivity {
TextView cuenta,cuenta2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos_combinados1);
        cuenta = findViewById(R.id.cuenta);
        cuenta2 = findViewById((R.id.cuenta2));
        Random r = new Random();


          int aleatorio = r.nextInt(101);

        cuenta.setText(String.valueOf(aleatorio));
        cuenta2.setText(String.valueOf(aleatorio));

    }
}