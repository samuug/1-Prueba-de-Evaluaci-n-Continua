package org.example.Ejercicio1;

import java.util.Random;

public class AproximacionPi {

    public static double generarNumeroPi(long pasos) {
        int nCirculo = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                nCirculo++;
            }
        }
        double pi;
        return  pi = 4 * ((double) nCirculo / pasos);
    }

    public static long generarPasos(){
        Random random = new Random();
        long nPasos;
        nPasos = random.nextInt(100000000+1);
        return nPasos;
    }
}
