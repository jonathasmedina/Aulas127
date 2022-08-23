package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUsuario, edSenha;
    Button btLogar;
    String usuario;
    String senha;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUsuario = findViewById(R.id.editTextUsuario);
        edSenha = findViewById(R.id.editTextSenha);
        btLogar = findViewById(R.id.button);
        tvResult  = findViewById(R.id.textView);

        //TODO validar campos

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("oncreate"," Clique no botão ok");

                 usuario = edUsuario.getText().toString();
                 senha = edSenha.getText().toString();

                Log.e("oncreate"," Usuario: " + usuario + ". " +
                        "Senha: " + senha);
                if(validar()){
                    Intent i = new Intent(
                            MainActivity.this,
                            MainActivity2.class
                    );
                    startActivity(i);
                }
            }
        });
    }

    private boolean validar() {
        if(usuario.trim().equals("")){
            edUsuario.setError("Digite!!!");
            return false;
        }
        if(senha.trim().equals("")){
            edSenha.setError("Digite!!!");
            return false;
        }
        return true;
    }
}