package CommercialDataProcesessing;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create a new StockAccount object with the given file name
        StockAccount stockAccount = new StockAccount("stocks.txt");

        // Print the initial portfolio value
        System.out.println("Initial portfolio value: " + stockAccount.valueOf());

        // Buy some shares of a company
        stockAccount.buy(10, "AAPL");

        // Print the new portfolio value
        System.out.println("New portfolio value: " + stockAccount.valueOf());

        // Sell some shares of a company
        stockAccount.sell(5, "AAPL");

        // Print the new portfolio value
        System.out.println("New portfolio value: " + stockAccount.valueOf());

        // Save the portfolio to a file
        stockAccount.save("stocks.txt");

        // Print a report of the portfolio
        stockAccount.printReport();
    }
}
