package aula2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o valor do primeiro lado: ");
		        double lado1 = scanner.nextDouble();

		        System.out.print("Digite o valor do segundo lado: ");
		        double lado2 = scanner.nextDouble();

		        System.out.print("Digite o valor do terceiro lado: ");
		        double lado3 = scanner.nextDouble();

		        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
		            
		            if (lado1 == lado2 && lado2 == lado3) {
		                System.out.println("O triângulo é equilátero.");
		            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
		                System.out.println("O triângulo é isósceles.");
		            } else {
		                System.out.println("O triângulo é escaleno.");
		            }
		        } else {
		            System.out.println("O valor não é forma um triângulo.");
		        }

		        scanner.close();
		    }
		}

	
