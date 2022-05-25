package com.varia;

import java.util.Arrays;

public class varia {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
//        short s2 = 40000;

//        int i1 = -10000000000;
        int i2 = 28500;

        long l1 = 100000000000000000L; /* long deve usar a letra L no final */
        long l2 = 200400500500055000L;

//        float f1 = 4,5; /* necessário colocar o F no final da linha*/
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.64D; /* double não é necessário colocar o D no final da linha, mas ...*/


        char c1 = 'W';
//        char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Não deu pra entender o exemplo";

        String dt = "06/09/1982"; /* não é interessante pois há opção para */

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

    }
}
