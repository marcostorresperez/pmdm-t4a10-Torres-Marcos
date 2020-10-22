package com.example.pmdm_t4a10_torres_marcos;

public class Arma {
    private String nombre;
    private String dañoCuerpo;
    private String dañoCabeza;
    private String nombreAbreviado;
    private String recarga;
    private int categoria;
    private String web;

    public Arma(String nombre, String dañoCuerpo, String dañoCabeza, String nombreAbreviado, String recarga, int categoria, String web) {
        this.nombre = nombre;
        this.dañoCuerpo = dañoCuerpo;
        this.dañoCabeza = dañoCabeza;
        this.nombreAbreviado = nombreAbreviado;
        this.recarga = recarga;
        this.categoria = categoria;
        this.web = web;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDañoCuerpo() {
        return dañoCuerpo;
    }

    public void setDañoCuerpo(String dañoCuerpo) {
        this.dañoCuerpo = dañoCuerpo;
    }

    public String getDañoCabeza() {
        return dañoCabeza;
    }

    public void setDañoCabeza(String dañoCabeza) {
        this.dañoCabeza = dañoCabeza;
    }

    public String getRecarga() {
        return recarga;
    }

    public void setRecarga(String recarga) {
        this.recarga = recarga;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNombreAbreviado() {
        return nombreAbreviado;
    }

    public void setNombreAbreviado(String nombreAbreviado) {
        this.nombreAbreviado = nombreAbreviado;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return nombre + '\n' + "Daño Cuerpo:" + dañoCuerpo + " Daño Cabeza:" + dañoCabeza + '\n' +
                "Tiempo Recarga:" + recarga + "seg";
    }
}
