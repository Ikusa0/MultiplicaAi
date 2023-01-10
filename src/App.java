import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numberToMultiply = scanner.nextInt();

        System.out.println("\nTabela de multiplicação de " + numberToMultiply + ":");

        for (int i = 0; i <= 10; i++) {
            int result = numberToMultiply * i;
            System.out.println(numberToMultiply + " x " + i + " = " + result);
        }
    }
}
