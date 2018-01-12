package sample;

import java.io.Serializable;

public class Score  implements Serializable {
    private int score;

    public int getScore() {
        return score;
    }

    public Score(int score) {
        this.score = score;
    }
}