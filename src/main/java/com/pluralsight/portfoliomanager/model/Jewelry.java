package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, BigDecimal marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }
}
