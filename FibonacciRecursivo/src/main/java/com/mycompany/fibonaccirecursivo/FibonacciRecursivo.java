// Função

package com.mycompany.fibonaccirecursivo;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o índice N para o termo de Fibonacci (N >= 0): ");
        try {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Erro: N deve ser não-negativo.");
                scanner.close();
                return;
            }
            

            long resultado = fibonacci(n);
            System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);
            
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        }
        
        scanner.close();
    }
    

    public static long fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}