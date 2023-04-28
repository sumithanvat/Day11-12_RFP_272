package account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100.0); // Create a new account with an initial balance of $100.0
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Test credit method
        account.credit(50.0); // Add $50.0 to the account
        System.out.println("Balance after credit of $50.0: " + account.getBalance()); // Print the current balance

        // Test debit method with valid amount
        System.out.print("Enter debit amount: "); // Prompt the user to enter a debit amount
        double debitAmount = scanner.nextDouble(); // Read the user's input
        account.debit(debitAmount); // Withdraw the specified amount from the account
        System.out.println("Balance after debit of $" + debitAmount + ": " + account.getBalance()); // Print the current balance

        // Test debit method with invalid amount
        System.out.print("Enter debit amount: "); // Prompt the user to enter a debit amount
        debitAmount = scanner.nextDouble(); // Read the user's input
        account.debit(debitAmount); // Try to withdraw the specified amount from the account, which is more than the current balance
        System.out.println("Balance after debit of $" + debitAmount + ": " + account.getBalance()); // Print the current balance
    }
}
