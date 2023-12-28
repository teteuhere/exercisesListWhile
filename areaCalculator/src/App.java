import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(choice != 3){
            String message = """
                    Menu
                    1. Area calcualtor cube.
                    2. Area calculator circle.
                    3. Close.

                    Choose an option.
                    """;
            System.out.println(message);
            choice = scanner.nextInt();
            if(choice ==1){
                System.out.println("Type the cube wall");
                double wall = scanner.nextDouble();
                double wall2 = wall * wall;
                System.out.println("Area squared: " + wall2);
            } else if (choice == 2){
                System.out.println("Type circle radius: ");
                double radius = scanner.nextDouble();
                double radius2 = 3.14 * radius * radius;
                System.out.println("The area of circle: " + radius2);
            } else if (choice == 3){
                System.out.println("Closing the system");
            } else {
                System.out.println("You need choose one option.");
            }
        }
    }
}
