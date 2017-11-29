package com.company;

import java.util.Scanner;

public class Main {
    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;
    public static final int CHOISE_5 = 5;
    public static final int CHOISE_6 = 6;
    public static final int CHOISE_7 = 7;

    public static void main(String[] args) {
        //parodyti vartotojui kiek yra uzduociu
        //paklausti vartotjo kokia uzduoti parodyti
        //nuskaityti vartotjo pasirinkima
        //pagal ivesta sveika skaiciu rodyti uzduoties vykdyma
        //program kartoja sia seka kol vartotojas neiveda 0
        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("turime 0 Uzduociu");
            System.out.println("Iveskite uzduoties numeri kad ja vykdyti.");
            System.out.println("Ivedus 0  programa bus baigta.");
            int pasirinkimas = skaitytuvas.nextInt();
            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirmoji = new Uzduotis01();
                    break;
                case CHOISE_2:
                    Uzduotis02 antroji = new Uzduotis02();
                    break;
                case CHOISE_3:
                    Uzduotis03 trecioji = new Uzduotis03();
                    break;
                case CHOISE_4:
                    Uzduotis04 ketvirtoji = new Uzduotis04();
                    break;
                case CHOISE_5:
                    Uzduotis05 penktoji = new Uzduotis05();
                    break;
                case CHOISE_6:

                    break;
                case CHOISE_7:

                    break;
            }

        }

    }
}
