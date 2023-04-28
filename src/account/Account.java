package account;

public class Account {
    private double balance; // Balance of the account

    // Constructor to create a new Account with the specified initial balance
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            balance = 0;
        } else {
            balance = initialBalance;
        }
    }

    // Method to add money to the account
    public void credit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }
}
