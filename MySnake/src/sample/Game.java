package sample;

import javafx.geometry.Dimension2D;

public class Game {

    public Food food;
    public final Snake snake;
    private final Dimension2D fieldSize;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isGameOver() {
        if (snake.update(food, fieldSize.getWidth(), fieldSize.getHeight())) {
            if (food.isEated()) {
                score++;
                food = new Food();
            }
            return false;
        }
        return true;
    }

    public Game() {
        score = 0;
        fieldSize = new Dimension2D(450, 450);
        snake = new Snake();
        food = new Food();
    }

}
