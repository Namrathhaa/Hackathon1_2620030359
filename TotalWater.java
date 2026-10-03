import java.util.Scanner;
public class TotalWater {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int morningUsage;
        int eveningUsage;
        int total;
        System.out.println("Enter the Morning Usage:");
        morningUsage = sc.nextInt();
        System.out.println("Enter the Evening Usage:");
        eveningUsage = sc.nextInt();
        total = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption:" + total + " litres");
    }
}