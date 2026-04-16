package Storefront;
/**
 * The Armor class represents an armor product sold in the store.
 * It extends the SalableProduct class by adding defense and armor type.
 *
 * @author Deveir
 */
public class Armor extends SalableProduct {
    private int defense;
    private String armorType;

    /**
     * Constructs an Armor object.
     *
     * @param name the name of the armor
     * @param description the description of the armor
     * @param price the price of the armor
     * @param quantity the quantity available
     * @param defense the defense value
     * @param armorType the type of armor
     */
    public Armor(String name, String description, double price, int quantity, int defense, String armorType) {
        super(name, description, price, quantity);
        this.defense = defense;
        this.armorType = armorType;
    }

    /**
     * Gets the defense value.
     *
     * @return the defense value
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense value.
     *
     * @param defense the new defense value
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Gets the armor type.
     *
     * @return the armor type
     */
    public String getArmorType() {
        return armorType;
    }

    /**
     * Sets the armor type.
     *
     * @param armorType the new armor type
     */
    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    /**
     * Returns a string representation of the armor.
     *
     * @return formatted armor information
     */
    @Override
    public String toString() {
        return super.toString() +
               ", Defense: " + defense +
               ", Armor Type: " + armorType;
    }
}