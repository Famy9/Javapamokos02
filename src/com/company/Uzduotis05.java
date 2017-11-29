package com.company;

import java.util.Scanner;

public class Uzduotis05 {

    int KM;
    float San;


    public Uzduotis05() {
    }

    public void Duomenys(int KM, float San) {
        System.out.println("Iveskite nuvaziuota atstuma:");
        Scanner skaneris = new Scanner(System.in);
        KM = skaneris.nextInt();
        System.out.println("Iveskite kuro sanaudas");
        San = skaneris.nextFloat();
    }

    public void Vidurkis(float San, int KM) {
        int vidurkis = (int) (San * 100) / KM;
        System.out.println("Jusu sanaudu vidurkis: " + vidurkis);

    }
}

