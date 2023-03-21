package Main;

import javax.swing.JOptionPane;

import Conversor.ConversorMoneda;


public class OpcionesConversionMoneda {
	
	ConversorMoneda monedas = new ConversorMoneda();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Peso Chileno a Dólar", "De Peso Chileno a Euro", "De Peso Chileno a Libras Esterlinas", "De Peso Chileno a Yen Japonés", "De Peso Chileno a Won sub-coreano", "De Dólar a Peso Chileno", "De Euro a Peso Chileno", "De Libras Esterlinas a Peso Chileno", "De Yen Japonés a Peso Chileno", "De Won sub-coreano a Peso Chileno"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Peso Chileno a Dólar": 
		monedas.ConvertirPesoChilenoDolar(valor);
		break;
	
	case "De Peso Chileno a Euro": 
		monedas.ConvertirPesoChilenoEuro(valor);
		break;
		
	case "De Peso Chileno a Libras Esterlinas":
		monedas.ConvertirPesoChilenoLibra(valor);
		break;
		
	case "De Peso Chileno a Yen Japonés":
		monedas.ConvertirPesoChilenoYen(valor);
		break;
		
	case "De Peso Chileno a Won sub-coreano":
		monedas.ConvertirPesoChilenoWon(valor);
		break;
	
	case "De Dólar a Peso Chileno":
		monedas.ConvertirDolarPesoChileno(valor);
		break;
		
	case "De Euro a Peso Chileno":
		monedas.ConvertirEuroPesoChileno(valor);
		break;
		
	case "De Libras Esterlinas a Peso Chileno":
		monedas.ConvertirLibraPesoChileno(valor);
		break;
	 
	case "De Yen Japonés a Peso Chileno":
		monedas.ConvertirYenPesoChileno(valor);
		break;
		
	case "De Won sub-coreano a Peso Chileno":
		monedas.ConvertirWonPesoChileno(valor);
		break;
	}
	}

}