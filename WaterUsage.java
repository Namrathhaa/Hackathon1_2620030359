import java.util.Scanner;
public class WaterUsage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of family members:");
        int familyMembers = sc.nextInt();

        System.out.println("Enter the water consumed in litres:");
        double waterConsumed = sc.nextDouble();

        System.out.println("Enter the house no.:");
        int houseNumber = sc.nextInt();

        System.out.println("Enter the water usage status:");
        char waterUsage = sc.next().charAt(0);
        
        System.out.println("\nHousehold Details");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Usage Status: " + waterUsage);
    }
}