
public class Main
{
   public static void main(String[] args)
   {
      Vehicle v1 = new Vehicle();
      v1.brand = "Toyota";
      v1.model = "Supra";
      v1.year = 1993;
      
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Vintage: " + v1.isVintage());
      System.out.println();

      Vehicle v2 = new Vehicle();
      v2.brand = "Honda";
      v2.model = "Civic";
      v2.year = 1998;
      
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Vintage: " + v2.isVintage());
      System.out.println();

      Vehicle v3 = new Vehicle();
      v3.brand = "Mitsubishi";
      v3.model = "Lancer";
      v3.year = 2001;
      
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Vintage: " + v3.isVintage());
      System.out.println();
   }
}

