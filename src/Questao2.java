import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Insira o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Escolha o número da operação: 1-somar, 2-subtrair, 3-dividir, 4-multiplicar, 5-resto, 6-raiz e 7-potência.");
        int operation = input.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                if (num1 != 0 && num2 !=0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Não é permitido divisões com 0.");
                }
                break;
            case 4:
                result = num1 * num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            case 6:
                result = Math.pow(num1, 1.0 / num2);
                break;
            case 7:
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        System.out.println(result);
    }
}
