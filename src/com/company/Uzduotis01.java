package com.company;

import java.util.Scanner;

public class Uzduotis01 {
    //Paprasyti ivesti savo varda
    //atspausdinti varda 5 kartus
    public Uzduotis01() {
        System.out.println("Iveskite savo varda: ");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.next();
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
    }
}
