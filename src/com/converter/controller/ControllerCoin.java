package com.converter.controller;

import javax.swing.JOptionPane;

import com.converter.model.CoinConverter;

public class ControllerCoin {
	
	public static double validateCoin(String val) {
		try {
			double value = Double.valueOf(val);
			return value;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El valor ingresado no es un numero", "Error de conversion", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		return 0.0;
	}
	
	public static String validateType(String val) {
		if(val == null) {
			JOptionPane.showMessageDialog(null, "El valor ingresado no es un tipo", "Error de conversion", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			return "";
		}
		else {
			return val;
		}
	}
	
	public static String converter(CoinConverter converter) {
		double result;
		switch (converter.getCoin()){
		case "Peso Colombiano":
			if(converter.getCoinToConvert() == "Dolar") {
				result = converter.getValueToConvert()*0.00021;
				result = Math.round(result * 100.0) / 100.0;
				return result + " dolares";
			}
			if(converter.getCoinToConvert() == "Euro") {
				result = converter.getValueToConvert()*0.00020;
				result = Math.round(result * 100.0) / 100.0;
				return result + " euros";
			}
			if(converter.getCoinToConvert() == "Libra Esterlina") {
				result = converter.getValueToConvert()*0.00017;
				result = Math.round(result * 100.0) / 100.0;
				return result + " libras";
			}
			if(converter.getCoinToConvert() == "Yen Japonés") {
				result = converter.getValueToConvert()*0.029;
				result = Math.round(result * 100.0) / 100.0;
				return result + " yenes";
			}
			if(converter.getCoinToConvert() == "Won sul-coreano") {
				result = converter.getValueToConvert()*0.27;
				result = Math.round(result * 100.0) / 100.0;
				return result + " Won";
			}
			else {
				return converter.getValueToConvert() + " pesos";
			}
		case "Dolar":
			if(converter.getCoinToConvert() == "Peso Colombiano") {
				result = converter.getValueToConvert()*4847.34;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			if(converter.getCoinToConvert() == "Euro") {
				result = converter.getValueToConvert()*0.95;
				result = Math.round(result * 100.0) / 100.0;
				return result + " euros";
			}
			if(converter.getCoinToConvert() == "Libra Esterlina") {
				result = converter.getValueToConvert()*0.81;
				result = Math.round(result * 100.0) / 100.0;
				return result + " libras";
			}
			if(converter.getCoinToConvert() == "Yen Japonés") {
				result = converter.getValueToConvert()*137.72;
				result = Math.round(result * 100.0) / 100.0;
				return result + " yens";
			}
			if(converter.getCoinToConvert() == "Won sul-coreano") {
				result = converter.getValueToConvert()*1306.47;
				result = Math.round(result * 100.0) / 100.0;
				return result + "Wons";
			}
			else {
				return converter.getValueToConvert() + " dolares";
			}
		case "Euro":
			if(converter.getCoinToConvert() == "Dolar") {
				result = converter.getValueToConvert()*1.05;
				result = Math.round(result * 100.0) / 100.0;
				return result + " dolares";
			}
			if(converter.getCoinToConvert() == "Peso Colombiano") {
				result = converter.getValueToConvert()*5107.40;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			if(converter.getCoinToConvert() == "Libra Esterlina") {
				result = converter.getValueToConvert()*0.86;
				result = Math.round(result * 100.0) / 100.0;
				return result + " libras";
			}
			if(converter.getCoinToConvert() == "Yen Japonés") {
				result = converter.getValueToConvert()*145.11;
				result = Math.round(result * 100.0) / 100.0;
				return result + " yens";
			}
			if(converter.getCoinToConvert() == "Won sul-coreano") {
				result = converter.getValueToConvert()*1376.69;
				result = Math.round(result * 100.0) / 100.0;
				return result + " wons";
			}
			else {
				return converter.getValueToConvert() + " euros";
			}
		case "Libra Esterlina":
			if(converter.getCoinToConvert() == "Dolar") {
				result = converter.getValueToConvert()*1.23;
				result = Math.round(result * 100.0) / 100.0;
				return result + " dolares";
			}
			if(converter.getCoinToConvert() == "Euro") {
				result = converter.getValueToConvert()*1.16;
				result = Math.round(result * 100.0) / 100.0;
				return result + " euros";
			}
			if(converter.getCoinToConvert() == "Peso Colombiano") {
				result = converter.getValueToConvert()*5947.44;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			if(converter.getCoinToConvert() == "Yen Japonés") {
				result = converter.getValueToConvert()*168.96;
				result = Math.round(result * 100.0) / 100.0;
				return result + " yens";
			}
			if(converter.getCoinToConvert() == "Won sul-coreano") {
				result = converter.getValueToConvert()*1602.92;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			else {
				return converter.getValueToConvert() + " libras";
			}
		case "Yen Japonés":
			if(converter.getCoinToConvert() == "Dolar") {
				result = converter.getValueToConvert()*0.0073;
				result = Math.round(result * 100.0) / 100.0;
				return result + " dolares";
			}
			if(converter.getCoinToConvert() == "Euro") {
				result = converter.getValueToConvert()*0.0069;
				result = Math.round(result * 100.0) / 100.0;
				return result + " euros";
			}
			if(converter.getCoinToConvert() == "Libra Esterlina") {
				result = converter.getValueToConvert()*0.0059;
				result = Math.round(result * 100.0) / 100.0;
				return result + " lbras";
			}
			if(converter.getCoinToConvert() == "Peso Colombiano") {
				result = converter.getValueToConvert()*35.20;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			if(converter.getCoinToConvert() == "Won sul-coreano") {
				result = converter.getValueToConvert()*9.49;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			else {
				return converter.getValueToConvert() + " yens";
			}
		case "Won sul-coreano":
			if(converter.getCoinToConvert() == "Dolar") {
				result = converter.getValueToConvert()*0.00077;
				result = Math.round(result * 100.0) / 100.0;
				return result + " dolares";
			}
			if(converter.getCoinToConvert() == "Euro") {
				result = converter.getValueToConvert()*0.00073;
				result = Math.round(result * 100.0) / 100.0;
				return result + " euros";
			}
			if(converter.getCoinToConvert() == "Libra Esterlina") {
				result = converter.getValueToConvert()*0.00062;
				result = Math.round(result * 100.0) / 100.0;
				return result + " libras";
			}
			if(converter.getCoinToConvert() == "Yen Japonés") {
				result = converter.getValueToConvert()*0.11;
				result = Math.round(result * 100.0) / 100.0;
				return result + " yens";
			}
			if(converter.getCoinToConvert() == "Peso Colombiano") {
				result = converter.getValueToConvert()*3.71;
				result = Math.round(result * 100.0) / 100.0;
				return result + " pesos";
			}
			else {
				return converter.getValueToConvert() + " wons";
			}
		default:
			System.out.println("No se puede hacer la conversión");
		}
		return "0.0";
	}

}
