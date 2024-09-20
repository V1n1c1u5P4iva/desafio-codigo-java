public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    
    
    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero=NUMERO_CONTA++;
        this.agencia = Conta.AGENCIA_PADRAO;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void imprimirExtrato() {
      
    }

}
