package ex2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final int N = 10;
            int nums[] = new int[N];
            
            int i;
            for (i = 0; i < N; i++){
                System.out.println("Insira o número inteiro ["+(i+1)+"] : ");
                nums[i] = input.nextInt();
            }
            int pos = 0;
            int max_num = 0;
            for (i = 0; i < N; i++){
                if (nums[i] > max_num){
                    max_num = nums[i];
                    pos = i;
                }
            }
            System.out.println("O número máximo do vetor : " + max_num + " está no index ["+pos+"]");
            input.close();
        }
    }

}
