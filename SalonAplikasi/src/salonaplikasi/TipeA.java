
package salonaplikasi;

/**
 *
 * @author USER
 */
public class TipeA extends javax.swing.JFrame {

    /**
     * Creates new form TipeA
     */
    public TipeA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JComboBoxPerawatan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonMember = new javax.swing.JRadioButton();
        jRadioButtonNonMember = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiskon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TotalBayar = new javax.swing.JTextField();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jCheckBoxMessage = new javax.swing.JCheckBox();
        countButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("SALON CWANTIK");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("MENU");

        jLabel3.setText("PERAWATAN");

        JComboBoxPerawatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=PILIHAN=", "GUNTING RAMBUT", "LULURAN" }));
        JComboBoxPerawatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxPerawatanActionPerformed(evt);
            }
        });

        jLabel4.setText("HARGA");

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });

        jLabel5.setText("KEANGGOTAAN");

        jLabel6.setText("KEANGGOTAAN");

        jRadioButtonMember.setText("MEMBER");
        jRadioButtonMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMemberActionPerformed(evt);
            }
        });

        jRadioButtonNonMember.setText("NON MEMBER");
        jRadioButtonNonMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNonMemberActionPerformed(evt);
            }
        });

        jLabel7.setText("DISKON");

        jTextFieldDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiskonActionPerformed(evt);
            }
        });

        jLabel8.setText("TOTAL BAYAR");

        jCheckBoxSpa.setText("SPA");
        jCheckBoxSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSpaActionPerformed(evt);
            }
        });

        jCheckBoxMessage.setText("MESSANGE");
        jCheckBoxMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMessageActionPerformed(evt);
            }
        });

        countButton.setText("HITUNG");
        countButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("BERSIH");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        exitButton.setText("KELUAR");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(countButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jRadioButtonMember)
                    .addComponent(jRadioButtonNonMember))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxSpa)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxMessage))
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JComboBoxPerawatan, 0, 160, Short.MAX_VALUE)
                            .addComponent(Harga))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JComboBoxPerawatan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMember)
                    .addComponent(jCheckBoxSpa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNonMember)
                    .addComponent(jCheckBoxMessage))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(cleanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void JComboBoxPerawatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxPerawatanActionPerformed
        // TODO add your handling code here:
        int index;
        index = JComboBoxPerawatan.getSelectedIndex();
        switch (index) {
            case 0:
                Harga.setText("");
                break;
            case 1:
                Harga.setText("50000");
                break;
            case 2:
                Harga.setText("75000");
                break;
        }
    }//GEN-LAST:event_JComboBoxPerawatanActionPerformed

    private void jRadioButtonMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMemberActionPerformed
        // TODO add your handling code here:
        if (jRadioButtonMember.isSelected()){
            jTextFieldDiskon.setText("10 %");
        }
            jRadioButtonNonMember.setSelected(false);
    }//GEN-LAST:event_jRadioButtonMemberActionPerformed

    private void jTextFieldDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiskonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        // TODO add your handling code here:
        jRadioButtonMember.setSelected(false);
        jRadioButtonNonMember.setSelected(false);
        jCheckBoxMessage.setSelected(false);
        jTextFieldDiskon.setText("");
        TotalBayar.setText("");
        Harga.setText("");
        JComboBoxPerawatan.setSelectedIndex(0);
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void countButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countButtonActionPerformed
        // TODO add your handling code here:
        int subtotal = 0;
        int index = JComboBoxPerawatan.getSelectedIndex();
        switch (index) {
            case 0:
                TotalBayar.setText("");
                break;
            case 1:
                if(jCheckBoxMessage.isSelected()){
                    subtotal = subtotal+10000;
                    if(jRadioButtonMember.isSelected()){
                        subtotal = 50000+(subtotal*10)/100;
                        TotalBayar.setText( Integer.toString(subtotal));
                    }else{
                        subtotal = 50000+subtotal;
                        TotalBayar.setText(Integer.toString(subtotal));
                    }
                    }else if(jCheckBoxSpa.isSelected()){
                        subtotal = subtotal + 200000;
                        if(jRadioButtonMember.isSelected()){
                            subtotal = 50000+subtotal;
                            TotalBayar.setText(Integer.toString(subtotal));
                        }
                    }
                    break;
            case 2:
                if(jCheckBoxMessage.isSelected()){
                    subtotal = subtotal+10000;
                    if(jRadioButtonMember.isSelected()){
                        subtotal = 75000+(subtotal*10)/100;
                        TotalBayar.setText(Integer.toString(subtotal));
                        
                    }
                }else if (jCheckBoxSpa.isSelected()){
                    subtotal = subtotal + 200000;
                    if(jRadioButtonMember.isSelected()){
                        subtotal = 75000+(subtotal*10)/100;
                        TotalBayar.setText(Integer.toString(subtotal));
                    }else{
                        subtotal = 75000+subtotal;
                        TotalBayar.setText(Integer.toString(subtotal));
                    }
                }else{
                    subtotal = subtotal + 75000;
                    TotalBayar.setText(Integer.toString(subtotal));
                }
                break;
        }
    }//GEN-LAST:event_countButtonActionPerformed

    private void jRadioButtonNonMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNonMemberActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonNonMember.isSelected())
            jRadioButtonMember.setSelected(false);
    }//GEN-LAST:event_jRadioButtonNonMemberActionPerformed

    private void jCheckBoxSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSpaActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxSpa.isSelected())
            jCheckBoxMessage.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSpaActionPerformed

    private void jCheckBoxMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMessageActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxMessage.isSelected())
            jCheckBoxSpa.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMessageActionPerformed

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
            java.util.logging.Logger.getLogger(TipeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TipeA().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox<String> JComboBoxPerawatan;
    private javax.swing.JTextField TotalBayar;
    private javax.swing.JButton cleanButton;
    private javax.swing.JButton countButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBox jCheckBoxMessage;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButtonMember;
    private javax.swing.JRadioButton jRadioButtonNonMember;
    private javax.swing.JTextField jTextFieldDiskon;
    // End of variables declaration//GEN-END:variables

    private int jComboPerawatan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}