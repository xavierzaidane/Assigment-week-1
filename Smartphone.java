public class Smartphone {
        // Attributes
        private String brand;
        private String model;
        private int storageCapacity; // in GB
        private int batteryLife;     // in hours
    
        // Constructor
        public Smartphone(String brand, String model, int storageCapacity, int batteryLife) {
            this.brand = brand;
            this.model = model;
            this.storageCapacity = storageCapacity;
            this.batteryLife = batteryLife;
        }
    
        // Methods
        public void makeCall(String contact) {
            System.out.println("Calling " + contact + " from " + model + "...");
        }
    
        public void sendText(String contact, String message) {
            System.out.println("Sending text to " + contact + ": " + message);
        }
    
        public void showInfo() {
            System.out.println("Smartphone Info:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Storage Capacity: " + storageCapacity + " GB");
            System.out.println("Battery Life: " + batteryLife + " hours");
        }
    }
    

