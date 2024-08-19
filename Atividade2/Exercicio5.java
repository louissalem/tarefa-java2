package aula2;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Digite o valor do primeiro ângulo: ");
		        int angulo1 = scanner.nextInt();

		        System.out.print("Digite o valor do segundo ângulo: ");
		        int angulo2 = scanner.nextInt();

		        System.out.print("Digite o valor do terceiro ângulo: ");
		        int angulo3 = scanner.nextInt();

		        if (angulo1 + angulo2 + angulo3 == 180) {
		            
		            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
		                System.out.println("O triângulo é retângulo.");
		            } else if (angulo1 >  90 || angulo2 > 90 || angulo3 > 90) {
		                System.out.println("O triângulo é obtusângulo.");
		            } else {
		                System.out.println("O triângulo é acutângulo.");
		            }
		        } else {
		            System.out.println("Os ângulos fornecidos não formam um triângulo válido.");
		        }

		        scanner.close();
		    }
		}

