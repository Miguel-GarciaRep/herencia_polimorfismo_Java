package com.example;

public class Main {
    public static void main(String[] args) {
        Glock glock1 = new Glock(20,2,3,0.1);

        System.out.println(glock1);
        System.out.println(glock1.getBonoDanio());
        System.out.println(glock1.getCantidadCargadores());

        Ak47 ak1 = new Ak47(50, 1, 7, 0.5);

        System.out.println(ak1);
        System.out.println(ak1.getDanioBalasLaser());
        System.out.println(ak1.getCantidadCargadores());

        Escopeta escopeta1 = new Escopeta(100, 5, 5, 0.7);

        System.out.println(escopeta1);
        System.out.println(escopeta1.getBonoSigilo());
        System.out.println(escopeta1.getCantidadCargadores());
    }
}