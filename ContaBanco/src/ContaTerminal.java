import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("");
        System.out.println("");

        System.out.println("Por favor digite o número de sua Agência: ");
        String agenciaNumero = scanner.next();

        System.out.println("Por favor digite o número de sua Conta Corrente: ");
        int contaCorrente = scanner.nextInt();

        System.out.println("Por favor digite seu Primeiro Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite seu Sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor digite o valor do primeiro depósito: ");
        double valorSaldo = scanner.nextDouble();
  
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar um contrato em um banco, sua agência é " + agenciaNumero + ", com a conta número " + contaCorrente + " e seu saldo é " + valorSaldo);
        
        scanner.close();

    }
    
}
