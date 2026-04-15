package game;

import java.awt.Color;

public class Projectile extends Entity {

public static final double moveAmount = 0.01;

    public Projectile(double x, double y, Color color) {
        super(x, y, moveAmount, color);
    }

    public void moveUp() {
        setYPosition(this.getYPosition() + moveAmount);
    }

    public void moveDown() {
        setYPosition(this.getYPosition() - moveAmount);
    }

    public boolean isOutOfBounds() {
        if(this.getYPosition() > 1 || this.getYPosition() < 0) {
            return true;
        } else {
            return false;
        }
    }
}
