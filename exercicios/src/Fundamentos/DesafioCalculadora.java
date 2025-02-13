package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por gentileza o primeiro numero?");
		double num1 = entrada.nextDouble();
		
		System.out.println("Por gentileza o segundo numero?");
		double num2 = entrada.nextDouble();

		
		System.out.println("Informar qual operação deseja?");
		String operacao = entrada.next();
		
		//Lógica
		Double resultado = "+" == (operacao) ? num1 + num2 : 0;
		resultado = "-" == (operacao) ? num1 - num2 : resultado;
		resultado = "*" == (operacao) ? num1 * num2 : resultado;
		resultado = "/" == (operacao) ? num1 / num2 : resultado;
		resultado = "%" == (operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, operacao, num2, resultado);


		
		entrada.close();		
	
				
	}

}
