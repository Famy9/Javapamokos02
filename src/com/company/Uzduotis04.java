package com.company;

import java.util.Scanner;

public class Uzduotis04 {
    public Uzduotis04() {
        System.out.println("Iveskite Savo svori:");
        Scanner skaneris = new Scanner(System.in);
        int svoris = skaneris.nextInt();
        System.out.println("Iveskite Savo ugi:");
        double ugis = skaneris.nextDouble();

    public static double KMI(int svoris, double ugis) {

        return (svoris / (ugis * ugis));

    }
}

}
