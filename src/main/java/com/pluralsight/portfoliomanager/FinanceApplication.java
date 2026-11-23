package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.Gold;
import com.pluralsight.portfoliomanager.model.House;
import com.pluralsight.portfoliomanager.model.Jewelry;

import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        // TODO: Workbook 6a p. 30, Part 2
    }
}
