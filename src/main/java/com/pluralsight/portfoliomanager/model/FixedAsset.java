package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String name;
    private BigDecimal marketValue;

    public FixedAsset(String name, BigDecimal marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getValue() {
        return marketValue;
    }
}
