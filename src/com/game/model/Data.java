package com.game.model;

public class Data {
    int score = 0;
    int bestscore =0;


    public int CalculateScore(int attempts) {
        score = 100 - (attempts * 2);
        if (score <= 0) {
            score = 0;
        }
        return score;
    }

    public void UpdateBestScore( int score) {
        if (bestscore < score) {
            bestscore = score;
        }


    }

    public int getBestscore() {
        return bestscore;
    }
}