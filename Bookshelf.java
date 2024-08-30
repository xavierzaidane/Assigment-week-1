public class Bookshelf {
        // Attributes
        private String material;
        private int numberOfShelves;
        private String color;
        private int capacity; // Number of books it can hold
    
        // Constructor
        public Bookshelf(String material, int numberOfShelves, String color, int capacity) {
            this.material = material;
            this.numberOfShelves = numberOfShelves;
            this.color = color;
            this.capacity = capacity;
        }
    
        // Methods
        public void addBook(String bookTitle) {
            if (capacity > 0) {
                System.out.println("Adding \"" + bookTitle + "\" to the bookshelf.");
                capacity--;
            } else {
                System.out.println("The bookshelf is full! Cannot add more books.");
            }
        }
    
        public void removeBook(String bookTitle) {
            System.out.println("Removing \"" + bookTitle + "\" from the bookshelf.");
            capacity++;
        }
    
        public void showInfo() {
            System.out.println("Bookshelf Info:");
            System.out.println("Material: " + material);
            System.out.println("Number of Shelves: " + numberOfShelves);
            System.out.println("Color: " + color);
            System.out.println("Remaining Capacity: " + capacity + " books");
        }
    }
    

