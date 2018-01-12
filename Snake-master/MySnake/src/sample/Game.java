package sample;

import javafx.geometry.Dimension2D;

public class Game extends SnakePart {

//  Установки игры
    public Food food;
    public final Snake snake;
    private final Dimension2D fieldSize;
    private int score;
    private int bestScore;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getBestScore() {
        return bestScore;
    }
    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

//  Конец игры
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

//  Установки новой игры
    public Game() {
        score = 0;
        setX(0);
        setY(0);
        fieldSize = new Dimension2D(400, 400);
        snake = new Snake();
        food = new Food();
    }

}
