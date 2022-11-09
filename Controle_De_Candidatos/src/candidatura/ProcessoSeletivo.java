package candidatura;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Processo Seletivo");
//        analizarCandidato(1900.00);
//        analizarCandidato(2200.00);
//        analizarCandidato(2000.00);
//        selecaoDeCandidatos();

        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Luana", "Zoe", "David", "Elliot", "Joaquim", "Anna", "Marcos", "Marcela", "Peter", "Jacob"};

        System.out.println("\nFORI");
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int i = 0; i < candidatos.length ; i++) {
            System.out.printf("O candidato de n° %d é o candidato %s \n", i, candidatos[i]);
        }

        System.out.println("\nFOREACH");
        for (String candidato: candidatos) {
            System.out.printf("O candidato selecionado foi  %s \n",candidato);
        }

    }

    static void selecaoDeCandidatos() {
        String[] candidatos = {"Luana", "Zoe", "David", "Elliot", "Joaquim", "Anna", "Marcos", "Marcela", "Peter", "Jacob"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: R$ %.2f%n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a próxima etapa!\n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATOS");
        }

    }
}
