package Conversor;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	/*- Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sur-coreano
       
       - Convertir de Dólar a la moneda de tu país
       - Convertir de Euros a la moneda de tu país
       - Convertir de Libras Esterlinas a la moneda de tu país
       - Convertir de Yen Japonés a la moneda de tu país
       - Convertir de Won sur-coreano a la moneda de tu país*/
	
	public void ConvertirPesoChilenoDolar(double valor) {
		double monedaDolar = valor / 814.84;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesoChilenoEuro(double valor) {
		double monedaEuro = valor / 869.50;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesoChilenoLibra(double valor) {
		double monedaLibra = valor / 992.66;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesoChilenoYen(double valor) {
		double monedaYen = valor / 6.17;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirPesoChilenoWon(double valor) {
		double monedaWon = valor / 0.62;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	
	public void ConvertirDolarPesoChileno(double valor) {
		double monedaDolar = 814.84 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "El dolar es igual a " + monedaDolar + " pesos chilenos");
	}
	public void ConvertirEuroPesoChileno(double valor) {
		double monedaEuro = valor * 869.50;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "El euro es iagual a " + monedaEuro + " pesos");
	}
	public void ConvertirLibraPesoChileno(double valor) {
		double monedaLibra = valor * 992.66;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "La libra esterlina es igual a " + monedaLibra + " pesos chilenos");
	}
	public void ConvertirYenPesoChileno(double valor) {
		double monedaYen = valor * 6.17;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "El yen japonés es igual a " + monedaYen + " pesos chilenos");
	}
	public void ConvertirWonPesoChileno(double valor) {
		double monedaWon = valor * 0.62;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "El won sur-coreano es igual a " + monedaWon + " pesos chilenos");
	}

}
