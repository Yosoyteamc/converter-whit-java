package com.converter.controller;

import javax.swing.JOptionPane;

import com.converter.model.TempConverter;

public class ControllerTemp {
	
	public static double validateTemp(String val) {
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
	
	public static String converter(TempConverter converter) {
		double result;
		switch (converter.getTempType()) {
		case "Celsius":
			if(converter.getTempToConvert() == "Fahrenheit") {
				result = converter.getTempValue()*(9/5)+32;
				result = Math.round(result * 100.0) / 100.0;
				return result + " °F";
			}
			if(converter.getTempToConvert() == "Kelvin") {
				result = converter.getTempValue()+273.15;
				result = Math.round(result * 100.0) / 100.0;
				return result + " K";
			}
			if(converter.getTempToConvert() == "Rankine") {
				result = converter.getTempValue()*(9/5)+491.67;
				result = Math.round(result * 100.0) / 100.0;
				return result + " °R";
			}
			else {
				return converter.getTempValue() + " celsius";
			}
		case "Fahrenheit":
			if(converter.getTempToConvert() == "Celsius") {
				result = (converter.getTempValue()-32)*(5/9);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °C";
			}
			if(converter.getTempToConvert() == "Kelvin") {
				result = (converter.getTempValue()+ 459.67)*(5/9);
				result = Math.round(result * 100.0) / 100.0;
				return result + " K";
			}
			if(converter.getTempToConvert() == "Rankine") {
				result = (converter.getTempValue()+ 459.67);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °R";
			}
			else {
				return converter.getTempValue() + " celsius";
			}
		case "Kelvin":
			if(converter.getTempToConvert() == "Fahrenheit") {
				result = (converter.getTempValue()- 273.15)*(9/5)+32;
				result = Math.round(result * 100.0) / 100.0;
				return result + " °F";
			}
			if(converter.getTempToConvert() == "Celsius") {
				result = (converter.getTempValue()- 273.15);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °C";
			}
			if(converter.getTempToConvert() == "Rankine") {
				result = (converter.getTempValue()- 273.15)*(9/5)+ 491.67;
				result = Math.round(result * 100.0) / 100.0;
				return result + " °K";
			}
			else {
				return converter.getTempValue() + " celsius";
			}
		case "Rankine":
			if(converter.getTempToConvert() == "Fahrenheit") {
				result = (converter.getTempValue()- 459.67);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °F";
			}
			if(converter.getTempToConvert() == "Kelvin") {
				result = converter.getTempValue()*(5/9);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °K";
			}
			if(converter.getTempToConvert() == "Celsius") {
				result = (converter.getTempValue()- 461.67)*(5/9);
				result = Math.round(result * 100.0) / 100.0;
				return result + " °C";
			}
			else {
				return converter.getTempValue() + " celsius";
			}
		default:
			System.out.println("No se puede hacer la conversión");
		}
		return "0.0";
	}
}
