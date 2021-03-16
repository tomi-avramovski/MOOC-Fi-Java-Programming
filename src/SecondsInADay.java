import java.util.Scanner;
public class SecondsInADay {
    public static void main(String[] args){

        System.out.println("How many days would you like to convert to seconds?");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int seconds = number * 60 * 60 * 24;
        System.out.println(seconds);

    }
}
