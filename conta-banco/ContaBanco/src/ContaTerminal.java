import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        String agencia = scanner.next();
        String nomeCliente = scanner.next();
        double saldo = scanner.nextDouble();

        scanner.close();
    }
}
