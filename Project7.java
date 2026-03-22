import java.util.*;

public class Project7 {
    private HashMap<String, Integer> stock;

    public Project7() {
        stock = new HashMap<>();
    }

    public void addItem(String item, int qty) {
        stock.put(item, qty);
        System.out.println("Added " + item + " with quantity " + qty);
    }

    public void restock(String item, int extra) {
        if (stock.containsKey(item)) {
            int current = stock.get(item);
            stock.put(item, current + extra);
            System.out.println("Restocked " + item + ". New quantity: " + stock.get(item));
        } else {
            System.out.println("Item not found.");
        }
    }

    public void sell(String item, int qty) {
        if (stock.containsKey(item)) {
            int current = stock.get(item);
            if (current >= qty) {
                stock.put(item, current - qty);
                System.out.println("Sold " + qty + " of " + item + ". Remaining: " + stock.get(item));
            } else {
                System.out.println("Not enough stock. Available: " + current);
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    public void check(String item) {
        if (stock.containsKey(item)) {
            System.out.println("Stock of " + item + ": " + stock.get(item));
        } else {
            System.out.println("Item not found.");
        }
    }

    public void remove(String item) {
        if (stock.containsKey(item)) {
            stock.remove(item);
            System.out.println("Removed " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public void display() {
        if (stock.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (String item : stock.keySet()) {
                System.out.println(item + ": " + stock.get(item));
            }
        }
    }

    public static void main(String[] args) {
        Project7 inv = new Project7();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Restock Item");
            System.out.println("3. Sell Item");
            System.out.println("4. Check Stock");
            System.out.println("5. Display All");
            System.out.println("6. Remove Item");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Item name: ");
                String name = sc.nextLine();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();
                inv.addItem(name, qty);
            } else if (choice == 2) {
                System.out.print("Item name: ");
                String name = sc.nextLine();
                System.out.print("Additional quantity: ");
                int extra = sc.nextInt();
                inv.restock(name, extra);
            } else if (choice == 3) {
                System.out.print("Item name: ");
                String name = sc.nextLine();
                System.out.print("Quantity to sell: ");
                int qty = sc.nextInt();
                inv.sell(name, qty);
            } else if (choice == 4) {
                System.out.print("Item name: ");
                String name = sc.nextLine();
                inv.check(name);
            } else if (choice == 5) {
                inv.display();
            } else if (choice == 6) {
                System.out.print("Item name: ");
                String name = sc.nextLine();
                inv.remove(name);
            } else if (choice == 7) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}