package com.company;

import java.util.Scanner;

public class Uzduotis05 {

    public Uzduotis05() {
    }

    public static int Duomenys(int KM, float San) {
        System.out.println("Iveskite nuvaziuota atstuma:");
        Scanner skaneris = new Scanner(System.in);
        KM = skaneris.nextInt();
        System.out.println("Iveskite kuro sanaudas");
        San = skaneris.nextFloat();

        int vidurkis =(int)(San*100)/KM;

        return vidurkis;

    }
}
