package services;

import ferramentas.AparelhoTelefonico;
import ferramentas.NavegadorDaInternet;
import ferramentas.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDaInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Estou ligando do meu Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Estou atendendo do meu Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Estou iniciando correio de voz do meu Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Estou Exibindo do meu Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Estou adicionando nova aba do meu Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Estou atualizando página do meu Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Estou tocando música do meu Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Estou pausando música do meu Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Estou selecionando música do meu Iphone");
    }
}
