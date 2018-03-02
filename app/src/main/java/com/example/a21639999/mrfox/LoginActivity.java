package com.example.a21639999.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void continuar(View view) {
        Intent i = new Intent(LoginActivity.this, MyMain.class);
        startActivity(i);
        finish();
    }
}
