import javax.swing.*;

public class ClasePrueba {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        
        // Crear un JPanel como componente padre
        
        String message = "Ingresa tu nombre:";
        String initialValue = "John Doe";
        
        // Mostrar el cuadro de diálogo de entrada con el componente padre
        String input = JOptionPane.showInputDialog(panel, message, initialValue);
        
        if (input != null) {
            JOptionPane.showMessageDialog(panel, "¡Hola, " + input + "!");
        } else {
            JOptionPane.showMessageDialog(panel, "Operación cancelada.");
        }
        
        frame.pack();
        frame.setVisible(true);
    }
}
