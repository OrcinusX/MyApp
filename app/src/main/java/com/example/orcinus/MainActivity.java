package com.example.orcinus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtmensaje,boton,edad,cardumen;
    int duracion = 2000;
    int despues =2000;
    int contador = 0;
    Button ssss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlphaAnimation fadeIn = new AlphaAnimation(0.0f,1.0f);
        fadeIn.setDuration(duracion);
        fadeIn.setStartOffset(despues);
        fadeIn.setFillAfter(true);

        txtmensaje =  (TextView)findViewById(R.id.textHola);
        boton =  (TextView)findViewById(R.id.botonSiguiente);
        edad =  (TextView)findViewById(R.id.editTextNumber);
        cardumen =  (TextView)findViewById(R.id.textCardumen);
        ssss=(Button)findViewById(R.id.botonSiguiente);

        ssss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, Login.class);
                startActivity(i);
            }
        });

        AlphaAnimation fadeOut = new AlphaAnimation(1.0f,0.0f);
        fadeOut.setDuration(duracion);
        fadeOut.setStartOffset(despues);
        fadeOut.setFillAfter(true);

        txtmensaje.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (contador == 0) {
                    txtmensaje.startAnimation(fadeOut);

                    contador++;
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                boton.startAnimation(fadeIn);
                edad.startAnimation(fadeIn);
                cardumen.startAnimation(fadeIn);
                edad.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });






    }
}