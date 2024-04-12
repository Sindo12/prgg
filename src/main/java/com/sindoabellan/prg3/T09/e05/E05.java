package com.sindoabellan.prg3.T09.e05;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumnos alumno = new Alumnos(null, 0, 0);

        System.out.println("Que edad tiene");
        alumno.getNombre(scanner.nextLine());

    }
}
