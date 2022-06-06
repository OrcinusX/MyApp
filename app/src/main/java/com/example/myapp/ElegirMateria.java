package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ElegirMateria extends AppCompatActivity
        // Necesario para clickear en las cards
        implements View.OnClickListener {

    // Crear vistas de las cartas (solo hay nombres por ahora)
    public CardView
            cardViewMat,
            cardViewEsi,
            cardViewBio,
            cardViewLen;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                     // Default al crear la actividad
        setContentView(R.layout.activity_elegir_materia);       // Default carga el layout

        // Carga el contenido de la carta
        // (CardView) lo convierte a vista desde el ID
        cardViewMat = findViewById(R.id.card_mat);
        cardViewEsi = findViewById(R.id.card_esi);
        cardViewBio = findViewById(R.id.card_bio);
        cardViewLen = findViewById(R.id.card_len);

        // Declara que se puedan hacer click y pase algo
        cardViewMat.setOnClickListener(this);
        cardViewEsi.setOnClickListener(this);
        cardViewBio.setOnClickListener(this);
        cardViewLen.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        // Variable intent 
        Intent i;
        //noinspection SwitchStatementWithTooFewBranches
        switch (v.getId()) {
            case R.id.card_mat:
                i = new Intent(this, ElegirTemaSearchAndList.class);
                startActivity(i);
                break;
            default:
                Toast.makeText(ElegirMateria.this, "Proximamente...", Toast.LENGTH_SHORT).show();
                Toast.makeText(ElegirMateria.this, "Click en: " + v.getId(), Toast.LENGTH_SHORT).show();
                break;

        }
    }
}