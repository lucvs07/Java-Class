package ex3;
import java.util.Scanner;



public class EX3 {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 2;
        int[] rm = new int[MAX_STUDENTS];
        String[] nomes = new String[MAX_STUDENTS];
        double[] notas1 = new double[MAX_STUDENTS];
        double[] notas2 = new double[MAX_STUDENTS];
        double[] medias = new double[MAX_STUDENTS];
        int[] rmsAprovados = new int[MAX_STUDENTS];
        int countAprovados = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            for (int i = 0; i < MAX_STUDENTS; i++) {
                System.out.print("Digite o RM do aluno " + (i + 1) + ": ");
                rm[i] = scanner.nextInt();
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                nomes[i] = scanner.next();
                System.out.print("Digite a nota 1 do aluno " + nomes[i] + ": ");
                notas1[i] = scanner.nextDouble();
                System.out.print("Digite a nota 2 do aluno " + nomes[i] + ": ");
                notas2[i] = scanner.nextDouble();
            }
        }

        // Cálculo das médias e identificação dos alunos aprovados
        for (int i = 0; i < MAX_STUDENTS; i++) {
            medias[i] = (notas1[i] + notas2[i]) / 2;
            if (medias[i] >= 6.0) {
                rmsAprovados[countAprovados++] = rm[i];
            }
        }

        // Impressão dos RMs e médias dos alunos aprovados
        System.out.println("RMs e médias dos alunos aprovados:");
        for (int i = 0; i < countAprovados; i++) {
            System.out.println("Nome: "+nomes[i]+" RM: " + rmsAprovados[i] + ", Média: " + medias[i]);
        }
    }
}