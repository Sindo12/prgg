package com.sindoabellan.prg3;

import com.sindoabellan.prg3.T08.Game;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.nextLine());

        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Juego de las Vidas");

        Game game = new Game(800, 800, 60);
        frame.add(game);
        frame.pack();
        game.start();
        frame.setVisible(true);

    }
}
