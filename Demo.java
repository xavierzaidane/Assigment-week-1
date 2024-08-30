public class Demo {
    public static void main(String[] args) {
        // Demonstrating the Smartphone class
        System.out.println("=== Smartphone Demo ===");
        Smartphone myPhone = new Smartphone("Apple", "iPhone 13", 256, 20);
        myPhone.makeCall("Adzin");
        myPhone.sendText("Majid", "Hey, how are you?");
        myPhone.showInfo();
        System.out.println();

        // Demonstrating the Bookshelf class
        System.out.println("=== Bookshelf Demo ===");
        Bookshelf myBookshelf = new Bookshelf("Wood", 5, "Brown", 100);
        myBookshelf.addBook("1984 by George Orwell");
        myBookshelf.addBook("The Great Gatsby by F. Scott Fitzgerald");
        myBookshelf.removeBook("1984 by George Orwell");
        myBookshelf.showInfo();
        System.out.println();

        // Demonstrating the Wardrobe class
        System.out.println("=== Wardrobe Demo ===");
        Wardrobe myWardrobe = new Wardrobe("Metal", 4, "Black", 60);
        myWardrobe.addClothingItem("Sweater");
        myWardrobe.addClothingItem("Jeans");
        myWardrobe.removeClothingItem("Sweater");
        myWardrobe.showInfo();
        System.out.println();

         // Demonstrating the Laptop class
         System.out.println("=== Laptop Demo ===");
         Laptop myLaptop = new Laptop("Dell", "XPS 15", 16, 512);
         myLaptop.start();
         myLaptop.showInfo();
         myLaptop.shutDown();
         System.out.println();
    }
}

