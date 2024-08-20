import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite sua Conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar sua conta em nosso banco. Sua agência é " + agencia +
                            ", sua conta é " + conta + " e seu saldo $ " + saldo + " está disponível.");
    }
}
