package org.example;

import org.example.Ejercicio1.AproximacionPi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        do {
            System.out.println("1.- Práctica 1. Obtención de una aproximación al número pi");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El valor de pi es: " + AproximacionPi.generarNumeroPi(AproximacionPi.generarPasos()));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }while (!salir);
    }
}