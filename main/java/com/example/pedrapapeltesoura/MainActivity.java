package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view){
        Intent itent = new Intent(getApplicationContext(), Jogar.class);
        startActivity(itent);
    }
    public void sair(View view){
        Intent itent = new Intent(getApplicationContext(), terminou.class);
        startActivity(itent);
    }


}