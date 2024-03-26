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

    public Game(int whidth, int height, float fpsLimit){
        this.whidth = whidth;
        this.height = height;
        this.fpsLimit = fpsLimit;
        this.finished =false;
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(whidth, height));
        setBackground(Color.BLACK);
        setFocusable(true);
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        final double NANO_BETWEEN_UPDATES = 1_000_000 / fpsLimit;
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
        //TODO: draw
    }

    private void update() {
        //TODO: update
        personaje.x = personaje.x + velocidad;
    }

    private void processImput() {
        //TODO: processImput
    }
}