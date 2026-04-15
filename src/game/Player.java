package game;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Player extends Entity {

    public static final double xpos = 0.5;
    public static final double ypos = 0.05;
    public static final double sizee = 0.03;
    public static final double movement = 0.01;

    private long lastFired;

    public Player() {
        super(xpos, ypos, sizee, Color.BLACK);
        lastFired = System.currentTimeMillis();
    }

    public void move() {
        if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
            setXPosition(this.getXPosition() - movement);
        }
        if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
            setXPosition(this.getXPosition() + movement);
        }
    }

    public boolean isFiring() {
        long now = System.currentTimeMillis();
        if (now - lastFired > 500 && StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
                lastFired = now;
                return true;
        }
            return false;
        }
    }

