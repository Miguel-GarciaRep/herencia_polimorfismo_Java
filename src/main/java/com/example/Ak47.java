package com.example;

public class Ak47 extends Arma {
    private double danioBalasLaser;
    private final double bonoDanioAsegurado = 0.3;

    public Ak47(double danio , int tiempoRecarga , int cantidadCargadores , double danioBalasLaser) {
        super(danioBalasLaser, tiempoRecarga, cantidadCargadores);
        if (danioBalasLaser <= 0)
            throw new IllegalArgumentException("El daño de las balas laser no puede ser negativo ni 0");
        this.danioBalasLaser = danioBalasLaser;
    }

    public double danioBalasLaser() {
        if (danioBalasLaser <= 0)
            throw new IllegalArgumentException("El daño de las balas laser no puede ser negativo ni 0");

        double totalDanio = danio + danioBalasLaser;
        double danioFinal = ((totalDanio / 2) * bonoDanioAsegurado) + totalDanio;
        return danioFinal;
    }

    public double getDanioBalasLaser() {
        return danioBalasLaser;
    }

    public void setDanioBalasLaser(double danioBalasLaser) {
        if (danioBalasLaser <=0)
            throw new IllegalArgumentException("El daño de las balas laser no puede ser negativo ni 0");
        this.danioBalasLaser = danioBalasLaser;
    }

    public double getBonoDanioAsegurado() {
        return bonoDanioAsegurado;
    }

    @Override
    public void disparar() {
        System.out.println("El Ak47 disparo");
    }

    @Override
    public void recargar() {
        System.out.println("El Ak47 recargo");
    }

    @Override
    public void reparar() {
        System.out.println("El Ak47 se reparo");
    }

    @Override
    public String toString() {
        return super.toString() + " Daño de balas laser: " + danioBalasLaser;
    }
}
