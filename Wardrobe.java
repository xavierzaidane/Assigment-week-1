public class Wardrobe {
    // Attributes
    private String material;
    private int numberOfDoors;
    private String color;
    private int capacity; // Number of clothing items it can hold

    // Constructor
    public Wardrobe(String material, int numberOfDoors, String color, int capacity) {
        this.material = material;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.capacity = capacity;
    }

    // Methods
    public void addClothingItem(String clothingItem) {
        if (capacity > 0) {
            System.out.println("Adding \"" + clothingItem + "\" to the wardrobe.");
            capacity--;
        } else {
            System.out.println("The wardrobe is full! Cannot add more clothing items.");
        }
    }

    public void removeClothingItem(String clothingItem) {
        System.out.println("Removing \"" + clothingItem + "\" from the wardrobe.");
        capacity++;
    }

    public void showInfo() {
        System.out.println("Wardrobe Info:");
        System.out.println("Material: " + material);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Color: " + color);
        System.out.println("Remaining Capacity: " + capacity + " clothing items");
    }
}


