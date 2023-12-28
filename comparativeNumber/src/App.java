import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Type the second number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2){
            System.out.println("The numbers are the same");
        } else if (number1 > number2){
            System.out.println("The first number is bigger");
        } else {
            System.out.println("The second number is bigger");
        }
    }
}
