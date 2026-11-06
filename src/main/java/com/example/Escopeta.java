package com.example;

public class Escopeta extends Arma {
    private double bonoSigilo;
    private final double bonoDanioAsegurado = 0.65;

    public Escopeta(double danio , int tiempoRecarga , int cantidadCargadores , double bonoSigilo) {
        super(danio, tiempoRecarga, cantidadCargadores);
        this.bonoSigilo = bonoSigilo;
    }

    public double bonoSigilo() {
        if (bonoSigilo <= 0)
            throw new IllegalArgumentException("El daño del bono de sigilo no puede ser negativo ni 0");

        double totalDanio = danio + bonoSigilo;
        double danioFinal = ((totalDanio / 2) * bonoDanioAsegurado) + totalDanio;
        return danioFinal;
    }

    public double getBonoSigilo() {
        return bonoSigilo;
    }

    public void setBonoSigilo(double bonoSigilo) {
        if (bonoSigilo <= 0)
            throw new IllegalArgumentException("El daño del bono de sigilo no puede ser negativo ni 0");
        this.bonoSigilo = bonoSigilo;
    }

    public double getBonoDanioAsegurado() {
        return bonoDanioAsegurado;
    }

    @Override
    public void disparar() {
        System.out.println("La Escopeta dispara");
    }

    @Override
    public void recargar() {
        System.out.println("La Escopeta recarga");
    }

    @Override
    public void reparar() {
        System.out.println("La Escopeta se reparo");
    }

    @Override
    public String toString() {
        return super.toString() + " Bono de sigilo: " + bonoSigilo;
    }

    
}
