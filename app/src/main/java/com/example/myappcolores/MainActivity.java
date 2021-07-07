package com.example.myappcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<String> col = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridViewId);

        nombres.add("Azul");
        nombres.add("Rojo");
        nombres.add("Amarillo");
        nombres.add("Metal");
        nombres.add("Negro");
        nombres.add("Rosado");
        nombres.add("Naranja");
        nombres.add("Verde");
        nombres.add("Gris");
        nombres.add("Cafe");
        nombres.add("Purpura");
        nombres.add("Celeste");
        nombres.add("Marron");
        nombres.add("Magenta");
        nombres.add("Salmon");

        col.add("#0C4870");//azul
        col.add("#B31504");//rojo
        col.add("#F7DC6F");//amarillo
        col.add("#7F8C8D");//Metal
        col.add("#FF000000");//negro
        col.add("#EBDEF0");//rosado
        col.add("#E67E22");//naranja
        col.add("#229954");//verde
        col.add("#A6ACAF");//gris
        col.add("#7E5109");//cafe
        col.add("#5B2C6F");//purpura
        col.add("#5DADE2");//celeste
        col.add("#935116");//marron
        col.add("#AF7AC5");//magenta
        col.add("#F1948A");//salmon

        AdaptadorCol adaptadorCol = new AdaptadorCol(this, R.layout.vista_personalizada,nombres,col);
        gridView.setAdapter(adaptadorCol);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "A pulsado "+nombres.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MAColor.class);
                intent.putExtra("color", col.get(position));
                startActivity(intent);
            }
        });

    }

}