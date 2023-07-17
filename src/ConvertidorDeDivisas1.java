import javax.swing.JComboBox;
import javax.swing.JOptionPane;
//import javax.swing.*;

public class ConvertidorDeDivisas1 {
    public static void main(String[] args) {
        String[] opcionesDivisas = {"Dólar", "Euro", "Libra"};
        boolean salir = false;
        
        while (!salir) {
        	
            // Crear un JComboBox para seleccionar la divisa
            JComboBox<String> comboBoxDivisas = new JComboBox<>(opcionesDivisas);
            
            // Crear un campo de entrada para ingresar el número
            String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad en pesos mexicanos:", 0);
          
            if (input == null) {
                break;
            }
            
            // Convertir la entrada a un número flotante  
            try {
            	float numero = Float.parseFloat(input);
           
            // Mostrar el cuadro de diálogo para seleccionar la divisa
            int opcion = JOptionPane.showConfirmDialog(null, comboBoxDivisas, "Selecciona una divisa", JOptionPane.OK_CANCEL_OPTION);
            
           // int opcion2 = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar otra edad?", "Opción", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.CANCEL_OPTION) {
                break;
            }
            
            if (opcion == JOptionPane.OK_OPTION) {
                // Obtener la divisa seleccionada
                String divisa = (String) comboBoxDivisas.getSelectedItem();
                
                // Realizar la operación según la divisa seleccionada
                float resultado = 0;
                
                // switch ==  varios else if
                switch (divisa) {
                    case "Dólar":
                        resultado = numero * 16.75f;  // Supongamos que el tipo de cambio es 16.75
                        break;
                    case "Euro":
                        resultado = numero * 18.81f;  // Supongamos que el tipo de cambio es 18.81
                        break;
                    case "Libra":
                        resultado = numero * 21.92f;  // Supongamos que el tipo de cambio es 1.41
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            } else {
                break;  // Salir del bucle si se cancela la selección de divisa
            }
            
            } catch (NumberFormatException e) {
            	 JOptionPane.showMessageDialog(null, "Solo se aceptan numeros" + e);
           }  
        }
        
        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el programa!");
    }
}
