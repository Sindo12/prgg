package com.sindoabellan.prg3.T08;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable{
    private final int whidth;
    private final int height;
    private final float fpsLimit;
    private Thread thread;
    private boolean finished;
    //private Ball ball;
    private final GameOfLife gameOfLife;

    public Game(int whidth, int height, float fpsLimit){
        this.whidth = whidth;
        this.height = height;
        this.fpsLimit = fpsLimit;
        this.finished =false;
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(whidth, height));
        setBackground(Color.BLACK);
        setFocusable(true);

        gameOfLife = new GameOfLife(height, whidth, 10);

        //ball = new Ball(10,275,30,10,10, Color.MAGENTA, whidth,height);
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        final double NANO_BETWEEN_UPDATES = 1_000_000_000 / fpsLimit;
        long currentFrame;
        long lastFrame = currentFrame = System.nanoTime();
        System.out.println("Iniciando hilo");
        while(!finished){
            currentFrame = System.nanoTime();
            if(currentFrame - lastFrame > NANO_BETWEEN_UPDATES) {
                processImput();
                update();
                draw();
                lastFrame = currentFrame;
            }
        }
    }

    private void draw() {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //ball.draw(g2);
        gameOfLife.draw(g2);
    }

    private void update() {
        //TODO: update
        //ball.update();
    }

    private void processImput() {
        //TODO: processImput
    }
}