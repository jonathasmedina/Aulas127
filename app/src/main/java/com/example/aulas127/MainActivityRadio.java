package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivityRadio extends AppCompatActivity {

    Button bt;
    RadioGroup radioGroup;
    String texto="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio);

        bt  = findViewById(R.id.buttonRadio);
        radioGroup  = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Toast.makeText(getApplicationContext(),
                        "alterei radio",
                        Toast.LENGTH_SHORT).show();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radioButton:
                        texto = "RadioButton 1 marcado";
                        break;
                    case R.id.radioButton2:
                        texto = "RadioButton 2 marcado";
                        break;
                    case R.id.radioButton3:
                        texto = "RadioButton 3 marcado";
                        break;
                }
                Toast.makeText(getApplicationContext(),
                        texto,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}