package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (verifyFibonacci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacc!");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean verifyFibonacci(int n) {
        int a = 0;
        int b = 1;

        while (a <= n) {
            if (a == n) {
                return true;
            }

            int sum = a + b;
            a = b;
            b = sum;
        }

        return false;

	}

}
