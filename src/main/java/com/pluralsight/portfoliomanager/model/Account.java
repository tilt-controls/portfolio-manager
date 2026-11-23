package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public abstract class Account {
    private int accountNumber;
    private String name;
    private BigDecimal balance;

    public Account(int accountNumber, String name, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getValue() {
        return balance;
    }
}
