package com.example.jokenpooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText idJogador1;
    private EditText idJogador2;
    private TextView idVencedor;
    private TextView idNomeJogador1;
    private TextView idNomeJogador2;
    private ImageView idImg1;
    private ImageView idImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idJogador1 = findViewById(R.id.idJogador1);
        idJogador2 = findViewById(R.id.idJogador2);
        idVencedor = findViewById(R.id.idVencedor);
        idNomeJogador1 = findViewById(R.id.idNomeJogador1);
        idNomeJogador2 = findViewById(R.id.idNomeJogador2);

        idImg1 = findViewById(R.id.idImg1);
        idImg2 = findViewById(R.id.idImg2);

    }
    public void Jogar (View view){
        Random aleatorio = new Random();

        String jogador1 = idJogador1.getText().toString();
        String jogador2 = idJogador2.getText().toString();

        int IDnum1 = aleatorio.nextInt((3 - 1) + 1) + 1;
        int IDnum2 = aleatorio.nextInt((3 - 1) + 1) + 1;

        // 1 papel
        // 2 tesoura
        // 3 pedra

        idNomeJogador1.setText(jogador1);
        idNomeJogador2.setText(jogador2);

        //Casos de empate:

        if (IDnum1 == 1 && IDnum2 == 1 ){
            idVencedor.setText("EMPATE");
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.papel);
            idImg2.setImageResource(R.drawable.papel);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 2 && IDnum2 == 2 ){
            idVencedor.setText("EMPATE");
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.tesoura);
            idImg2.setImageResource(R.drawable.tesoura);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 3 && IDnum2 == 3 ){
            idVencedor.setText("EMPATE");
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.pedra);
            idImg2.setImageResource(R.drawable.pedra);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }

        //Casos que o jogador 1 ganha:

        else if (IDnum1 == 1 && IDnum2 == 3 ) {

            idVencedor.setText("O vencedor é: " + jogador1);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.papel);
            idImg2.setImageResource(R.drawable.pedra);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 2 && IDnum2 == 1 ) {

            idVencedor.setText("O vencedor é: " + jogador1);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.tesoura);
            idImg2.setImageResource(R.drawable.papel);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 3 && IDnum2 == 2 ) {

            idVencedor.setText("O vencedor é: " + jogador1);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.pedra);
            idImg2.setImageResource(R.drawable.tesoura);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }

        // Casos que o jogador 2 ganha:

        else if (IDnum1 == 3 && IDnum2 == 1 ) {

            idVencedor.setText("O vencedor é: " + jogador2);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.pedra);
            idImg2.setImageResource(R.drawable.papel);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 1 && IDnum2 == 2 ) {

            idVencedor.setText("O vencedor é: " + jogador2);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.papel);
            idImg2.setImageResource(R.drawable.tesoura);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
        else if (IDnum1 == 2 && IDnum2 == 3 ) {

            idVencedor.setText("O vencedor é: " + jogador2);
            idVencedor.setVisibility(View.VISIBLE);
            idImg1.setImageResource(R.drawable.tesoura);
            idImg2.setImageResource(R.drawable.pedra);
            idImg1.setVisibility(View.VISIBLE);
            idImg2.setVisibility(View.VISIBLE);
            idNomeJogador1.setVisibility(View.VISIBLE);
            idNomeJogador2.setVisibility(View.VISIBLE);
        }
    }
}