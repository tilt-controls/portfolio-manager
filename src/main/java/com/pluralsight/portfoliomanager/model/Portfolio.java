package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.List;

public class Portfolio {
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

    public BigDecimal getValue() {
        BigDecimal value = BigDecimal.ZERO;
        for (Valuable valuable : assets) {
            value = value.add(valuable.getValue());
        }
        return value;
    }
}
