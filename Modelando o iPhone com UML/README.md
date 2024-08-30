# Celular - Projeto Java

Este projeto demonstra a implementação de um celular que combina três funcionalidades principais: reprodutor de música, sistema telefônico e navegador de internet.

## Funcionalidades

- **Reprodutor de Música**
  - `tocar()`: Reproduz música.
  - `pausar()`: Pausa a reprodução da música.
  - `selecionarMusica(String musica)`: Seleciona a música a ser reproduzida.

- **Sistema Telefônico**
  - `ligar(String numero)`: Faz uma chamada para o número especificado.
  - `atender()`: Atende uma chamada.
  - `iniciarCorreioDeVoz()`: Inicia o correio de voz.

- **Navegador de Internet**
  - `exibirPagina(String url)`: Exibe a página da URL especificada.
  - `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
  - `atualizarPagina()`: Atualiza a página atual.

## Diagrama UML para Smartphone

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
    }
    
    class AparelhoTelefonico {
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }
    
    class NavegadorInternet {
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    
    class Smartphone {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) void
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    Smartphone ..|> ReprodutorMusical
    Smartphone ..|> AparelhoTelefonico
    Smartphone ..|> NavegadorInternet
