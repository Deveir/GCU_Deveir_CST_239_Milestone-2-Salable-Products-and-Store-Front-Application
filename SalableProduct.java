package Storefront;
/**
 * The SalableProduct class represents a product that can be sold in the store.
 * It stores common information such as name, description, price, and quantity.
 *
 * @author Deveir
 */
public class SalableProduct {
    private String name;
    private String description;
    private double price;
    private int quantity;

    /**
     * Default constructor.
     */
    public SalableProduct() {
        this.name = "";
        this.description = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    /**
     * Constructor to create a salable product with all fields.
     *
     * @param name the name of the product
     * @param description the description of the product
     * @param price the price of the product
     * @param quantity the quantity available
     */
    public SalableProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     *
     * @param name the new product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the product description.
     *
     * @return the product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the product price.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the product price.
     *
     * @param price the new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the quantity available.
     *
     * @return the product quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity available.
     *
     * @param quantity the new quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Decreases the product quantity by a certain amount.
     *
     * @param amount the amount to subtract
     */
    public void decreaseQuantity(int amount) {
        if (amount > 0 && quantity >= amount) {
            quantity -= amount;
        }
    }

    /**
     * Increases the product quantity by a certain amount.
     *
     * @param amount the amount to add
     */
    public void increaseQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    /**
     * Returns a string representation of the product.
     *
     * @return formatted product information
     */
    @Override
    public String toString() {
        return "Name: " + name +
               ", Description: " + description +
               ", Price: $" + price +
               ", Quantity: " + quantity;
    }
}