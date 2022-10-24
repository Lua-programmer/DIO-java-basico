import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PrintStream show = System.out;
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        show.println("Por favor digite seus dados: ");
        show.print("Seu número de identificação: ");
        numero = sc.nextInt();
        show.print("Seu Nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        show.print("O número da sua agência: ");
        agencia = sc.next();
        show.print("Seu saldo: ");
        saldo = sc.nextDouble();

        show.print("Usuário: " + numero + " " + nomeCliente + " \nAgência: " + agencia + "\nSeu saldo é: " + saldo);

        sc.close();
    }
}
