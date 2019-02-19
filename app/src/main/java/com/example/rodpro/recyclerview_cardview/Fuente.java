package com.example.rodpro.recyclerview_cardview;

/**
 * Created by RodPro on 19/2/2019.
 */

public class Fuente {

    String titulo;
    int imagen, estado;

    public Fuente(String titulo, int imagen , int estado) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
