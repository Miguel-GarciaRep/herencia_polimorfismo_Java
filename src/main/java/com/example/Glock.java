package com.example;

public class Glock extends Arma {
    private double bonoDanio;

    public Glock (double danio , int tiempoRecarga , int cantidadCargadores , double bonoDanio) {
        super(danio , tiempoRecarga , cantidadCargadores);
        if (bonoDanio <= 0)
            throw new IllegalArgumentException("El bono de daño no puede ser negativo ni 0");
        this.bonoDanio = bonoDanio;
    }

    public double bonoDaño() {
        if (bonoDanio <= 0)
            throw new IllegalArgumentException("El bono de daño no puede ser negativo ni 0");
        double porcentajeBono = bonoDanio / 100;
        double calcularBonoPorDanio = danio * porcentajeBono;
        double danioFinal = danio + calcularBonoPorDanio;

        return  danioFinal;
    }

    public double getBonoDanio() {
        return bonoDanio;
    }

    public void setBonoDanio(double bonoDanio) {
        this.bonoDanio = bonoDanio;
    }

    @Override
    public void disparar() {
        System.out.println("La Glock dispara");;
    }

    @Override
    public void recargar() {
        System.out.println("La Glock recargo");;
    }

    @Override
    public void reparar() {
        System.out.println("la Glock se reparo");;
    }

    @Override
    public String toString() {
        return super.toString() + " Bono de daño: " + bonoDanio;
    }
}