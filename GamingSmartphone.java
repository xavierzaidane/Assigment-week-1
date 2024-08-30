public class GamingSmartphone extends Smartphone {
    // Additional Attributes
    private int refreshRate; // in Hz
    private boolean coolingSystem; // true if it has a cooling system

    // Constructor
    public GamingSmartphone(String brand, String model, int storageCapacity, int batteryLife, int refreshRate, boolean coolingSystem) {
        super(brand, model, storageCapacity, batteryLife); // Calling the constructor of the parent class
        this.refreshRate = refreshRate;
        this.coolingSystem = coolingSystem;
    }

    // Additional Methods
    public void activateGamingMode() {
        System.out.println("Gaming mode activated with " + refreshRate + "Hz refresh rate and cooling system: " + (coolingSystem ? "On" : "Off"));
    }

    @Override
    public void showInfo() {
        super.showInfo(); // Call the parent class showInfo method
        System.out.println("Refresh Rate: " + refreshRate + "Hz");
        System.out.println("Cooling System: " + (coolingSystem ? "Yes" : "No"));
    }
}
