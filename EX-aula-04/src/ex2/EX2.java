package ex2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.println("Calcular Média");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a primeira nota: ");
            float n1 = input.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float n2 = input.nextFloat();
            float media = calcularMedia(n1, n2);
            System.out.println("Média: " + media);
            String conceito = definirConceito(media);
            System.out.println("Conceito: " + conceito);
            input.close();
        }
    }

    /**
     * @param n1 - Nota 1 (float)
     * @param n2 - Nota 2 (float)
     * @return media (float)
     */
    public static float calcularMedia(float n1, float n2){
        int p1 = 4;
        int p2 = 6;
        return (n1 * p1 + n2 * p2) / (p1 + p2);
    }
    
    /**
     * @param media (float)
     * @return String com o conceito da média
     */
    public static String definirConceito(float media){
        if(media >= 8.5){
            return "E - Excelente";
        } else if(media >= 5 && media < 8.5){
            return "B - Bom";
        } else {
            return "R - Ruim";
        }
    }
}
