import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer do scanner
        System.out.println("Por favor, digite o nome da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
