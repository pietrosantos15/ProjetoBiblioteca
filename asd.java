import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        // ====== LEITURA ======
        // int a = input.nextInt();
        // double b = input.nextDouble();
        // input.nextLine(); <-- Usar quando int -> string
        // String s = input.nextLine();

        // ====== PROCESSAMENTO ======
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        
        double media = a * 2 + b + 3 + c * 4 + d * 1 / 2 + 3 + 4 + 1;
        
        if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        else if (media >= 7) {
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.printf("Media: %.1f\n ", media);
            System.out.println("Aluno em exame.");
            
            double notaexame = input.nextDouble();
            double recuperacao = (media + notaexame) / 2;
            
            if (recuperacao >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final = %.1f\n", media);
            }
            else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final = %.1f\n", media);
            }
        }
        
        
        // ====== SAÍDA ======
        // System.out.println();
        // System.out.printf("%.2f\n", valor);
    }
}