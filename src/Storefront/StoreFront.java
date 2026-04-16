package Storefront;
import java.util.Scanner;

/**
 * The StoreFront class runs the console-based store application.
 * It displays the menu, accepts user input, and calls inventory methods.
 *
 * @author Deveir
 */
public class StoreFront {
    private String storeName;
    private String welcomeMessage;
    private InventoryManager inventoryManager;

    /**
     * Constructs a StoreFront object and sets up default store information.
     */
    public StoreFront() {
        storeName = "Dragon's Keep Store";
        welcomeMessage = "Welcome to the store! Choose an action from the menu below.";
        inventoryManager = new InventoryManager();
        setupInventory();
    }

    /**
     * Populates the store with starting inventory.
     */
    public void setupInventory() {
        inventoryManager.addProduct(new weapon("Iron Sword", "A basic sword for close combat.", 50.00, 5, 15, "Sword"));
        inventoryManager.addProduct(new weapon("Hunter Bow", "A ranged weapon for attacking from a distance.", 75.00, 3, 12, "Bow"));

        inventoryManager.addProduct(new Armor("Leather Armor", "Light armor with basic protection.", 40.00, 4, 10, "Light Armor"));
        inventoryManager.addProduct(new Armor("Steel Shield", "Heavy shield for strong defense.", 60.00, 2, 18, "Shield"));

        inventoryManager.addProduct(new Health("Small Potion", "Restores a small amount of health.", 10.00, 10, 20, "Potion"));
        inventoryManager.addProduct(new Health("Large Med Kit", "Restores a large amount of health.", 25.00, 6, 50, "Med Kit"));
    }

    /**
     * Displays the store name and welcome message.
     */
    public void displayWelcome() {
        System.out.println("===================================");
        System.out.println(storeName);
        System.out.println("===================================");
        System.out.println(welcomeMessage);
    }

    /**
     * Displays the menu options.
     */
    public void displayMenu() {
        System.out.println("\nMenu Options:");
        System.out.println("1. View Inventory");
        System.out.println("2. Purchase Product");
        System.out.println("3. Cancel Purchase");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Runs the store application.
     */
    public void runStore() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        displayWelcome();

        while (choice != 4) {
            displayMenu();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        inventoryManager.displayProducts();
                        break;

                    case 2:
                        inventoryManager.displayProducts();
                        System.out.print("Enter the product number to purchase: ");
                        if (scanner.hasNextInt()) {
                            int productNumber = scanner.nextInt();
                            inventoryManager.purchaseProduct(productNumber - 1);
                        } else {
                            System.out.println("Error: Please enter a valid number.");
                            scanner.next();
                        }
                        break;

                    case 3:
                        inventoryManager.displayProducts();
                        System.out.print("Enter the product number to cancel: ");
                        if (scanner.hasNextInt()) {
                            int productNumber = scanner.nextInt();
                            inventoryManager.cancelPurchase(productNumber - 1);
                        } else {
                            System.out.println("Error: Please enter a valid number.");
                            scanner.next();
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for visiting " + storeName + "!");
                        break;

                    default:
                        System.out.println("Error: Invalid menu choice. Please choose 1-4.");
                }
            } else {
                System.out.println("Error: Input must be a number.");
                scanner.next();
            }
        }

        scanner.close();
    }

    /**
     * Main method to start the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        StoreFront store = new StoreFront();
        store.runStore();
    }
}