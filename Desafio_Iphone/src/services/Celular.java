package services;

import ferramentas.AparelhoTelefonico;

public class Celular implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");

    }
}
