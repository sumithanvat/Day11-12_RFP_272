package stockaccountmanagement;

public class Stock {
    private String name;
    private int shares;
    private double price;

    // Constructor
    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    // Calculate the value of the stock
    public double getValue() {
        return shares * price;
    }

    public String toString() {
        return "Stock{" + "name='" + name + "  "+ ", shares=" + shares + ", price=" + price + '}';
    }
}


