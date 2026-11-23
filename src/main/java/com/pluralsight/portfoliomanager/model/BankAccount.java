package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class BankAccount extends Account {

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void deposit(BigDecimal amount) {
        setBalance(getBalance().add(amount));
    }

    public void withdraw(BigDecimal amount) {
        setBalance(getBalance().subtract(amount));
    }
}
