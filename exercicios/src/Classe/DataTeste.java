package Classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data p1 = new Data();
		p1.dia = 03;
		p1.mes = 02;
		p1.ano = 1998;
		
		Data p2 = new Data();
		p2.dia = 17;
		p2.mes = 03;
		p2.ano = 2000;
		
		String dataFormatada1 = p1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(p2.obterDataFormatada());
		
	}

}
