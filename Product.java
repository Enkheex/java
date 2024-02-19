import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private ProductCategory productCategory;

    public Product(String name, double price, ProductCategory productCategory) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}

class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Orders {
    private String customerName;
    private Product product;
    private int quantity;
    private String address;

    public Orders(String customerName, Product product, int quantity, String address) {
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.address = address;
    }

    public String toString() {
        return customerName + " ordered " + quantity + " " + product.getName() + " at " + address;
    }

    public static void main(String[] args) {
        ProductCategory electronics = new ProductCategory("electronics");
        Product iphone13 = new Product("iphone 13", 100, electronics);

        Orders order = new Orders("bat", iphone13, 3, "bzd 18r khoroo");

        System.out.println(order);
    }
}
