import java.util.Scanner;
public class salesTax {
    public static void main(String[] args) {
        System.out.print("Enter the price: ");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextInt();
        double tax = (.05 * price);
        price = (price + tax);
        System.out.println("Your total after tax is: " + price);
    }
}
