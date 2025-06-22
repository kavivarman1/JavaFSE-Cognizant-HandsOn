package Product;

public class Product {
    int productId;
    private String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.setProductName(productName);
        this.category = category;
    }

    public String toString() {
        return productId + " - " + getProductName() + " [" + category + "]";
    }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
