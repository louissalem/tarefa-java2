package aula2;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int op;
	        while (true) {
	            System.out.print("Digite o valor de op (1 para retângulo, 2 para triângulo): ");
	            op = scanner.nextInt();
	            
	            if (op == 1 || op == 2) {
	                break;
	            } else {
	                System.out.println("Valor inválido! Por favor, digite 1 ou 2.");
	            }
	        }

	        System.out.print("Digite o valor da base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Digite o valor da altura: ");
	        double altura = scanner.nextDouble();

	        double area;

	        if (op == 1) {
	            area = base * altura;
	            System.out.println("A área do retângulo é: " + area);
	        } else if (op == 2) {
	            area = (base * altura) / 2;
	            System.out.println("A área do triângulo é: " + area);
	        }

	        scanner.close();
	    }

	}


