import java.text.DateFormat;

public class Cliente {

    private int cpf;
    private String nome;
    private DateFormat dataNascimento;

    public Cliente(int cpf, String nome, DateFormat dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DateFormat getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DateFormat dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return String.format("Cliente [CPF: %d, Nome: %s, Data de Nascimento: %s]", 
                             cpf, nome, dataNascimento.toString());
    }
    

    
}
