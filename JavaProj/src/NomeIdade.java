import java.util.Scanner;

public class NomeIdade {

    String nome;
    int idade;
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.println("********************************");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Você tem: " + idade + " anos");
    }
}