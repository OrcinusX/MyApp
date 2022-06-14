package com.example.orcinus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.security.spec.InvalidKeySpecException;

public class ElegirMateria extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_materia);
        ImageView Matematica;
        Matematica = findViewById(R.id.Mate);
        Matematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent M= new Intent(ElegirMateria.this,calculosCombinados1.class);
                startActivity(M);
            }
        });

    }
}