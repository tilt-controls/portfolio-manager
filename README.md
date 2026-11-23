## Exercise 2: p. 30 Questions
1. No the deposit only worked for the first account. Only the first account worked because it created an account using the bank account class, while it tried to create the second one with the Valuable interface class which does not have the required methods.
2. Account1 has methods available methods from BankAccount, Account, and Valuable.
3. Account2 only has methods from the Valuable interface.
4. This is because account1 was created as a specific type of Account, a BankAccount. So, that gives it access to Account and BankAccount methods, then since Account implements Valuable it allows it the getValue() method from there as well. Account2 is created as a BankAccount but that only assigns the variables of the account, not give it access to the BankAccount methods. It looks to the variable type and sees Valuable so it uses that.

![](/Users/jpmorgan/Pluralsight/workbook-6/portfolio-manager/assets-diagram-1.png)