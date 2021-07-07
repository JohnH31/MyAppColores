package com.example.myappcolores;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCol extends BaseAdapter {
    private Context context;
    private int referencia;
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<String> col = new ArrayList<>();

    public AdaptadorCol(Context context, int referencia, ArrayList<String> nombres, ArrayList<String> col) {
        this.context = context;
        this.referencia = referencia;
        this.nombres = nombres;
        this.col = col;
    }

    @Override
    public int getCount() {
        return nombres.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.vista_personalizada, null);
        String nom;
        String col;
        nom = this.nombres.get(position);
        col = this.col.get(position);
        TextView campoN;
        RelativeLayout campoI;
        campoN = v.findViewById(R.id.txtGrid);
        campoI = v.findViewById(R.id.layout1);
        campoN.setText(nom);
        campoI.setBackgroundColor(Color.parseColor(col));

        return v;
    }
}
