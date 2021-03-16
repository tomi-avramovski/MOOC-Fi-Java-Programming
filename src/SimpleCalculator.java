import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());

        int addition = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + addition);
        int substract = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + substract);
        int multiply = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiply);
        double divide = (double) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + divide);


    }
}
