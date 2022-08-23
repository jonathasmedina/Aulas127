package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCalculadora extends AppCompatActivity {

    Button btMais, btMenos, btMult, btDiv;
    EditText edNum1, edNum2;
    TextView textViewResult;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);

        btMais = findViewById(R.id.buttonSomar);
        btMenos = findViewById(R.id.buttonSubtrair);
        btMult = findViewById(R.id.buttonMultiplicar);
        btDiv = findViewById(R.id.buttonDividir);
        edNum1 = findViewById(R.id.editTextNum1);
        edNum2 = findViewById(R.id.editTextNum2);
        textViewResult = findViewById(R.id.textViewResultado);

        btMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //validar
                if (validar()) {
                    float result = Float.parseFloat(edNum1.getText().toString()) +
                            Float.parseFloat(edNum2.getText().toString());

                    //duas casas decimais
                    String resultString = String.format("%.2f", result);

                    textViewResult.setText(resultString);
                }
            }
        });
    }

    private boolean validar() {
        if (edNum1.getText().toString().trim().equals("")) {
            edNum1.setError("Informe valor");
            return false;
        }
        if (edNum2.getText().toString().trim().equals("")) {
            edNum2.setError("Informe valor");
            return false;
        }
        return true;
    }
}