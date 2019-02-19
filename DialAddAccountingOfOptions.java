package client;

import structures.goods.AccountingOfOptions;
import structures.goods.Options;
import structures.goods.KindsOfOptions;

import javax.swing.JOptionPane;

public class DialAddAccountingOfOptions extends javax.swing.JDialog {

    public DialAddAccountingOfOptions(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = (ViewMain)parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldId = new javax.swing.JTextField();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldInternet = new javax.swing.JTextField();
        jTextFieldMinutes = new javax.swing.JTextField();
        jComboBoxKind = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldSMS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextFieldInternet.setEnabled(false);
        jTextFieldInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInternetActionPerformed(evt);
            }
        });

        jTextFieldMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinutesActionPerformed(evt);
            }
        });

        jComboBoxKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Корпоративный", "Только звонки", "Со всеми функциями" }));
        jComboBoxKind.setToolTipText("");
        jComboBoxKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKindActionPerformed(evt);
            }
        });

        jLabel1.setText("Id тарифа");

        jLabel2.setText("Наименование");

        jLabel3.setText("Вид");

        jLabel4.setText("Количество GB интернета");

        jLabel5.setText("Количество SMS");

        jLabel6.setText("Количество минут");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSMS)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldInternet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTitle)
                                    .addComponent(jTextFieldId)
                                    .addComponent(jComboBoxKind, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMinutes))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxKind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInternet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean successfully = addAccountingOfOptions();
        if (successfully) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKindActionPerformed
        if (jComboBoxKind.getSelectedIndex() == 0 || jComboBoxKind.getSelectedIndex() == 1) {
            jTextFieldInternet.setText(null);
            jTextFieldInternet.setEnabled(false);
            jTextFieldSMS.setText(null);
            jTextFieldSMS.setEnabled(false);
        } else {
            jTextFieldInternet.setEnabled(true);
            jTextFieldSMS.setEnabled(true);
            jTextFieldMinutes.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxKindActionPerformed

    private void jTextFieldInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInternetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInternetActionPerformed

    private void jTextFieldSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSMSActionPerformed

    private void jTextFieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutesActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    public boolean addAccountingOfOptions() {
        try{    
        parent.getClient().addAccountigOfOptions(new AccountingOfOptions(
                    new Options(
                            Integer.parseInt(jTextFieldId.getText()),    
                            jTextFieldTitle.getText(),
                            KindsOfOptions.getValueOf((String)jComboBoxKind.getSelectedItem()),
                            jTextFieldInternet.getText(),
                            jTextFieldSMS.getText(),
                            jTextFieldMinutes.getText())));   
                    } catch (NumberFormatException ex){
                        System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                        JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                    }        
        return true;
    }

    private ViewMain parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxKind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldInternet;
    private javax.swing.JTextField jTextFieldMinutes;
    private javax.swing.JTextField jTextFieldSMS;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
