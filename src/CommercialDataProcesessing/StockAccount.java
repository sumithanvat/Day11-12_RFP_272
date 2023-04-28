package CommercialDataProcesessing;
import java.util.ArrayList;
import java.util.Date;
public class StockAccount {

    // ArrayList to store the CompanyShares objects
    private ArrayList<CompanyShares> companyShares;
    // current balance of the account
    private double balance;

    // default constructor initializes the ArrayList and balance to 0
    public StockAccount() {
        this.companyShares = new ArrayList<>();
        this.balance = 0;
    }

    // constructor to read data from file and initialize the ArrayList and balance
    public StockAccount(String filename) {
        // read data from file and initialize companyShares and balance
    }

    // method to calculate the total value of all CompanyShares and add it to the balance
    public double valueOf() {
        // initialize totalValue to 0
        double totalValue = 0;
        // iterate over each CompanyShares object in the ArrayList
        for (CompanyShares shares : companyShares) {
            // add the value of the CompanyShares to the totalValue
            totalValue += shares.getValue();
        }
        // add the balance to the totalValue and return it
        return balance + totalValue;
    }

    // method to buy a specified amount of shares of a specified symbol
    public void buy(int amount, String symbol) {
        // check if companyShares already has the specified symbol
        for (CompanyShares shares : companyShares) {
            if (shares.getSymbol().equals(symbol)) {
                // if the symbol is found, buy the specified amount of shares and update the balance
                shares.buyShares(amount, new Date());
                balance -= amount * shares.getPrice();
                return;
            }
        }
        // if the symbol is not found, create a new CompanyShares object with the specified symbol and add it to the ArrayList
        CompanyShares newShares = new CompanyShares(symbol,amount, new Date());
        companyShares.add(newShares);
        balance -= amount * newShares.getPrice();
    }

    // method to sell a specified amount of shares of a specified symbol
    public void sell(int amount, String symbol) {
        // check if companyShares already has the specified symbol
        for (CompanyShares shares : companyShares) {
            if (shares.getSymbol().equals(symbol)) {
                // if the symbol is found, sell the specified amount of shares and update the balance
                shares.sellShares(amount, new Date());
                balance += amount * shares.getPrice();
                // if the number of shares becomes 0, remove the CompanyShares object from the ArrayList
                if (shares.getNumShares() == 0) {
                    companyShares.remove(shares);
                }
                return;
            }
        }
        // if the symbol is not found, do nothing
    }

    // method to write the ArrayList and balance to file
    public void save(String filename) {
        // write companyShares and balance to file
    }

    // method to print a report of all CompanyShares and the balance
    public void printReport() {
        // print a report of all CompanyShares and balance
    }
}
