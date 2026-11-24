package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.List;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public void add(Valuable valuable) {
        assets.add(valuable);
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal value = BigDecimal.ZERO;
        for (Valuable valuable : assets) {
            value = value.add(valuable.getValue());
        }
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getMostValuable() {
        Valuable highestValue = assets.get(0);
        for (Valuable valuable : assets) {
            if (valuable.getValue().compareTo(highestValue.getValue()) > 0) {
                highestValue = valuable;
            }
        }
        return highestValue.getName();
    }

    public String getLeastValuable() {
        Valuable leastValue = assets.get(0);
        for (Valuable valuable : assets) {
            if (valuable.getValue().compareTo(leastValue.getValue()) < 0) {
                leastValue = valuable;
            }
        }
        return leastValue.getName();
    }
}
