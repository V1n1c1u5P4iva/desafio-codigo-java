public class Celular implements ReprodutorDeMusica, sistemaTelefonico, NavegadorDeInternet {

    // Implementação dos métodos do Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionada nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Implementação dos métodos do Sistema Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos do Reprodutor de Música
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
        return musica;
    }


     // Método principal para testar as funcionalidades
     public static void main(String[] args) {
        Celular meuCelular = new Celular();

        // Testando as funcionalidades do Reprodutor de Música
        meuCelular.selecionarMusica("Bohemian Rhapsody - Queen");
        meuCelular.tocar();
        meuCelular.pausar();

        // Testando as funcionalidades do Sistema Telefônico
        meuCelular.ligar("123456789");
        meuCelular.atender();
        meuCelular.iniciarCorreioDeVoz();

        // Testando as funcionalidades do Navegador de Internet
        meuCelular.exibirPagina("https://www.example.com");
        meuCelular.adicionarNovaAba();
        meuCelular.atualizarPagina();
    }
}