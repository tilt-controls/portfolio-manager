package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, BigDecimal marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
