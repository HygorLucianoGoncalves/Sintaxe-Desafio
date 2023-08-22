import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Por favor, digite a Agência !");
        agencia = teclado.nextLine();

        System.out.println("Por favor, digite o Nome Cliente !");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite o número do saldo !");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        teclado.close();
    }

}
