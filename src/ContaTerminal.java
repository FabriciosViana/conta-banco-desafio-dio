import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu número: ");
        int numero = sc.nextInt();

        System.out.println("Digite o sua agência: ");
        String agencia = sc.next();

        sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine().toUpperCase();

        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + " " +  "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " " +"já está disponível para saque.");
        sc.close();
    }

}