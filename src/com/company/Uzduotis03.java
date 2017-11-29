package com.company;

import java.util.Scanner;

public class Uzduotis03 {

    public Uzduotis03() {


        //Paprasyti ivesti du skaicius
        System.out.println("Iveskite 2 skacius:");
        Scanner skaitytuvas = new Scanner(System.in);

        float a = skaitytuvas.nextFloat();
        float b = skaitytuvas.nextFloat();

        System.out.println(suma(a, b));
        System.out.println(skirtumas((int) a, (int) b));

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int skirtumas(int a, int b) {

        return a - b;
    }
}