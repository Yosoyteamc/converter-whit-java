package com.converter.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.converter.controller.ControllerCoin;
import com.converter.controller.ControllerTemp;
import com.converter.model.*;

public class ConverterView {

	public static void main(String[] args) {
	    
		String[] options = {
	            "Convertir moneda",
	            "Convertir temperatura"
	    };
		
		String[] coins = new CoinConverter().getCoins();
		String[] temps = new TempConverter().getTemps();
		
	    ImageIcon icon = new ImageIcon();
	    Boolean continueRun = true;
	    
	    while(continueRun) {
	        String optionResp = (String) JOptionPane.showInputDialog(null, 
	        		"Seleccione el tipo de conversión :", "Options", 
	        		JOptionPane.DEFAULT_OPTION, icon, options, options[0]);
	                
	        switch (optionResp) {
			case "Convertir moneda": {
				String myCoin = (String) JOptionPane.showInputDialog(null,
						"Tu moneda es:", "coin",
						JOptionPane.DEFAULT_OPTION, icon, coins, coins[0]
						);
				myCoin = ControllerCoin.validateType(myCoin);
				
				String myCoinValue = (String) JOptionPane.showInputDialog("¿Cual es el valor a convertir?",null);
				double myCoinValueDouble = ControllerCoin.validateCoin(myCoinValue);
				
				String toCoin = (String) JOptionPane.showInputDialog(null,
						"Seleccione el tipo a convertir :", "coin",
						JOptionPane.DEFAULT_OPTION, icon, coins, coins[0]
						);
				toCoin = ControllerCoin.validateType(toCoin);
				
				CoinConverter toConverter = new CoinConverter(myCoin, myCoinValueDouble, toCoin);
				String result = ControllerCoin.converter(toConverter);
				
				JOptionPane.showMessageDialog(null, myCoinValue +" "+ myCoin + "s a " + toCoin + " son: " + result);
				
				break;
			}
			case "Convertir temperatura":
				String myTemp = (String) JOptionPane.showInputDialog(null,
						"Tu temperatura es:", "coin",
						JOptionPane.DEFAULT_OPTION, icon, temps, temps[0]
						);
				myTemp = ControllerTemp.validateType(myTemp);
				
				String myTempValue = (String) JOptionPane.showInputDialog("¿Cual es el valor a convertir?",null);
				double myTempValueDouble = ControllerTemp.validateTemp(myTempValue);
				
				String toTemp = (String) JOptionPane.showInputDialog(null,
						"Seleccione el tipo a convertir :", "coin",
						JOptionPane.DEFAULT_OPTION, icon, temps, temps[0]
						);
				toTemp = ControllerTemp.validateType(toTemp);
				
				TempConverter toConverter = new TempConverter(myTemp, myTempValueDouble, toTemp);
				String result = ControllerTemp.converter(toConverter);
				
				JOptionPane.showMessageDialog(null, myTempValue +" "+ myTemp + " a " + toTemp + " son: " + result);
				
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: "+ optionResp);
			}
	        
	        int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar convirtiendo?", "Alerta!", JOptionPane.YES_NO_OPTION);
	        System.out.println(resp);
	        if(resp == 1) {
	        	continueRun = false;
	        }
	    }
	    System.exit(0);
	    
	}
}
