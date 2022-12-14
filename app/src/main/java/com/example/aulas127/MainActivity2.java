package com.example.aulas127;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    Intent intent;

    ArrayList<String> arrayListItens = new ArrayList<>();

    ArrayList<String> arrayListItensCopia;

    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        searchView = findViewById(R.id.searchView1);
        listView = findViewById(R.id.listView1);

        arrayListItens.add("Checkbox");
        arrayListItens.add("RadioButton");
        arrayListItens.add("Janela de Diálogo");
        arrayListItens.add("Calculadora");
        arrayListItens.add("Item 5");
        arrayListItens.add("Coisa 6");
        //TODO spinner

        arrayListItensCopia = new ArrayList<>(arrayListItens);

        arrayAdapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                arrayListItens
        );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i) {
                    case 0:
                        intent = new Intent(MainActivity2.this, MainActivityCheckbox.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity2.this, MainActivityRadio.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity2.this, MainActivityDialogo.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity2.this, MainActivityCalculadora.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        searchView.setIconified(false);
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                //Forma 1:
                //MainActivity2.this.arrayAdapter.getFilter().filter(s);

                //Forma 2:
                fazerUmaBusca(s);
                arrayAdapter.notifyDataSetChanged();

                return false;
            }
        });
    }

    //fazer uma busca, atualizar o arraylist
    private void fazerUmaBusca(String s) {
        arrayListItens.clear();

        s = s.toLowerCase();

        for (String item : arrayListItensCopia) {
            if (item.toLowerCase().contains(s))
                arrayListItens.add(item);
        }
    }
}