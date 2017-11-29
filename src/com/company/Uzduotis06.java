package com.company;

import java.util.Scanner;

public class Uzduotis06 {
    public Uzduotis06() {
        System.out.println("Iveskite du skaicius");
        Scanner skaneris = new Scanner(System.in);
        float a = skaneris.nextFloat();
        float b = skaneris.nextFloat();

        System.out.println("Suma(int):" + Suma((int) a, (int) b));
        System.out.println("Suma(float):" + Suma((float) a, (float) b));

        System.out.println("Skirtumas(int):" + Skirtumas((int) a, (int) b));
        System.out.println("Skirtumas(float):" + Skirtumas((float) a, (float) b));

        System.out.println("Sandauga(int):" + Sandauga((int) a, (int) b));
        System.out.println("Sandauga(float):" + Sandauga((float) a, (float) b));

        System.out.println("Dalyba(int):" + Dalyba((int) a, (int) b));
        System.out.println("Dalyba(float):" + Dalyba((float) a, (float) b));
    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static float Suma(float a, float b) {
        return a + b;
    }

    public static int Skirtumas(int a, int b) {
        return a - b;
    }

    public static float Skirtumas(float a, float b) {
        return a - b;
    }

    public static float Sandauga(float a, float b) {
        return a * b;
    }

    public static int Sandauga(int a, int b) {
        return a * b;
    }

    public static int Dalyba(int a, int b) {
        return a / b;
    }

    public static float Dalyba(float a, float b) {
        return a / b;
    }
}
