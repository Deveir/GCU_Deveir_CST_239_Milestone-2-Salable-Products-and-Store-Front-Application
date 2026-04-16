package Storefront;
/**
 * The Weapon class represents a weapon product sold in the store.
 * It extends the SalableProduct class by adding damage and weapon type.
 *
 * @author Deveir
 */
public class weapon extends SalableProduct {
    private int damage;
    private String weaponType;

    /**
     * Constructs a Weapon object.
     *
     * @param name the name of the weapon
     * @param description the description of the weapon
     * @param price the price of the weapon
     * @param quantity the quantity available
     * @param damage the damage value
     * @param weaponType the type of weapon
     */
    public weapon(String name, String description, double price, int quantity, int damage, String weaponType) {
        super(name, description, price, quantity);
        this.damage = damage;
        this.weaponType = weaponType;
    }

    /**
     * Gets the damage value.
     *
     * @return the damage value
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Sets the damage value.
     *
     * @param damage the new damage value
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Gets the weapon type.
     *
     * @return the weapon type
     */
    public String getWeaponType() {
        return weaponType;
    }

    /**
     * Sets the weapon type.
     *
     * @param weaponType the new weapon type
     */
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    /**
     * Returns a string representation of the weapon.
     *
     * @return formatted weapon information
     */
    @Override
    public String toString() {
        return super.toString() +
               ", Damage: " + damage +
               ", Weapon Type: " + weaponType;
    }
}