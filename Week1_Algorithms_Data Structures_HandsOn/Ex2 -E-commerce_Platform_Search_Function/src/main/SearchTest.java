package main;

import Implementation.BinarySearch;
import Implementation.LinearSearch;
import Product.Product;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "T-shirt", "Clothing"),
            new Product(104, "Watch", "Accessories"),
        };

        Product found = LinearSearch.linearSearch(products, "Watch");
        System.out.println("Linear Search: " + (found != null ? found : "Not Found"));

        BinarySearch.sortByName(products);
        Product found2 = BinarySearch.binarySearch(products, "Watch");
        System.out.println("Binary Search: " + (found2 != null ? found2 : "Not Found"));
    }
}
