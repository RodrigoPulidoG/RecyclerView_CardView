package com.example.rodpro.recyclerview_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fuente> lista = new ArrayList<>();
        lista.add(new Fuente("El Taj Mahal",R.drawable.uno, 0));
        lista.add(new Fuente("Sídney",R.drawable.dos, 0));
        lista.add(new Fuente("Tampa",R.drawable.tres, 0));
        lista.add(new Fuente("Coliseo Romano",R.drawable.cuatro, 0));
        lista.add(new Fuente("Zócalo",R.drawable.cinco, 0));
        lista.add(new Fuente("Torre Eiffel",R.drawable.seis, 0));
        lista.add(new Fuente("Toronto",R.drawable.siete, 0));


        RecyclerView contenedor = (RecyclerView)findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layout);


    }
}
