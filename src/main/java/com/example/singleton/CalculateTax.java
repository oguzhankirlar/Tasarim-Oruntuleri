package com.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class CalculateTax {

    private static volatile CalculateTax instance = null;
    private double taxRatio;
    private Map<String, Double> countryTaxMap = new HashMap<String, Double>() {{
        put("USA", 0.25);
        put("Canada", 0.20);
        put("France", 0.40);
    }};

    private CalculateTax() {}

    public static CalculateTax getInstance() {
        if (instance == null) {
            synchronized (CalculateTax.class) {
                if (instance == null) {
                    instance = new CalculateTax();
                }
            }
        }
        return instance;
    }

    public double calculateTotalPrice(double productPrice, String country) {
        double taxRatio = countryTaxMap.get(country);
        double totalPrice = productPrice + (productPrice * taxRatio);

        return totalPrice;
    }

}
