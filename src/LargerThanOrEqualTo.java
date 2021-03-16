import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scan.nextLine());

        if (number1 == number2) {
            System.out.println("equal");
        } else {
            System.out.println("Larger number is: " + Math.max(number1, number2));
        }

    }
}