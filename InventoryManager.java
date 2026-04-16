package Storefront;
import java.util.ArrayList;

/**
 * The InventoryManager class manages the list of products in the store.
 * It allows products to be added, displayed, purchased, and canceled.
 *
 * @author Deveir
 */
public class InventoryManager {
    private ArrayList<SalableProduct> products;

    /**
     * Constructs an InventoryManager object.
     */
    public InventoryManager() {
        products = new ArrayList<>();
    }

    /**
     * Adds a product to the inventory.
     *
     * @param product the product to add
     */
    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    /**
     * Displays all products in the inventory.
     */
    public void displayProducts() {
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }

    /**
     * Returns a product based on its index.
     *
     * @param index the index of the product
     * @return the product if valid, otherwise null
     */
    public SalableProduct getProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }

    /**
     * Purchases a product by decreasing its quantity.
     *
     * @param index the index of the product
     * @return true if successful, false otherwise
     */
    public boolean purchaseProduct(int index) {
        SalableProduct product = getProduct(index);

        if (product == null) {
            System.out.println("Error: Invalid product selection.");
            return false;
        }

        if (product.getQuantity() <= 0) {
            System.out.println("Error: That item is out of stock.");
            return false;
        }

        product.decreaseQuantity(1);
        System.out.println("Purchase successful: You bought " + product.getName() + ".");
        return true;
    }

    /**
     * Cancels a purchase by increasing its quantity.
     *
     * @param index the index of the product
     * @return true if successful, false otherwise
     */
    public boolean cancelPurchase(int index) {
        SalableProduct product = getProduct(index);

        if (product == null) {
            System.out.println("Error: Invalid product selection.");
            return false;
        }

        product.increaseQuantity(1);
        System.out.println("Cancel successful: " + product.getName() + " was returned to inventory.");
        return true;
    }

    /**
     * Gets the number of products in inventory.
     *
     * @return the number of products
     */
    public int getProductCount() {
        return products.size();
    }
}