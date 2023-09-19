package produtoFinal;

import aparelhosBase.AparelhoTelefônico;
import aparelhosBase.NavegadorNaInternet;
import aparelhosBase.RepodutorMusicial;

public class Iphone implements RepodutorMusicial, AparelhoTelefônico, NavegadorNaInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando numero");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
        
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
        
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
        
    }
    
}
