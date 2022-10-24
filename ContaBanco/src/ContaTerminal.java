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
        show.print("O número da sua conta: ");
        numero = sc.nextInt();
        show.print("Seu Nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        show.print("O número da sua agência: ");
        agencia = sc.next();
        show.print("Seu saldo: ");
        saldo = sc.nextDouble();

        show.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f" +
                " já está disponível para o saque", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
