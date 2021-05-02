package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Jogar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogar);
    }


    int computador ;
    int jogador ;

       public void spapel(View view){
        jogador = 2;
        EscolheDoPc();
        verificar();
       }
       public void spedra(View view){
        jogador = 1;
        EscolheDoPc();
        verificar();
       }
       public void stesoura(View view) {
           jogador = 3;
           EscolheDoPc();
           verificar();
       }
         public  void verificar (){
             TextView msg = findViewById(R.id.txtresultad);
            if(computador == jogador){
                msg.setText("Empate");
            }
            else if(jogador - computador == -1 || jogador - computador == 2 ){
                msg.setText("Computador Venceu");
            }
            else{
                msg.setText("Jogador venceu");
            }

       }
    Random random = new Random();
       public void EscolheDoPc(){
           ImageView imgresultado = findViewById(R.id.resultado);
           computador = random.nextInt(3)+1;

           if(computador == 1)
               imgresultado.setImageResource(R.drawable.pedra);
           if(computador == 2)
               imgresultado.setImageResource(R.drawable.papel);
           if(computador == 3)
               imgresultado.setImageResource(R.drawable.tesoura);



       }
    public void sair(View view){
        Intent itent = new Intent(getApplicationContext(),terminou.class);
        startActivity(itent);
    }
    public void denovo(View view){
        Intent itent = new Intent(getApplicationContext(),Jogar.class);
        startActivity(itent);
    }
}