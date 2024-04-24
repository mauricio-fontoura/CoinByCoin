package br.com.cconverter.models;

public class MenuLayout {
	
	private String menu = 
			""" 
		*************************************
		Seja bem-vindo/a ao Conversor de Moeda =]
		
		0) Sair
		1) Dólar =>> Peso argentino
		2) Peso argentino =>> Dólar
		3) Dólar =>> Real brasileiro
		4) Real brasileiro =>> Dólar
		5) Dólar =>> Israeli New Shekel
		6) Israeli New Shekel => Dólar
		7) Real Brasileiro =>> Israeli New Shekel
		8) Israeli New Shekel => Real Brasileiro
		9) Euro => Israeli New Shekel
		10) Israeli New Shekel => Euro
		
		Escolha uma opção válida:
		*************************************
			""";
	
	public String getMenu() {
		return menu;
	}
}
