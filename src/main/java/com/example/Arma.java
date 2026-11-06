package com.example;

public class Arma {
    protected double danio;
    protected int tiempoRecarga;
    protected int cantidadCargadores;

    public Arma(double danio , int tiempoRecarga , int cantidadCargadores) {
        if (danio <= 0 || tiempoRecarga <= 0 || cantidadCargadores < 0)
            throw new IllegalArgumentException("Estadisticas fuera de control de calidad");
        this.danio = danio;
        this.tiempoRecarga = tiempoRecarga;
        this.cantidadCargadores = cantidadCargadores;
    }

    public void disparar() {
        System.out.println("El arma dispara");
    }

    public void recargar() {
        System.out.println("El arma recarga");
    }

    public void reparar() {
        System.out.println("El arma se reparo");
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        if (danio <= 0)
            throw new IllegalArgumentException("El arma no puede tener daño negativo ni 0");
        this.danio = danio;
    }

    public int getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(int tiempoRecarga) {
        if (tiempoRecarga <= 0)
            throw new IllegalArgumentException("El tiempo de recarga no puede ser negativo o 0");
        this.tiempoRecarga = tiempoRecarga;
    }

    public int getCantidadCargadores() {
        return cantidadCargadores;
    }

    public void setCantidadCargadores(int cantidadCargadores) {
        if (cantidadCargadores < 0)
            throw new IllegalArgumentException("La cantidad de cargadores no puede ser menor a 0");
        this.cantidadCargadores = cantidadCargadores;
    }

    @Override
    public String toString() {
        return "Arma [danio=" + danio + ", tiempoRecarga=" + tiempoRecarga + ", cantidadCargadores="
                + cantidadCargadores + "]";
    }
}
