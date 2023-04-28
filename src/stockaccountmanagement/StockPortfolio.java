package stockaccountmanagement;

import java.util.ArrayList;

public class StockPortfolio {

    private ArrayList<Stock> stocks;

    // Constructor
    public StockPortfolio() {
        stocks = new ArrayList<Stock>();
    }

    // Add a stock to the portfolio
    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    // Calculate the total value of all stocks in the portfolio
    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    // Print a report of all stocks in the portfolio and the total value
    public void printReport() {
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
        double totalValue = getTotalValue();
        System.out.println("Total value of all stocks: $" + String.format("%.2f", totalValue));
    }
}
