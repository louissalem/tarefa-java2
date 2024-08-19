package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numero;
while (true) {
	System.out.print("Digite um Número de 3 algoritmos menor que 1000:");
    numero = scanner.nextInt();
    if (numero >= 100 && numero < 1000) {
        break;
    } else {
        System.out.println("Digite um número menor que 1000.");
    }
}

int centena = numero / 100;
int dezena = (numero % 100) / 10;
int unidade = numero % 10;

if (centena < dezena && dezena < unidade) {
    System.out.println("O número " + numero + " é ascendente.");
} else {
    System.out.println("O número " + numero + " não é ascendente.");
}

scanner.close();
}

	}


