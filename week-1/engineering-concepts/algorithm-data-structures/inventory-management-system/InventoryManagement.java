import java.util.HashMap;

public class InventoryManagement {

    private HashMap<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        Product product = inventory.get(id);

        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.remove(id) != null)
            System.out.println("Product Deleted Successfully.");
        else
            System.out.println("Product Not Found.");
    }

    // Display Inventory
    public void displayInventory() {

        System.out.println("\nInventory:");

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        InventoryManagement ims = new InventoryManagement();

        Product p1 = new Product(101, "Laptop", 15, 55000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        ims.addProduct(p1);
        ims.addProduct(p2);
        ims.addProduct(p3);

        ims.displayInventory();

        ims.updateProduct(102, "Wireless Mouse", 45, 700);

        ims.deleteProduct(103);

        ims.displayInventory();
    }
}