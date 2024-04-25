import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    int numeroConta;
    String nomeAgencia;
    String nomeCliente;
    double saldoConta;

    System.out.println("Por favor , digite o número da Agência:");
            numeroConta = scanner.nextInt(); // guardou numero da conta
            scanner.nextLine();
    System.out.println("Digite o nome da Agência:");
           nomeAgencia = scanner.nextLine(); // guardou nome da agencia 
    System.out.println("Digite seu nome:");
            nomeCliente = scanner.nextLine(); // guardou o nome do cliente
    System.out.println("Informe seu saldo:");
            saldoConta = scanner.nextDouble();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque." , nomeCliente , nomeAgencia , numeroConta , saldoConta);         
    }
}
