import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give-me a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i =1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of" + number + "is equals to: "+ factorial);
    }
}
