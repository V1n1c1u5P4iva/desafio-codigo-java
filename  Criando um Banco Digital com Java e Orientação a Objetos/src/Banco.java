import java.util.ArrayList;
import java.util.List;

public class Banco {

    List<Conta> listaDeContas ;

    public Banco() {
        this.listaDeContas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.listaDeContas.add(conta);
    }

    public void removerConta(Conta conta){
        this.listaDeContas.remove(conta);
    }
    
}
