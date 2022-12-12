package com.converter.model;

public class CoinToCoin {
	
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
	
	public CoinToCoin(String coin, double valueToConvert, String coinToConvert){
		try {
			for(String coinInCoins: CoinToCoin.coins ) {
				if(coin.equals(coinInCoins)) {
					this.coin = coin;
				}
				if(coinToConvert.equals(coinInCoins)) {
					this.coinToConvert = coinToConvert;
				}
			}
			this.valueToConvert = valueToConvert;
		}
		catch(Exception e) {
			
		};
	}
	
	public CoinToCoin() {

	}

	public String getCoin() {
		return coin;
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
