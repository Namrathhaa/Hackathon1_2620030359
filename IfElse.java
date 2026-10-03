import java.util.Scanner;
public class IfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double consumption;
        int bill;
        System.out.println("Enter the water consumption in litres:");
        consumption = sc.nextDouble();
        if(consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("Water Bill: Rs." + bill);
    }
}
