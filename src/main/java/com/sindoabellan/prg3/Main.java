package com.sindoabellan.prg3;

import com.sindoabellan.prg3.T08.Game;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Game Of Live");

        Game game = new Game(1280, 960,60);
        frame.add(game);
        frame.pack();
        game.start();
        frame.setVisible(true);

    }
}
