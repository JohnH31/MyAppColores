package com.example.myappcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MAColor extends AppCompatActivity {
    RelativeLayout vista;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macolor);
        vista = findViewById(R.id.layout2);
        texto = findViewById(R.id.txtColor);
        this.dato();
    }
    private void dato(){
        Bundle bundle = getIntent().getExtras();
        String color = bundle.getString("color");
        this.vista.setBackgroundColor(Color.parseColor(color));
        String cole = bundle.getString("color");
        this.texto.setText(cole);
    }
}