class Bike implements Vehicle {
    private String brand;
    private double hours;


    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return 10.0 * hours;

    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $" +10.0);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
