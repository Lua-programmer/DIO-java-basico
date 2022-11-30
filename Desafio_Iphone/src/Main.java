import ferramentas.ReprodutorMusical;
import services.Celular;
import services.Iphone;
import services.Navegador;
import services.Reprodutor;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.atender();
        celular.ligar();
        celular.iniciarCorreioDeVoz();
        System.out.println("-----------------------------------");

        Navegador chrome = new Navegador();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina();
        System.out.println("-----------------------------------");

        Reprodutor itunes = new Reprodutor();
        itunes.pausar();
        itunes.selecionarMusica();
        itunes.tocar();
        System.out.println("-----------------------------------");

        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioDeVoz();

        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        iphone.pausar();
        iphone.selecionarMusica();
        iphone.tocar();
    }

}