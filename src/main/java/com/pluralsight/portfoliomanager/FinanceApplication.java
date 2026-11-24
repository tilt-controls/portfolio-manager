package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FinanceApplication {

    public static void main(String[] args) {
//        System.out.println(house.getName() + ": $" + house.getValue());
//        System.out.println(gold.getName() + ": $" + gold.getValue());
//        System.out.println(ring.getName() + ": $" + ring.getValue());

//        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
//        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
//        // try to deposit money into both accounts
//        account1.deposit(new BigDecimal("100"));
//        account2.deposit(new BigDecimal("100");
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);
        BankAccount bankAccount = new BankAccount(1234, "jp's chase account", new BigDecimal("150000"));
        CreditCard card = new CreditCard(123, "jp's discover Card", new BigDecimal("1000"));

        List<Valuable> assets = new ArrayList<Valuable>();
        Portfolio p1 = new Portfolio("My Portfolio", "jp", assets);
        p1.add(house);
        p1.add(gold);
        p1.add(ring);
        p1.add(bankAccount);
        p1.add(card);


        System.out.println(p1.getValue());
        System.out.println(p1.getMostValuable());
        System.out.println(p1.getLeastValuable());


    }
}
