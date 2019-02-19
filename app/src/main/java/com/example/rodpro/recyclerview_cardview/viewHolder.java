package com.example.rodpro.recyclerview_cardview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by RodPro on 19/2/2019.
 */

public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    Button btn1, btn2;
    ImageView imagen;
    TextView titulo;
    List<Fuente> ListaObjeto;

    public viewHolder(View itemView, List<Fuente> datos) {
        super(itemView);

        btn1 = (Button) itemView.findViewById(R.id.btn1);
        btn2 = (Button) itemView.findViewById(R.id.btn2);
        imagen = (ImageView) itemView.findViewById(R.id.imagen);
        titulo = (TextView) itemView.findViewById(R.id.texto);
        ListaObjeto = datos;

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        Fuente objeto = ListaObjeto.get(position);

        if (view.getId()== btn1.getId()){
            Toast.makeText(btn1.getContext(),"Irás a "+objeto.getTitulo(),Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(btn1.getContext(),"No te gusta "+objeto.getTitulo(),Toast.LENGTH_LONG).show();
        }

    }
}
