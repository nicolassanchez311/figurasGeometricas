package Vista;

import Controlador.ControladorFiguras;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaCuadrado extends javax.swing.JFrame {

    ControladorFiguras controladoraFiguras;

    public VistaCuadrado() throws SQLException {

        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCuadrado = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblTextoMedidaCuadrado = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnCalcularMedidas = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCuadrado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloCuadrado.setText("CUADRADO");

        lblLado1.setText("LADO :");

        lblTextoMedidaCuadrado.setText("MEDIDA DE UN LADO DEL CUADRADO :");

        txtLadoCuadrado.setText("0.0");
        txtLadoCuadrado.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        txtLadoCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoCuadradoActionPerformed(evt);
            }
        });

        lblPerimetro.setText("PERIMETRO :");

        lblArea.setText("AREA :");

        lblMedidaPerimetro.setText("--");

        lblMedidaArea.setText("--");

        btnVolver.setText("MENU");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnCalcularMedidas.setText("CALCULAR");
        btnCalcularMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedidasActionPerformed(evt);
            }
        });

        btnLimpiar.setText("BORRAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTituloCuadrado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVolver)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPerimetro)
                                        .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnLimpiar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMedidaPerimetro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMedidaArea))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTextoMedidaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblLado1)))
                        .addGap(18, 18, 18)
                        .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCalcularMedidas)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTituloCuadrado)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoMedidaCuadrado)
                    .addComponent(lblLado1)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularMedidas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(lblMedidaArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoCuadradoActionPerformed

    private void btnCalcularMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedidasActionPerformed
        try {
            float medidaLado = Float.parseFloat(txtLadoCuadrado.getText());

            float perimetroResultado = controladoraFiguras.calcularPerimetroCuadrado(medidaLado);
            lblMedidaPerimetro.setText(String.valueOf(perimetroResultado));
            float areaResultado = controladoraFiguras.calcularSuperficieCuadrado(medidaLado);
            lblMedidaArea.setText(String.valueOf(areaResultado));

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un numero valido para la medida del lado del cuadrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCalcularMedidasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        VistaFigura vistaFigura = null;
        try {
            vistaFigura = new VistaFigura();
        } catch (SQLException ex) {
            Logger.getLogger(VistaCuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaFigura.setVisible(true);
     }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpiando campos de texto de entrada
        txtLadoCuadrado.setText("0");
        
        //Limpiando campos de texto de resultado
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaCuadrado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaCuadrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedidas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTextoMedidaCuadrado;
    private javax.swing.JLabel lblTituloCuadrado;
    private javax.swing.JTextField txtLadoCuadrado;
    // End of variables declaration//GEN-END:variables
}
