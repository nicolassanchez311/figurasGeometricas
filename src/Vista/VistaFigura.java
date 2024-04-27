package Vista;

import Controlador.ControladorFiguras;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaFigura extends javax.swing.JFrame {

    private JFrame ventanaActual;
    ControladorFiguras controladoraFiguras;

    public VistaFigura() throws SQLException {
        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
        poblarComboBox();
        setLocationRelativeTo(null);
    }

    // Método para poblar el ComboBox con las opciones de figuras disponibles
    private void poblarComboBox() {
        // Obtener las figuras disponibles del controlador
        String[] figurasDisponibles = controladoraFiguras.obtenerFigurasDisponibles();

        // Limpiar el ComboBox
        cbxFiguras.removeAllItems();

        // Agregar las figuras disponibles al ComboBox
        for (String figura : figurasDisponibles) {
            cbxFiguras.addItem(figura);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblElegirFigura = new javax.swing.JLabel();
        cbxFiguras = new javax.swing.JComboBox<>();
        btnAceptarFigura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("FIGURAS GEOMETRICAS");

        lblElegirFigura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblElegirFigura.setText("ELEGIR FIGURA A CALCULAR: ");

        cbxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFigurasActionPerformed(evt);
            }
        });

        btnAceptarFigura.setText("ACEPTAR");
        btnAceptarFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarFiguraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblElegirFigura)
                        .addGap(18, 18, 18)
                        .addComponent(cbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnAceptarFigura))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElegirFigura)
                    .addComponent(cbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarFigura)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarFiguraActionPerformed

        try {
            String figuraSeleccionada = (String) cbxFiguras.getSelectedItem();
            
            switch (figuraSeleccionada) {
                case "Cuadrado":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaCuadrado vistaCuadrado = null;
                    vistaCuadrado = new VistaCuadrado();
                    
                    vistaCuadrado.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCuadrado.setVisible(true);
                    
                    ventanaActual = vistaCuadrado;
                    
                    this.setVisible(false);
                    break;
                    
                case "Triangulo":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaTriangulo vistaTriangulo = null;
                    vistaTriangulo = new VistaTriangulo();
                    
                    vistaTriangulo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaTriangulo.setVisible(true);
                    
                    ventanaActual = vistaTriangulo;
                    
                    this.setVisible(false);
                    break;
                case "Circulo":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaCirculo vistaCirculo = null;
                    vistaCirculo = new VistaCirculo();
                    
                    vistaCirculo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCirculo.setVisible(true);
                    
                    ventanaActual = vistaCirculo;
                    
                    this.setVisible(false);
                    break;
                default:
                    // Si no se selecciona una figura válida, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una figura válida.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaFigura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarFiguraActionPerformed

    private void cbxFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFigurasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFigurasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFigura.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

}
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
public void run() {
                try {
                    new VistaFigura().setVisible(true);

} catch (SQLException ex) {
                    Logger.getLogger(VistaFigura.class  

.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarFigura;
    private javax.swing.JComboBox<String> cbxFiguras;
    private javax.swing.JLabel lblElegirFigura;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
