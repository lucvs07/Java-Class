package ex2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        int nAlunos = 0;
        double notaMax = 0;
        int posMax = 0;
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Insira a quantidade de alunos: ");
            nAlunos = input.nextInt();
            String[] nomes = new String[nAlunos];
            double[] notas = new double[nAlunos];

            for (int i = 0; i < nAlunos; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = input.next();
                System.out.print("Digite a nota do aluno " + nomes[i] + ": ");
                notas[i] = input.nextDouble();
                if (notas[i] > notaMax){
                    notaMax = notas[i];
                    posMax = i;
                }
            }
            System.out.println("O aluno " + nomes[posMax] + " teve a maior nota, sendo ela: " + notas[posMax]);

        }
    }

}
