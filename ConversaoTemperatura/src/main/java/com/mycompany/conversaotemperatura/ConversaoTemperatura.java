// Função

package com.mycompany.conversaotemperatura;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite a temperatura em Fahrenheit: ");
        try {
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);
            System.out.printf("%.2f°F equivale a %.2f°C%n", fahrenheit, celsius);
        } catch (Exception e) {
            System.out.println("Erro: Digite um número válido.");
            scanner.close();
            return;
        }
        

        System.out.print("Digite a temperatura em Celsius: ");
        try {
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, fahrenheit);
        } catch (Exception e) {
            System.out.println("Erro: Digite um número válido.");
            scanner.close();
            return;
        }
        
        scanner.close();
    }
    

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}