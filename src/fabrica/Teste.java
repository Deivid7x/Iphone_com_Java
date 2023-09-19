package fabrica;

import produtoFinal.Iphone;

public class Teste {
    public static void main(String[] args) {
        
        Iphone novoCelular = new Iphone();
        // Métodos de um aparelho telefonico
        novoCelular.ligar();

        novoCelular.atender();

        novoCelular.iniciarCorrerioVoz();

        // Métodos de um reprodutor musical
        novoCelular.selecionarMusica();

        novoCelular.tocar();

        novoCelular.pausar();

        // Métodos de um navegador de internet

        novoCelular.exibirPagina();

        novoCelular.adicionarNovaAba();

        novoCelular.atualizarPagina();
    }
}
