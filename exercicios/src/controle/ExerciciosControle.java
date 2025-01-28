package controle;

import java.util.Scanner;

public class ExerciciosControle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe um numero de 1 a 10? ");
		
		int numero = entrada.nextInt();
		
		if (numero <=10 & numero >=0) {
			if (numero % 2 == 0){
				System.out.println("Numero é par");		
			}else {
				System.out.println("Numero é impar");
			}
		} else {
			
			System.out.println("Numero invalido!!!");
		}
		
		entrada.close();
		
	}

}
