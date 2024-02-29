
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        System.out.println("Vehicle Rental System");
        System.out.println("1. Rent a Car");
        System.out.println("2. Rent a Bike");
        System.out.println("3. Rent a Truck");
        System.out.println("4. View Rented Vehicles");
        System.out.println("5. Exit");

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String model = input.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int days = input.nextInt();
                    input.nextLine();

                    Car c1 = new Car(model, days);
                    rentedVehicles.add(c1);
                    System.out.println("Rental Details:");
                    c1.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String brand = input.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int hours = input.nextInt();
                    input.nextLine(); // Consume newline

                    Bike bike = new Bike(brand, hours);
                    rentedVehicles.add(bike);
                    System.out.println("Rental Details:");
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String type = input.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int weeks = input.nextInt();
                    input.nextLine();

                    Truck truck = new Truck(type, weeks);
                    rentedVehicles.add(truck);
                    System.out.println("Rental Details:");
                    truck.displayDetails();
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }


        }
    }
}