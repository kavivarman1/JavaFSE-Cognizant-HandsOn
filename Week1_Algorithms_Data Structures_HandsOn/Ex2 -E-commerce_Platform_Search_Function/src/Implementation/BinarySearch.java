package Implementation;

import java.util.Arrays;
import java.util.Comparator;

import Product.Product;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int result = products[mid].getProductName().compareToIgnoreCase(name);

            if (result == 0) return products[mid];
            else if (result < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void sortByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.getProductName().toLowerCase()));
    }
}
