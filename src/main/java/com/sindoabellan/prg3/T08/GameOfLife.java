package com.sindoabellan.prg3.T08;

import java.awt.*;

public class GameOfLife {
    private int width;
    private int height;
    private int cellSize;
    private int [][] world;
    private int [][] nextWorld;

    public GameOfLife(int width, int height, int cellSize) {
        this.width = width;
        this.height = height;
        this.cellSize = cellSize;
        world = new int[height][width];
        nextWorld = new int [height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCellSize() {
        return cellSize;
    }

    public void update(){
        //Simular una simulación
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.WHITE);
        for (int i = 0; i < height; i+= cellSize) {
            g2.drawLine(0, i, width, i);
        }

        for (int i = 0; i < width; i+= cellSize) {
            g2.drawLine(i, 0, height, i);
        }
    }
}
