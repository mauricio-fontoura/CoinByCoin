package br.com.cconverter.models;


public class Exchange {
	
	private Double eur;
	private Double brl;
	private Double usd;
	private Double ars;
	
	

	public Double getEur() {
		return eur;
	}

	public Double getBrl() {
		return brl;
	}

	public Double getUsd() {
		return usd;
	}

	public Double getArs() {
		return ars;
	}
	
	
	public String toString() {
		return "REAL: " + brl + "\n" + "EURO: " + eur + "\n" + "Peso Argentino: " + ars + "\n" + "Dólar: " + usd;
	}
	
}
