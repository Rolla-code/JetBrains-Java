import java.util.ArrayList;
import java.util.List;

/**
 * Write a method that accepts a list of StockItem objects, sorts them by their total value in descending order, and returns the sorted list. You don't need to read or write anything from or to the console, just implement the method.
 * Sample Input 1:
 * nails: 0.01, 512; hammers: 7.5, 24; screws: 0.02, 318
 * Sample Output 1:
 * hammers: 7.5, 24; screws: 0.02, 318; nails: 0.01, 512
 *
 * Sample Input 2:
 * pens: 3.72, 40; pencils: 1.45, 75; notebooks: 0.84, 130
 * Sample Output 2:
 * pens: 3.72, 40; notebooks: 0.84, 130; pencils: 1.45, 75
 * */

public class Main {
    public static void main(String[] args) {
        List<StockItem> theStock = new ArrayList<>(List.of(
                new StockItem("nails", 0.01, 512),
                new StockItem("hammers", 7.5, 24),
                new StockItem("screws", 0.02, 318)
        ));
        System.out.println(theStock);
        System.out.println(Utils.sort(theStock));
    }
}

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        // your code here
        stockItems.sort(
                (x, y) -> Double.compare(y.getPricePerUnit() * y.getQuantity(), x.getPricePerUnit() * x.getQuantity())
        );
        return stockItems;
    }
}