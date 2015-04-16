package Jframe;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class NumberGuessingGameApplication {

    private static final String ERROR_TITLE = "Error";
    private static final String LOOKFEEL_ERROR_MSG =
            "System look and feel unavailable. Using default instead.";
    
    public static void main(String[] args) {
        
        try {
           
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, LOOKFEEL_ERROR_MSG, ERROR_TITLE,
                    JOptionPane.ERROR_MESSAGE);
        }
        
        // Start up game window
        java.awt.EventQueue.invokeLater(() -> {
            new NumberGuessingGameWindow().setVisible(true);
        });
        
    }
    
}
