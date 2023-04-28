import stockaccountmanagement.Stock;
import stockaccountmanagement.StockPortfolio;

import java.util.Scanner;
/*
Main class
 */
public class Main {
// main method started
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();

        // Get the number of stocks from the user
        System.out.print("Enter the number of stocks: ");
        int n = scanner.nextInt();

        // Get the details of each stock from the user and add it to the portfolio
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of stock #" + (i+1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the number of shares of " + name + ": ");
            int shares = scanner.nextInt();
            System.out.print("Enter the price per share of " + name + ": ");
            double price = scanner.nextDouble();
            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        // Print the report of all stocks in the portfolio and the total value
        portfolio.printReport();
    }
}
