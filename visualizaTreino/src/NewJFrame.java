
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alois
 */
public class NewJFrame extends javax.swing.JFrame {

    Connection c;
    DefaultTableModel model;

    public NewJFrame() throws SQLException {
        initComponents();
        Mysql mysql = new Mysql();
        c = mysql.conectar("ufnprojetoacad.mysql.dbaas.com.br", "3306", "ufnprojetoacad", "ufnprojetoacad", "Sgutec0sk!");
        model = (DefaultTableModel) jTableSerie.getModel();
        model.setRowCount(0);

        int id = jComboBoxCliente.getSelectedIndex();

        ResultSet rsNome = mysql.consultanome(c);
        if (rsNome != null) {
            try {
                while (rsNome.next()) {
                    String nome = rsNome.getString(WIDTH);
                    jComboBoxCliente.addItem(nome);
                }
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSerie = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFTreino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFObjetivo = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableSerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serie", "Exercicio", "Tempo Total", "Tempo Parcial", "Tempo Medio", "Tempo Minimo", "Qtd Repeticoes", "Codigo Treino"
            }
        ));
        jScrollPane1.setViewportView(jTableSerie);

        jLabel1.setText("Treino de:");

        jTFTreino.setEditable(false);
        jTFTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTreinoActionPerformed(evt);
            }
        });

        jLabel2.setText("Objetivo");

        jTFObjetivo.setEditable(false);

        jButtonAtualizar.setText("Consultar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Visualização de Treinos");

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione cliente" }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonAtualizar)
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTFTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTreinoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        Mysql mysql = new Mysql();
        model.setRowCount(0);
        int id = jComboBoxCliente.getSelectedIndex();
        ResultSet rs = mysql.consultatreino(c, id);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String Serie = rs.getString(2);
                    String Exercicio = rs.getString(3);
                    String Tempo_Total = rs.getString(4);
                    String Tempo_Parcial = rs.getString(5);
                    String Tempo_Medio = rs.getString(6);
                    String Tempo_Minimo = rs.getString(7);
                    String Qtd_Repet = rs.getString(8);
                    String Codigo_Treino = rs.getString(9);
                    model.addRow(new String[]{Serie, Exercicio, Tempo_Total, Tempo_Parcial, Tempo_Medio, Tempo_Minimo, Qtd_Repet, Codigo_Treino});
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed

    }//GEN-LAST:event_jComboBoxClienteActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new NewJFrame().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFObjetivo;
    private javax.swing.JTextField jTFTreino;
    private javax.swing.JTable jTableSerie;
    // End of variables declaration//GEN-END:variables
}
