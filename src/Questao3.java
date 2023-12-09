import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Você quer calcular a média de quantas notas?");
        double quantity = input.nextDouble();

        if(quantity <=0 || quantity <= 1) {
            System.out.println("Quantidade inválida!");
            return;
        }

        double sumGrades = 0;

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Insira a nota " + i + ":");
            double grade = input.nextDouble();
            sumGrades += grade;
        }
        double avarage = sumGrades / quantity;
        System.out.println("A média das notas é " + avarage);
    }
}