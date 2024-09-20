import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Criação de um cliente
        Cliente cliente = new Cliente(123456789, "Pessoa 01", new SimpleDateFormat("dd/MM/yyyy"));

        // Criação de contas
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente); 

        // Adicionando contas ao banco
        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Operações em conta
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.transferir(100, contaPoupanca);

        // Imprimindo extratos
        System.out.println("=== Extrato Conta Corrente ===");
        contaCorrente.imprimirExtrato();
        System.out.println("\n=== Extrato Conta Poupança ===");
        contaPoupanca.imprimirExtrato();
    }
}


