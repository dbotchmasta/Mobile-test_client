package client;

import structures.operations.PHCount;
import structures.operations.PHConnection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class DialCompleteOperation extends javax.swing.JDialog {

    public DialCompleteOperation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = (ViewMain)parent;
    }
    
    public DialCompleteOperation(java.awt.Frame parent, boolean modal, ViewMain.Operations operation) {
        this(parent, modal);
        this.operation = operation;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEntityId = new javax.swing.JTextField();
        jTextFieldGoodsId = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jFormattedTextFieldDateOpen = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldDateClose = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jFormattedTextFieldDateOpen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel1.setText("Дата подключения");

        jLabel2.setText("Id клиента/счета");

        jLabel3.setText("Id тарифа");

        jLabel4.setText("Баланс");

        jButton1.setText("Оформить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldDateClose.setToolTipText("");

        jLabel5.setText("Дата окончания услуги");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldGoodsId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFormattedTextFieldDateOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntityId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDateClose))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDateOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDateClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEntityId)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGoodsId)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTextFieldEntityId.getAccessibleContext().setAccessibleDescription("");
        jTextFieldGoodsId.getAccessibleContext().setAccessibleDescription("");
        jTextFieldQuantity.getAccessibleContext().setAccessibleDescription("");
        jFormattedTextFieldDateOpen.getAccessibleContext().setAccessibleDescription("");
        jButton1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean successfully = false;
        if (operation == ViewMain.Operations.COUNT){
            successfully = completeCount();
        } else if (operation == ViewMain.Operations.CONNECTION){
            successfully = completeConnection();
        }
        
        if (successfully) {
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean completeCount() {
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(jFormattedTextFieldDateOpen.getText());
            parent.getClient().completeCount(new PHCount(
                date,
                date,
                Integer.parseInt(jTextFieldEntityId.getText()),
                Integer.parseInt(jTextFieldGoodsId.getText())));
        } catch (ParseException ex) {
            System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            return false;
        } catch (NumberFormatException ex) {
            System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            return false;
        }
        return true;
    }
    
    private boolean completeConnection() {
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(jFormattedTextFieldDateOpen.getText());
            parent.getClient().completeConnection(new PHConnection(
                date,
                date,
                Integer.parseInt(jTextFieldEntityId.getText()),
                Integer.parseInt(jTextFieldGoodsId.getText())));
        } catch (ParseException ex) {
            System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            return false;
        } catch (NumberFormatException ex) {
            System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            return false;
        }
        return true;
    }

    private ViewMain parent;
    private ViewMain.Operations operation;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextFieldDateOpen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDateClose;
    private javax.swing.JTextField jTextFieldEntityId;
    private javax.swing.JTextField jTextFieldGoodsId;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
