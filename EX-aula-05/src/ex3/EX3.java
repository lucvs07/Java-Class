package ex3;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int nAlunos = 0;
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Insira a quantidade de alunos presentes: ");
            nAlunos = input.nextInt();
            String[] nomes = new String[nAlunos];
            for (int i = 0; i < nAlunos; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = input.next();
            }

        }
        
    }

}
