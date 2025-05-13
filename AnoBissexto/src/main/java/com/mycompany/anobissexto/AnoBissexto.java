// Função

package com.mycompany.anobissexto;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite um ano: ");
        try {
            int ano = scanner.nextInt();
            if (ano <= 0) {
                System.out.println("Erro: O ano deve ser positivo.");
                scanner.close();
                return;
            }
            

            boolean bissexto = ehBissexto(ano);
            System.out.println("O ano " + ano + " " + (bissexto ? "é" : "não é") + " bissexto.");
            
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        }
        
        scanner.close();
    }
    

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}