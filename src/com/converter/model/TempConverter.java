package com.converter.model;

public class TempConverter {
	public static String[] tempTypes = {
		"Celsius",
		"Fahrenheit",
		"Kelvin",
		"Rankine"
	};
	private String tempType;
	private double tempValue;
	private String tempToConvert;
	
	public TempConverter() {
		
	}
	
	public TempConverter(String type, double temp, String toType) {
		try {
			for(String tempInTemps: TempConverter.tempTypes ) {
				if(type.equals(tempInTemps)) {
					this.tempType = type;
				}
				if(toType.equals(tempInTemps)) {
					this.tempToConvert = toType;
				}
			}
			this.tempValue = temp;
			
			if(this.tempType == null || this.tempToConvert == null) {
				throw new Exception("'El tipo de valor a convertir no se ha encontrado'");
			}
		}
		catch(Exception e ) {
			System.err.println("Se ha generado un Error: " + e.getMessage());
		}		
	}

	public String[] getTemps() {
		return TempConverter.tempTypes;
	}
		
	public String getTempType() {
		return tempType;
	}

	public void setTempType(String tempType) {
		this.tempType = tempType;
	}

	public double getTempValue() {
		return tempValue;
	}

	public void setTempValue(float tempValue) {
		this.tempValue = tempValue;
	}

	public String getTempToConvert() {
		return tempToConvert;
	}

	public void setTempToConvert(String tempToConvert) {
		this.tempToConvert = tempToConvert;
	}
	
	
	
}
