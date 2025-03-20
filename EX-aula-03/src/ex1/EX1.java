package ex1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final int pessoas = 10 ;
            int saldos[] = new int[pessoas];
            
            int i;
            for (i=0; i < pessoas ; i++){
                System.out.println("Insira o saldo da pessoa "+(i+1)+" : ");
                saldos[i] = input.nextInt();
            }
            int counter = 0;
            for (i = 0; i < pessoas; i++){
                if (saldos[i] > 0){
                    System.out.println("A pessoa "+(i+1)+" possui saldo positivo de: "+saldos[i]);
                } else {
                    counter++;
                }
            }
            System.out.println("O número de pessoas com saldo negativo é: " + counter);
            input.close();
        }
    }

}
