import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Which number you want to multiplicate: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication of " + number + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }
}
