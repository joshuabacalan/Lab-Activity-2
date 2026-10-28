
public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    
    public static void printAction(Vehicle vehicle) {
         vehicle.moveForward();
         vehicle.moveBackward();
         vehicle.moveLeft();
         vehicle.moveRight();
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Toyota", "Supra", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "Click", 2023, "Matic");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Isuzu", "N-Series", 2022, 5.0);
        vehicle.displayInfo();
        System.out.println();

        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motor = new Motorcycle("TMX", "V3", 2026, "Matic");
        Truck truck = new Truck("Mitsubishi", "Canter", 2025, 5.0);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
            
        
        Vehicle[] vehicles = {
            new Car("Toyota", "Supra", 2026, 4),
            new Motorcycle("Honda", "Click", 2023, "Matic"),
            new Truck("Isuzu", "N-Series", 2022, 5.0)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            printAction(currentVehicle);
            System.out.println();
        }
        
   }               
}
