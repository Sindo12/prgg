package com.sindoabellan.prg3.T08;

import java.awt.*;

public class Ball {
    private float x;
    private float y;
    private final float size;
    private float speedX;
    private float speedY;
    private Color color;
    private float worldWhidth;
    private float wordHeigth;

    public Ball(float x, float y, float size, float speedX, float speedY, Color color, float worldWhidth, float wordHeigth){
        this.x = x;
        this.y = y;
        this.size = size;
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
        this.worldWhidth = worldWhidth;
        this.wordHeigth = wordHeigth;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSize() {
        return size;
    }

    public float getSpeedX() {
        return speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public Color getColor() {
        return color;
    }

    public void update(){
        if(x + speedX >= worldWhidth - size|| x+ speedX <= 0) {
            speedX +=speedX * 0.05;
            speedX *= -1;
        }
        this.x += speedX;


        if(y + speedY >= worldWhidth - size|| y + speedY <= 0) {
            speedY += speedY * 0.05;
            speedY *= -1;
        }
        this.y += speedY;

    }

    public void draw(Graphics2D g2){
        int s = Math.round(size);
        g2.setColor(color);
        g2.fillOval(Math.round(x),Math.round(y),s,s);
    }
}
