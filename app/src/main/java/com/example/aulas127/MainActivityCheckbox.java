package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivityCheckbox extends AppCompatActivity {

    private Button bt;
    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_checkbox);

        bt  = findViewById(R.id.buttonCheckBox);
        checkBox1  = findViewById(R.id.checkBox);
        checkBox2  = findViewById(R.id.checkBox2);
        checkBox3  = findViewById(R.id.checkBox3);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked())
                Toast.makeText(getApplicationContext(),
                        "cliquei no checkbox",
                        Toast.LENGTH_SHORT).show();
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(checkBox1.isChecked())
                   Toast.makeText(getApplicationContext(),
                           "CheckBox 1 checado",
                           Toast.LENGTH_SHORT).show();
            }
        });
    }
}