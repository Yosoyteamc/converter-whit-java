package com.converter.model;

public class CoinConverter {
	
	private static String[] coins = {
		"Peso Colombiano",
		"Dolar",
		"Euro",
		"Libra Esterlina",
		"Yen Japonés",
		"Won sul-coreano"
	};
	private String coin;
	private double valueToConvert;
	private String coinToConvert;
	
	public CoinConverter() {
	}
	
	public CoinConverter(String coin, double valueToConvert, String coinToConvert){
		try {
			for(String coinInCoins: CoinConverter.coins ) {
				if(coin.equals(coinInCoins)) {
					this.coin = coin;
				}
				if(coinToConvert.equals(coinInCoins)) {
					this.coinToConvert = coinToConvert;
				}
			}
			this.valueToConvert = valueToConvert;
			
			if(this.coin == null || this.coinToConvert == null) {
				throw new Exception("'El tipo de valor a convertir no se ha encontrado'");
			}
		}
		catch(Exception e ) {
			System.err.println("Se ha generado un Error: " + e.getMessage());
		};
	}
	


	public String getCoin() {
		return coin;
	}
	
	public String[] getCoins() {
		return CoinConverter.coins;
	}

	public void setCoin(String coin) {
		this.coin = coin;
	}

	public double getValueToConvert() {
		return valueToConvert;
	}

	public void setValueToConvert(double valueToConvert) {
		this.valueToConvert = valueToConvert;
	}

	public String getCoinToConvert() {
		return coinToConvert;
	}

	public void setCoinToConvert(String coinToConvert) {
		this.coinToConvert = coinToConvert;
	}
	
}
