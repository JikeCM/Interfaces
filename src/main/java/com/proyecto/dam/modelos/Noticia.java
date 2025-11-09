package com.proyecto.dam.modelos;

public class Noticia {

    private String titulo;
    private String descripcion;
    private String imagenUrl;
    private String enlace;

    public Noticia(String titulo, String descripcion, String imagenUrl, String enlace) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public String getEnlace() {
        return enlace;
    }
}
