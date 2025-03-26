package ex1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        System.out.println("Calcular Média");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a primeira nota: ");
            float n1 = input.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float n2 = input.nextFloat();
            float media = calcularMedia(n1, n2);
            System.out.println("Média: " + media);
            input.close();
        }
    }

    public static float calcularMedia(float n1, float n2){
        int p1 = 4;
        int p2 = 6;
        return (n1 * p1 + n2 * p2) / (p1 + p2);
    }

}
