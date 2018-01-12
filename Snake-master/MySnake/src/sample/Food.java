package sample;

import java.util.Random;
import javafx.scene.paint.Color;

public class Food extends SnakePart {

    private boolean eated;
    private static Color color = new Color(1, 0.0039, 0, 0.6745);

    public Food() {
        super();
        this.eated = false;
        Random rand = new Random();
        int x = rand.nextInt(380) / 20;
        int y = rand.nextInt(380) / 20;
        this.setX(x*SnakePart.getWidth());
        this.setY(y*SnakePart.getHeight());
    }

    public static Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        Food.color = color;
    }

    public boolean isEated() {
        return eated;
    }

    public void setEated(boolean eated) {
        this.eated = eated;
    }

}
