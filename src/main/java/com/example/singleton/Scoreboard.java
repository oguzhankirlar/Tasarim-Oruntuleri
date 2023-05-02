package com.example.singleton;

public class Scoreboard {
    private static Scoreboard instance;
    private int score;
    private int level;

    private Scoreboard() {
        score = 0;
        level = 1;
    }

    public static synchronized Scoreboard getInstance() {
        if (instance == null) {
            instance = new Scoreboard();
        }
        return instance;
    }

    public void addScore(int points) {
        score += points;
        System.out.println(points + " point added. Total point: " + score);
    }

    public void addLevel() {
        level++;
        System.out.println("Congratulations! Level up. New level: " + level);
    }

    public void displayResults() {
        System.out.println("Results: Point: " + score + ", Level: " + level);
    }
}
