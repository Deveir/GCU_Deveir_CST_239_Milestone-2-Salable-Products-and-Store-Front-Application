package Storefront;
/**
 * The Health class represents a health product sold in the store.
 * It extends the SalableProduct class by adding heal amount and item type.
 *
 * @author Deveir
 */
public class Health extends SalableProduct {
    private int healAmount;
    private String itemType;

    /**
     * Constructs a Health object.
     *
     * @param name the name of the health item
     * @param description the description of the health item
     * @param price the price of the health item
     * @param quantity the quantity available
     * @param healAmount the healing value
     * @param itemType the type of health item
     */
    public Health(String name, String description, double price, int quantity, int healAmount, String itemType) {
        super(name, description, price, quantity);
        this.healAmount = healAmount;
        this.itemType = itemType;
    }

    /**
     * Gets the heal amount.
     *
     * @return the heal amount
     */
    public int getHealAmount() {
        return healAmount;
    }

    /**
     * Sets the heal amount.
     *
     * @param healAmount the new heal amount
     */
    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    /**
     * Gets the item type.
     *
     * @return the item type
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the item type.
     *
     * @param itemType the new item type
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * Returns a string representation of the health item.
     *
     * @return formatted health item information
     */
    @Override
    public String toString() {
        return super.toString() +
               ", Heal Amount: " + healAmount +
               ", Item Type: " + itemType;
    }
}