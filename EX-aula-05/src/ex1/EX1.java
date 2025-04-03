package ex1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira a string (1): ");
            String str1 = input.nextLine();
            System.out.println("Insira a string(2): ");
            String str2 = input.nextLine();
            str1 = str1 + str2;
            System.out.println("String Final : " + str1 + " Quantidade de Caracteres: " + str1.length());
        }
    }

}
