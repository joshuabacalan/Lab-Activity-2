public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.brand = "Toyota";
        v1.model = "Corolla";
        v1.year = 1995;

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        Vehicle v2 = new Vehicle();
        v2.brand = "Honda";
        v2.model = "Civic";
        v2.year = 2015;

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        Vehicle v3 = new Vehicle();
        v3.brand = "Ford";
        v3.model = "Ranger";
        v3.year = 2022;

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println();
    }
}