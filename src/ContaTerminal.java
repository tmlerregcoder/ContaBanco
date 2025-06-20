import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        var numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite a Agência!");
        var agencia = scan.nextLine();
        System.out.println("Por favor, digite o Nome!");
        var nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o Saldo!");
        String temp = scan.next();
        double saldo;
        saldo = temp.contains(",")? Double.parseDouble(temp.replace(",",".")): Double.parseDouble(temp);
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);
        scan.close();
    }
}