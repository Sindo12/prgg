package com.sindoabellan.prg3.T09.e01;

import java.util.ArrayList;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);


        boolean valido = false;

        do {
            try {
                System.out.println("Cuantas veces quieres que se use?");
                int veces = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < veces; i++) {
                    System.out.println("Escribe un numero");
                    double num = Double.parseDouble(scanner.nextLine());
                    System.out.println(num);
                }

                valido = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Porfavor pon un numero");
                valido = false;
            }
        }
        while(!valido);


         */

        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        ArrayList<Integer> numeros = new ArrayList<>();

        do {
            try {
                System.out.println("Intoduzca un numero");
                Double num = Double.parseDouble(scanner.nextLine());

                valido = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Porfavor pon un numero");
             }
        }
        while(!valido);


    }
}
