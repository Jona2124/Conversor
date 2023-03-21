package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        OpcionesConversionMoneda conversion = new OpcionesConversionMoneda();
        OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

        try {
            // Establecer los colores de fondo y texto de la ventana emergente y los botones
            UIManager.put("OptionPane.background", new Color(146, 208, 80));
            UIManager.put("Panel.background", new Color(146, 208, 80));
            UIManager.put("Button.background", new Color(0, 64, 128));
            UIManager.put("Button.foreground", Color.WHITE);
            

            // Establecer el tamaño mínimo de la ventana emergente y la fuente del botón
            UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));
            UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 22));
            

            // Establecer el tamaño de la zona de ingreso de datos y el tamaño del texto de la ventana emergente
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 24));
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 20));
            UIManager.put("OptionPane.font", new Font("Arial", Font.PLAIN, 18));
            UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 18));
            UIManager.put("TextField.background", Color.WHITE);
            UIManager.put("TextField.foreground", Color.BLACK);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    


        while (true) {
            Object opcionesObj = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Monedas", "Conversor de Temperatura" },
                    "Elegir");
            if (opcionesObj == null) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                JOptionPane.showMessageDialog(null, "Creado por Jonathan_C_M");
                return;
            }
            String opciones = opcionesObj.toString();
        
    


            switch (opciones) {
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    if (input == null) {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        JOptionPane.showMessageDialog(null, "Creado por Jonathan_C_M");
                        return;
                    }
                    try {
                        double valorRecibido = Double.parseDouble(input.trim());
                        conversion.ConvertirMonedas(valorRecibido);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido");
                    }

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Entra");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        JOptionPane.showMessageDialog(null, "Creado por Jonathan_C_M");
                        return; // Salimos del método main y finalizamos la ejecución del programa
                    }
                    break;

                case "Conversor de Temperatura":
                    String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    if (input1 == null) {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        JOptionPane.showMessageDialog(null, "Creado por Jonathan_C_M");
                        return;
                    }
                    try {
                        double valorRecibido = Double.parseDouble(input1.trim());
                        conversionT.ConvertirTemperaturas(valorRecibido);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido");
                    }

                    int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if (JOptionPane.OK_OPTION == respuestaT) {
                        System.out.println("Entra");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        JOptionPane.showMessageDialog(null, "Creado por Jonathan_C_M");
                        return;
                    }
                    break;}
            }
        }
    }
