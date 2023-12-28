import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give-me a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("It's a positive number");
        } else {
            System.out.println("It's a negative number");
        }
    }
}
