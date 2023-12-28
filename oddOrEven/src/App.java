import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero %2 ==0){
            System.out.println("This number is a even.");
        } else {
            System.out.println("This number is a odd.");
        }
    }
}
