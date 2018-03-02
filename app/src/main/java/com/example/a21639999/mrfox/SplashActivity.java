package com.example.a21639999.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        texto = findViewById(R.id.textsplash);

        Typeface fuenteTitulo = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        texto.setTypeface(fuenteTitulo);
        texto.setTextSize(56);

        Animation traslateTitulo = AnimationUtils.loadAnimation(this, R.anim.animationtitulo);
        texto.startAnimation(traslateTitulo);

                arrancar();
    }

    public void arrancar(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
