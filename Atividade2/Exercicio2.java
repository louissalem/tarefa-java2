package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int placa;

	while (true) {
		System.out.print("Digite a parte numérica da placa do carro (4 dígitos): ");
		placa = scanner.nextInt();

		 if (placa >= 1000 && placa <= 9999) {
		  break;
	  } else {
		  System.out.println("Número inválido! Por favor, digite um número com 4 dígitos.");
	 }
   }

		       
		 int ultimoDigito = placa % 10;

		 String diaRodizio;
		  switch (ultimoDigito) {
		  case 1:
		  case 2:
			  diaRodizio = "Seg";
			  break;
		  case 3:
		  case 4:
			  diaRodizio = "Terç";
			  break;
		  case 5:
		  case 6:
			  diaRodizio = "Qua";
			  break;
		  case 7:
		  case 8:
			  diaRodizio = "Qui";
			  break;
		  case 9:
		  case 0:
			  diaRodizio = "Sex";
			  break;
		  default:
			  diaRodizio = "Sab"; 
		      break;
		        }

		        System.out.println("O rodízio do carro com placa " + placa + " ocorre na " + diaRodizio + ".");

		        scanner.close();
		    }
		}
