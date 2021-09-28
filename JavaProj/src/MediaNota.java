import java.util.Scanner;

public class MediaNota {
    static String nome;
    static double n1, n2;
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno(a): ");
        nome = ler.nextLine();
        
        System.out.println("Digite a nota 1: ");
        n1 = ler.nextDouble();

        System.out.println("Digite a nota 2: ");
        n2 = ler.nextDouble();

        System.out.println("A média das notas é: " + (n1 + (n2 * 2) / 3));

    }
}
