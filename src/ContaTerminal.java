
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.printf("Por favor, digite o número da Agencia: ");
        numero = ler.nextInt();

        System.out.printf("Nome da agencia: ");
        Agencia = ler.next();

        System.out.printf("Nome do cliente: ");
        NomeCliente = ler.next();

        System.out.printf("Saldo da conta:");
        Saldo = ler.nextDouble();

        System.out.printf(
                "text Olá %s obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %2f ja esta disponivel para saque.",
                NomeCliente, Agencia, numero, Saldo);
    }
}