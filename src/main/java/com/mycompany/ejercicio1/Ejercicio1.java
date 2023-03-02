package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {//E4

    public static void main(String[] args) {
        int juan,alberto,ana,mama;
        System.out.println("¿Cual es la edad de Juan?");
        Scanner ej = new Scanner(System.in);
        
        juan=ej.nextInt();
        alberto=(juan*2)/3;
        ana=(juan*4)/3;
        mama=juan+alberto+ana;
        
        System.out.println("La edad de Juan es:"+juan);
        System.out.println("La edad de Alberto es:"+alberto);
        System.out.println("La edad de Ana es:"+ana);
        System.out.println("La edad de Mamá es:"+mama);
        
        
        
        
    }
}
