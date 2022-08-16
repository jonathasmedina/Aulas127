package com.example.aulas127;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityDialogo extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialogo);

        bt  = findViewById(R.id.buttonDialogo);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder janela = new AlertDialog.Builder(MainActivityDialogo.this);

                janela.setTitle("Título da janela");
                janela.setMessage("Mensagem da janela de diálogo");

                //janela.setNeutralButton("Botão que não faz nada",null);

                janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                janela.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //TODO dar ação para este elemento
                    }
                });

                janela.show();

            }
        });
    }
}