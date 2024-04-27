package Programa;

import Vista.VistaFigura;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FigurasGeometricas {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws SQLException {

      
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaFigura().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FigurasGeometricas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}

 
