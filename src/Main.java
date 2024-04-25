import br.com.cconverter.models.*;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		var reading = new Scanner(System.in);
		var exchangeOptions = new MenuLayout();
		var coinOnBrl = new SearchForCurrency("brl");
		var coinOnUsd = new SearchForCurrency("usd");
		var coinOnArs = new SearchForCurrency("ars");
		var coinOnIsl = new SearchForCurrency("isl");
		var coinOnEur = new SearchForCurrency("eur");
		
		int check = -1;
			while(check != 0) {
				try {
					System.out.println(exchangeOptions);
					check = reading.nextInt();
					switch (check) {
						case 0:{
							System.out.println("\n>>> Programa finalizado <<<");
						} break;
						case 1:{
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [USD] corresponde ao valor final de =>>> " + inputValue * coinOnUsd.getArgentinoValue() + " [ARS]");
						} break;
						case 2: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [ARS] corresponde ao valor final de =>>> " + inputValue * coinOnArs.getDollarValue() + " [USD]");
						} break;
						case 3: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [USD] corresponde ao valor final de =>>> " + inputValue * coinOnUsd.getReaisValue() + " [BRL]");
						} break;
						case 4: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [BRL] corresponde ao valor final de =>>> " + inputValue * coinOnBrl.getDollarValue() +" [USD]");
						} break;
						case 5: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [USD] corresponde ao valor final de =>>> " + inputValue * coinOnUsd.getIsraeliValue() +" [ISL]");
						} break;
						case 6: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [ISL] corresponde ao valor final de =>>> " + inputValue * coinOnIsl.getDollarValue() +" [USD]");	
						} break;
						case 7: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [BRL] corresponde ao valor final de =>>> " + inputValue * coinOnBrl.getIsraeliValue() +" [ISL]");
						} break;
						case 8: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [ISL] corresponde ao valor final de =>>> " + inputValue * coinOnIsl.getReaisValue() +" [BRL]");
						} break;
						case 9: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [EUR] corresponde ao valor final de =>>> " + inputValue * coinOnEur.getDollarValue() +" [USD]");
						} break;
						case 10: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [USD] corresponde ao valor final de =>>> " + inputValue * coinOnUsd.getEuroValue() +" [EUD]");
						}break;
						case 11: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [EUR] corresponde ao valor final de =>>> " + inputValue * coinOnEur.getReaisValue() +" [BRL]");
						}break;
						case 12: {
							System.out.println("Digite o valor que deseja converter");
							Double inputValue = reading.nextDouble();
							System.out.println("Valor " + inputValue + " [BRL] corresponde ao valor final de =>>> " + inputValue * coinOnBrl.getEuroValue() +" [EUR]");
						}break;
					}
				} catch (Exception e) {
				 		
				 		System.out.println(e.getMessage());
				}
			}
			
	}
}
