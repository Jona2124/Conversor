package Conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertirCelsiusFahrenheit(double valor) {
		double CFahrenheit = (valor * 1.8) + 32;
		CFahrenheit = (double)Math.round(CFahrenheit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + CFahrenheit + " Fahrenheit");
	}
	public void ConvertirCelisusKelvin(double valor) {
		double CKelvin = valor + 273.15;
		CKelvin = (double)Math.round(CKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + CKelvin + " Kelvin");
	}
	public void ConvertirCelsiusRankine(double valor) {
		double CRankine = (valor * 1.8) + 491.67;
		CRankine = (double)Math.round(CRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + CRankine + " Rankine");
	}
	
	
	
	public void ConvertirFahrenheitCelsius(double valor) {
		double FCelsius = (valor - 32) * ( 0.556 );
		FCelsius = (double)Math.round(FCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + FCelsius + " Celsius");
	}
	public void ConvertirFahrenheitKelvin(double valor) {
		double FKelvin = (valor + 459.67)*(0.556);
		FKelvin = (double)Math.round(FKelvin * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + FKelvin + " Kelvin");
	}
	public void ConvertirFahrenheitRankine(double valor) {
		double FRankine = valor + 459.67;
		FRankine = (double)Math.round(FRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a "+ FRankine + " Rankine");
	}
	
	
	public void ConvertirKelvinCelsius(double valor) {
		double KCelsius = valor - 273.15;
		KCelsius = (double)Math.round(KCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + KCelsius + " Celsius");
	}
	public void ConvertirKelvinFahrenheit(double valor) {
		double KFahrenhit = ((valor - 273.15) * (1.8)) + 32;
		KFahrenhit = (double)Math.round(KFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + KFahrenhit + " Fahrenheit");
	}
	public void ConvertirKelvinRankine(double valor) {
		double KRankine = valor * 1.8 ;
		KRankine = (double)Math.round(KRankine * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + KRankine + " Rankine");
	}
	
	
	public void ConvertirRankineCelsius(double valor) {
		double RCelsius = (valor - 491.67) * (0.556);
		RCelsius = (double)Math.round(RCelsius * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + RCelsius + " Celsius");
	}
	public void ConvertirRankineFahrenheit(double valor) {
		double RFahrenhit = valor - 459.67;
		RFahrenhit = (double)Math.round(RFahrenhit * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a "+ RFahrenhit + " Fahrenheit");
	}
	public void ConvertirRankineKelvin(double valor) {
		double RKelvin = valor * (0.556);
		RKelvin = (double)Math.round(RKelvin* 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Es igual a " + RKelvin + " Kelvin");
	}

}
