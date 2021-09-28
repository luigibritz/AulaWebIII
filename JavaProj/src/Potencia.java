import java.util.Scanner;

public class Potencia {

    static double a;
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.println("Digite um valor pra variável A: ");
        a = ler.nextDouble();


        System.out.println("O dobro de A é: " + (a * 2));

        System.out.println("O triplo do dobro de A é: " + (a * 2) * 3);

        System.out.println("A metade do triplo do dobro de A é: " + ((a * 2) * 3) / 2);

        System.out.println("O quadrado da variável A é: " + Math.pow(a, 2));

        System.out.println("A quinta parte do dobro de A é: " + (a * 2) / 5);

    }
}
