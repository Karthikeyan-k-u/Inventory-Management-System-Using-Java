#  Inventory Management System Using Java

## Description
A simple console-based Inventory Management System written in Java that uses a `HashMap` to store items and their quantities.  
The program allows users to add new items, restock existing items, sell items, check stock, display all items, and remove items. It provides a menu-driven interface and handles basic inventory operations with input validation.

## Features
- **Add Item** – Add a new item with an initial quantity.
- **Restock Item** – Increase the quantity of an existing item.
- **Sell Item** – Decrease quantity if sufficient stock is available.
- **Check Stock** – View the current quantity of a specific item.
- **Display All** – Show all items and their quantities.
- **Remove Item** – Delete an item from the inventory.
- **Exit** – Close the program gracefully.

## Algorithm

### 1. Class Structure (`Project7`)
- **Data structure**: `HashMap<String, Integer> stock` stores item names as keys and quantities as values.
- **Methods**:
  - `addItem(String item, int qty)`: Adds a new entry to the map.
  - `restock(String item, int extra)`: Increases quantity if item exists.
  - `sell(String item, int qty)`: Decreases quantity if enough stock exists.
  - `check(String item)`: Prints current quantity.
  - `remove(String item)`: Removes item from the map.
  - `display()`: Prints all key-value pairs.

### 2. Main Menu Loop
- Displays numbered options.
- Reads user choice.
- Calls appropriate method based on choice.
- Repeats until user selects `7`.

### 3. Input Handling
- Uses `Scanner` for input.
- Consumes newline after reading integers to avoid issues with `nextLine()`.
