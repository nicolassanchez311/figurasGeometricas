package Vista;

import Controlador.ControladorFiguras;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaTriangulo extends javax.swing.JFrame {
    
    ControladorFiguras controladoraFiguras;

    
    public VistaTriangulo() throws SQLException {
        controladoraFiguras = ControladorFiguras.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloTriangulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblTextoMedidasTriangulo = new javax.swing.JLabel();
        lblLado1Triangulo = new javax.swing.JLabel();
        lblLado2Triangulo = new javax.swing.JLabel();
        lblBaseTriangulo = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        txtLado1Triangulo = new javax.swing.JTextField();
        txtLado2Triangulo = new javax.swing.JTextField();
        btnCalcularMedidas = new javax.swing.JButton();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblMedidaAltura = new javax.swing.JLabel();
        bntLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTriangulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTituloTriangulo.setText("TRIANGULO");

        btnVolver.setText("MENU");
        btnVolver.setToolTipText("");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTextoMedidasTriangulo.setText("MEDIDAS DEL TRIANGULO");

        lblLado1Triangulo.setText("LADO 1 :");

        lblLado2Triangulo.setText("LADO 2:");

        lblBaseTriangulo.setText("BASE : ");

        txtBaseTriangulo.setText("00.00");
        txtBaseTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseTrianguloActionPerformed(evt);
            }
        });

        txtLado1Triangulo.setText("00.00");

        txtLado2Triangulo.setText("00.00");

        btnCalcularMedidas.setText("CALCULAR");
        btnCalcularMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMedidasActionPerformed(evt);
            }
        });

        lblPerimetro.setText("PERIMETRO :");

        lblArea.setText("AREA :");

        lblMedidaPerimetro.setText("--");

        lblMedidaArea.setText("--");

        lblAltura.setText("ALTURA :");

        lblMedidaAltura.setText("--");

        bntLimpiar.setText("BORRAR");
        bntLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoMedidasTriangulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPerimetro)
                            .addComponent(lblArea)
                            .addComponent(lblAltura))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedidaPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcularMedidas)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedidaAltura)
                                    .addComponent(lblMedidaArea))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(bntLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnVolver))
                            .addComponent(lblTituloTriangulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBaseTriangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lblLado1Triangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblLado2Triangulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTituloTriangulo)
                .addGap(18, 18, 18)
                .addComponent(lblTextoMedidasTriangulo)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseTriangulo)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado1Triangulo)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado2Triangulo)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro)
                    .addComponent(btnCalcularMedidas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(lblMedidaArea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(lblMedidaAltura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntLimpiar)
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBaseTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseTrianguloActionPerformed

    private void btnCalcularMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMedidasActionPerformed
        try{
            float medidaBase = Float.parseFloat(txtBaseTriangulo.getText());
            float medidaLado1 = Float.parseFloat(txtLado1Triangulo.getText());
            float medidaLado2 = Float.parseFloat(txtLado2Triangulo.getText());
            
            float resultadoPerimetro = controladoraFiguras.calcularPerimetroTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoArea = controladoraFiguras.calcularSuperficieTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoAltura = controladoraFiguras.calcularAlturaTriangulo(medidaLado1, medidaLado2, medidaBase);
            
            lblMedidaPerimetro.setText(String.valueOf(resultadoPerimetro));
            lblMedidaArea.setText(String.valueOf(resultadoArea));
            lblMedidaAltura.setText(String.valueOf(resultadoAltura));
            
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un numero valido para las medidas del triangulo.", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        //Limpiando campos de texto de entrada
        txtBaseTriangulo.setText("0");
        txtLado1Triangulo.setText("0");
        txtLado2Triangulo.setText("0");
        
        //Limpiando campos de texto de resultado
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
        lblMedidaAltura.setText("");
    }//GEN-LAST:event_bntLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaTriangulo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VistaTriangulo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLimpiar;
    private javax.swing.JButton btnCalcularMedidas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBaseTriangulo;
    private javax.swing.JLabel lblLado1Triangulo;
    private javax.swing.JLabel lblLado2Triangulo;
    private javax.swing.JLabel lblMedidaAltura;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTextoMedidasTriangulo;
    private javax.swing.JLabel lblTituloTriangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1Triangulo;
    private javax.swing.JTextField txtLado2Triangulo;
    // End of variables declaration//GEN-END:variables
}
