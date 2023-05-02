package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
    // YOU CAN CHANGE COMMENTED LINES AND RUN THE DIFFERENT SCENARIOS

/*
        CalculateTax calculateTax = CalculateTax.getInstance();

        double usaResult = calculateTax.calculateTotalPrice(100, "USA");
        System.out.println("Product price after tax in USA: " + usaResult);
        double canadaResult = calculateTax.calculateTotalPrice(100, "Canada");
        System.out.println("Product price after tax in Canada: " + canadaResult);
        double franceResult = calculateTax.calculateTotalPrice(100, "France");
        System.out.println("Product price after tax in France: " + franceResult);
*/
/*
        Scoreboard scoreboard = Scoreboard.getInstance();

        scoreboard.addScore(1);
        scoreboard.addScore(3);
        scoreboard.addLevel();
        scoreboard.displayResults();
        scoreboard.addScore(5);
        scoreboard.addLevel();
        scoreboard.addScore(2);
        scoreboard.displayResults();
*/

        SpringApplication.run(SingletonApplication.class, args);
    }

}