import java.util.Scanner;

public class MultiTres {

    static int n1, n2, n3;
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();

        System.out.println("Digite o terceirp número: ");
        n3 = ler.nextInt();
        
        System.out.println("A multiplicação dos três números é: " + n1 * n2 * n3);

    }
}
