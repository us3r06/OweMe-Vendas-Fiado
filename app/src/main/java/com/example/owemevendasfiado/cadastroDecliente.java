package com.example.owemevendasfiado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class cadastroDecliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_decliente);
        ConfigurarBotoes();
    }


    private void ConfigurarBotoes(){
        Button salvarCadastro = (Button) findViewById(R.id.salvarcadastro);

        salvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), RegistrarDivida.class));
            }
        });

    }
}
