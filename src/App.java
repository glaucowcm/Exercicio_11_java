import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int num1;
        int num2;
        double numreal;
        double produto;
        double soma;
        double cubo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");

        num1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro:");

        num2 = teclado.nextInt();

        System.out.println("Digite o número real:");

        numreal = teclado.nextDouble();

        produto = 2 * num1 * (num2 / 2.0);

        soma = 3 * num1 + numreal;

        cubo = Math.pow(numreal, 3);

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("Soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("Terceiro elevado ao cubo: " + cubo);

    }
}