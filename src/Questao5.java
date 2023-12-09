import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro (máximo 20):");
        int number = input.nextInt();

        if (number == 0 || number == 1){
            System.out.println("1");
            return;
        } else if (number > 20) {
            System.out.println("Resultado final excede a capacidade do programa!");
            return;
        }

        int i = 1;
        long result = 1;

        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("O fatorial de "+ number + " é " + result);
    }
}
