package game;

import java.awt.Color;

public class Enemy extends Entity {

    private double xSpeed;
    private double ySpeed;
    private double lastFired;

    public static final double xSpeedVar = 0.05;
    public static final double ySpeedVar = 0.05;
    public static final double lastFiredVar = System.currentTimeMillis();
    public static final double size = 0.03;

    public Enemy() {
        super(Math.random() * 0.9, Math.random() * 0.8 + 0.15, size, Color.RED);
        xSpeed = Math.random()* xSpeedVar;
        ySpeed = Math.random()* ySpeedVar;
    }

    public void move() {
        bounceOffWall();
        setXPosition(this.getXPosition() + xSpeed);
        setYPosition(this.getYPosition() + ySpeed);
    }

    private void bounceOffWall() {
        if(this.getXPosition() < 0 || this.getXPosition() > 1) {
            xSpeed = -xSpeed;
        }
        if(this.getYPosition() > 1 || this.getYPosition() < 0.15  ) {
            ySpeed = -ySpeed;
        }
    }

    public boolean isFiring() {
        long now = System.currentTimeMillis();
        if(now - lastFired > 1000) {
            lastFired = now;
            return true;
        }
            return false;
        }
    }
