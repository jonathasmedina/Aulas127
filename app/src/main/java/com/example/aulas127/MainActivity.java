package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUsuario, edSenha;
    Button btLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUsuario = findViewById(R.id.editTextUsuario);
        edSenha = findViewById(R.id.editTextSenha);
        btLogar = findViewById(R.id.button);

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("oncreate"," Clique no botão ok");

                String usuario = edUsuario.getText().toString();
                String senha = edSenha.getText().toString();

                Log.e("oncreate"," Usuario: " + usuario + ". " +
                        "Senha: " + senha);

                //Toast.makeText(getApplicationContext(),"Usuario informado foi: " + usuario + ". " +"Senha digitada foi: " + senha,Toast.LENGTH_SHORT).show();

               Intent i = new Intent(
                       MainActivity.this,
                       MainActivity2.class
               );

               startActivity(i);

            }
        });




    }
}