public class Laptop {
   // Attributes
   private String brand;
   private String model;
   private int ramSize;        // in GB
   private int storageCapacity; // in GB

   // Constructor
   public Laptop(String brand, String model, int ramSize, int storageCapacity) {
       this.brand = brand;
       this.model = model;
       this.ramSize = ramSize;
       this.storageCapacity = storageCapacity;
   }

   // Methods
   public void start() {
       System.out.println("Laptop " + model + " is starting.");
   }

   public void shutDown() {
       System.out.println("Laptop " + model + " is shutting down.");
   }

   public void showInfo() {
       System.out.println("Laptop Info:");
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("RAM Size: " + ramSize + " GB");
       System.out.println("Storage Capacity: " + storageCapacity + " GB");
   }
}