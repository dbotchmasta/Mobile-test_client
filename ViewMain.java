package client;

import structures.entities.PHClients;
import structures.entities.PHCounts;
import structures.goods.AccountingOfOptions;
import structures.goods.Options;
import structures.goods.KindsOfOptions;
import structures.operations.PHConnection;
import structures.operations.PHCount;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
        initClient();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemGetListOfAllOptions = new javax.swing.JMenuItem();
        jMenuItemGetListOfOptionsByKind = new javax.swing.JMenuItem();
        jMenuItemGetListOfOptionsByCount = new javax.swing.JMenuItem();
        jMenuItemGetListOfGoodsByConsumer = new javax.swing.JMenuItem();
        jMenuItemGetListOfCountsByDate = new javax.swing.JMenuItem();
        jMenuItemGetListOfConnectionsByDate = new javax.swing.JMenuItem();
        jMenuItemGetListOfAllCounts = new javax.swing.JMenuItem();
        jMenuItemGetListOfAllClients = new javax.swing.JMenuItem();
        jMenuItemGetListOfCountsByGoods = new javax.swing.JMenuItem();
        jMenuItemGetListOfClientsByOptions = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAddOptions = new javax.swing.JMenuItem();
        jMenuItemCompleteConnection = new javax.swing.JMenuItem();
        jMenuItemAddCounts = new javax.swing.JMenuItem();
        jMenuItemAddClient = new javax.swing.JMenuItem();
        jMenuItemAddCountForGoods = new javax.swing.JMenuItem();
        jMenuItemAddClientForGoods = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Запросы к таблице");

        jMenuItemGetListOfAllOptions.setText("Список всех тарифов");
        jMenuItemGetListOfAllOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfAllOptionsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfAllOptions);

        jMenuItemGetListOfOptionsByKind.setText("Список тарифов по виду");
        jMenuItemGetListOfOptionsByKind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfOptionsByKindActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfOptionsByKind);

        jMenuItemGetListOfOptionsByCount.setText("Список тарифов по счетам");
        jMenuItemGetListOfOptionsByCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfOptionsByCountActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfOptionsByCount);

        jMenuItemGetListOfGoodsByConsumer.setText("Список тарифов по клиентам");
        jMenuItemGetListOfGoodsByConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfGoodsByConsumerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfGoodsByConsumer);

        jMenuItemGetListOfCountsByDate.setText("Список счетов");
        jMenuItemGetListOfCountsByDate.setToolTipText("");
        jMenuItemGetListOfCountsByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfCountsByDateActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfCountsByDate);

        jMenuItemGetListOfConnectionsByDate.setText("Список операций");
        jMenuItemGetListOfConnectionsByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfConnectionsByDateActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfConnectionsByDate);

        jMenuItemGetListOfAllCounts.setText("Список всех счетов");
        jMenuItemGetListOfAllCounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfAllCountsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfAllCounts);

        jMenuItemGetListOfAllClients.setText("Список всех клиентов");
        jMenuItemGetListOfAllClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfAllClientsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfAllClients);

        jMenuItemGetListOfCountsByGoods.setText("Список счетов тарифа");
        jMenuItemGetListOfCountsByGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfCountsByGoodsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfCountsByGoods);

        jMenuItemGetListOfClientsByOptions.setText("Список клиентов тарифа");
        jMenuItemGetListOfClientsByOptions.setToolTipText("");
        jMenuItemGetListOfClientsByOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGetListOfClientsByOptionsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGetListOfClientsByOptions);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Добавление/оформление");

        jMenuItemAddOptions.setText("Добавить тариф");
        jMenuItemAddOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddOptionsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddOptions);

        jMenuItemCompleteConnection.setText("Оформить подключение");
        jMenuItemCompleteConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCompleteConnectionActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCompleteConnection);

        jMenuItemAddCounts.setText("Добавить счет");
        jMenuItemAddCounts.setToolTipText("");
        jMenuItemAddCounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCountsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddCounts);

        jMenuItemAddClient.setText("Добавить клиента");
        jMenuItemAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddClientActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddClient);

        jMenuItemAddCountForGoods.setText("Добавить счет для тарифа");
        jMenuItemAddCountForGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddCountForGoodsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddCountForGoods);

        jMenuItemAddClientForGoods.setText("Добавить клиента для тарифа");
        jMenuItemAddClientForGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddClientForGoodsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddClientForGoods);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGetListOfAllOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfAllOptionsActionPerformed
        List<AccountingOfOptions> listOfAccountingOfOptions = controller.getListOfAllOptions();
        if (listOfAccountingOfOptions != null) {
            tableContains = TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS;
            fillTableOfOptions(listOfAccountingOfOptions);
        }
    }//GEN-LAST:event_jMenuItemGetListOfAllOptionsActionPerformed

    private void jMenuItemAddOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddOptionsActionPerformed
        new DialAddAccountingOfOptions(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItemAddOptionsActionPerformed

    private void jMenuItemGetListOfCountsByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfCountsByDateActionPerformed
        try {
            String result = JOptionPane.showInputDialog("Введите период времени в формате \"dd.MM.yyyy-dd.MM.yyyy\"");
            if (result != null) {
                String[] parsedResult = result.split("-");
                Date date1 = DATE_FORMAT.parse(parsedResult[0]);
                Date date2 = DATE_FORMAT.parse(parsedResult[1]);
                List<PHCount> listOfCount = controller.getListOfCountsByDate(date1, date2);
                    if (listOfCount != null) {
                    tableContains = TableContainer.LIST_OF_COUNTS;
                    fillTableOfCount(listOfCount);
                }
            }
        } catch (ParseException ex) {
            System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
        }
    }//GEN-LAST:event_jMenuItemGetListOfCountsByDateActionPerformed

    private void jMenuItemGetListOfAllCountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfAllCountsActionPerformed
        List<PHCounts> listOfCounts = controller.getListOfAllCounts();
        if (listOfCounts != null) {
            tableContains = TableContainer.LIST_OF_COUNTS;
            fillTableOfCounts(listOfCounts);
        }
    }//GEN-LAST:event_jMenuItemGetListOfAllCountsActionPerformed

    private void jMenuItemAddCountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCountsActionPerformed
        new DialAddEntity(this, rootPaneCheckingEnabled, Entities.COUNTS).setVisible(true);
    }//GEN-LAST:event_jMenuItemAddCountsActionPerformed

    private void jMenuItemAddCountForGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddCountForGoodsActionPerformed
        int selRow = jTable1.getSelectedRow();
        if ((tableContains == TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS) && (selRow != -1)) {
            try {
                String result = JOptionPane.showInputDialog("Введите id счета");
                if (result != null) {
                    controller.addCountForOptions(Integer.parseInt(result), Integer.parseInt(String.valueOf(jTable1.getValueAt(selRow, 0))));
                }
            } catch (NumberFormatException ex) {
                System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Сначала выберите тариф");
        }
    }//GEN-LAST:event_jMenuItemAddCountForGoodsActionPerformed

    private void jMenuItemGetListOfCountsByGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfCountsByGoodsActionPerformed
        int selRow = jTable1.getSelectedRow();
        if ((tableContains == TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS) && (selRow != -1)) {
            selectedOptionsIdForListOfEntities = Integer.parseInt(String.valueOf(jTable1.getValueAt(selRow, 0)));
            List<PHCounts> listOfCounts = controller.getListOfCountsByOptions(selectedOptionsIdForListOfEntities);
            if (listOfCounts != null) {
                tableContains = TableContainer.LIST_OF_COUNTS_OF_OPTIONS;
                fillTableOfCounts(listOfCounts);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Сначала выберите тариф");
        }
    }//GEN-LAST:event_jMenuItemGetListOfCountsByGoodsActionPerformed

    private void jMenuItemAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddClientActionPerformed
        new DialAddEntity(this, rootPaneCheckingEnabled, Entities.CLIENTS).setVisible(true);
    }//GEN-LAST:event_jMenuItemAddClientActionPerformed

    private void jMenuItemCompleteConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCompleteConnectionActionPerformed
        new DialCompleteOperation(this, rootPaneCheckingEnabled, Operations.CONNECTION).setVisible(true);
    }//GEN-LAST:event_jMenuItemCompleteConnectionActionPerformed

    private void jMenuItemAddClientForGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddClientForGoodsActionPerformed
        int selRow = jTable1.getSelectedRow();
        if ((tableContains == TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS) && (selRow != -1)) {
            try {
                String result = JOptionPane.showInputDialog("Введите id клиента");
                if (result != null) {
                    controller.addClientForOptions(Integer.parseInt(result), Integer.parseInt(String.valueOf(jTable1.getValueAt(selRow, 0))));
                }
            } catch (NumberFormatException ex) {
                System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Сначала выберите тариф");
        }
    }//GEN-LAST:event_jMenuItemAddClientForGoodsActionPerformed

    private void jMenuItemGetListOfAllClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfAllClientsActionPerformed
        List<PHClients> listOfConsumers = controller.getListOfAllClients();
        if (listOfConsumers != null) {
            tableContains = TableContainer.LIST_OF_CLIENTS;
            fillTableOfClients(listOfConsumers);
        }
    }//GEN-LAST:event_jMenuItemGetListOfAllClientsActionPerformed

    private void jMenuItemGetListOfConnectionsByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfConnectionsByDateActionPerformed
        try {
            String result = JOptionPane.showInputDialog("Введите период времени в формате \"dd.MM.yyyy-dd.MM.yyyy\"");
            if (result != null) {
                String[] parsedResult = result.split("-");
                Date date1 = DATE_FORMAT.parse(parsedResult[0]);
                Date date2 = DATE_FORMAT.parse(parsedResult[1]);
                List<PHConnection> listOfConnection = controller.getListOfConnectionsByDate(date1, date2);
                if (listOfConnection != null) {
                    tableContains = TableContainer.LIST_OF_CONNECTIONS;
                    fillTableOfConnections(listOfConnection);
                }
            }
        } catch (ParseException ex) {
            System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
        }
    }//GEN-LAST:event_jMenuItemGetListOfConnectionsByDateActionPerformed

    private void jMenuItemGetListOfClientsByOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfClientsByOptionsActionPerformed
        int selRow = jTable1.getSelectedRow();
        if ((tableContains == TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS) && (selRow != -1)) {
            selectedOptionsIdForListOfEntities = Integer.parseInt(String.valueOf(jTable1.getValueAt(selRow, 0)));
            List<PHClients> listOfConsumers = controller.getListOfClientsByOptions(selectedOptionsIdForListOfEntities);
            if (listOfConsumers != null) {
                tableContains = TableContainer.LIST_OF_CLIENTS_OF_OPTIONS;
                fillTableOfClients(listOfConsumers);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Сначала выберите тариф");
        }
    }//GEN-LAST:event_jMenuItemGetListOfClientsByOptionsActionPerformed

    private void jMenuItemGetListOfOptionsByKindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfOptionsByKindActionPerformed
        String result = JOptionPane.showInputDialog("Введите вид тарифа");
        if (result != null && !result.equals("")) {
            List<AccountingOfOptions> listOfAccountingOfGoods = controller.getListOfOptionsByKind(result);
            if (listOfAccountingOfGoods != null) {
                tableContains = TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS;
                fillTableOfOptions(listOfAccountingOfGoods);
            }
        }
    }//GEN-LAST:event_jMenuItemGetListOfOptionsByKindActionPerformed

    private void jMenuItemGetListOfOptionsByCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfOptionsByCountActionPerformed
        try {
            String result = JOptionPane.showInputDialog("Введите id счета");
            if (result != null) {
                List<AccountingOfOptions> listOfAccountingOfGoods = controller.getListOfOptionsByCount(Integer.parseInt(result));
                if (listOfAccountingOfGoods != null) {
                    tableContains = TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS;
                    fillTableOfOptions(listOfAccountingOfGoods);
                }
            }
        } catch (NumberFormatException ex) {
            System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
        }
    }//GEN-LAST:event_jMenuItemGetListOfOptionsByCountActionPerformed

    private void jMenuItemGetListOfGoodsByConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGetListOfGoodsByConsumerActionPerformed
        try {
            String result = JOptionPane.showInputDialog("Введите id клиента");
            if (result != null) {
                List<AccountingOfOptions> listOfAccountingOfGoods = controller.getListOfOptionsByClient(Integer.parseInt(result));
                if (listOfAccountingOfGoods != null) {
                    tableContains = TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS;
                    fillTableOfOptions(listOfAccountingOfGoods);
                }
            }
        } catch (NumberFormatException ex) {
            System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
            JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
        }
    }//GEN-LAST:event_jMenuItemGetListOfGoodsByConsumerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.disconnect();
    }//GEN-LAST:event_formWindowClosing

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DELETE:
                if (tableContains == TableContainer.LIST_OF_ACCOUNTING_OF_OPTIONS
                        || tableContains == TableContainer.LIST_OF_COUNTS
                        || tableContains == TableContainer.LIST_OF_CLIENTS
                        || tableContains == TableContainer.LIST_OF_COUNTS_OF_OPTIONS
                        || tableContains == TableContainer.LIST_OF_CLIENTS_OF_OPTIONS) {
                    delSelected();
                }
                break;

            case KeyEvent.VK_INSERT:
                if (null != tableContains) {
                    switch (tableContains) {
                        case LIST_OF_ACCOUNTING_OF_OPTIONS:
                            updSelectedOptions();
                            break;
                        case LIST_OF_COUNTS:
                            updSelectedCounts();
                            break;
                        case LIST_OF_CLIENTS:
                            updSelectedClients();
                            break;
                        default:
                            break;
                    }
                }
                break;
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void fillTableOfOptions(List<AccountingOfOptions> listOfAccountingOfOptions) {
        DefaultTableModel tableModel = prepareTableModel();
        for (int i = 0; i < listOfAccountingOfOptions.size(); i++) {
            AccountingOfOptions accOfOptions = listOfAccountingOfOptions.get(i);
            tableModel.addRow(new Object[]{
                accOfOptions.getOptions().getId(),
                accOfOptions.getOptions().getTitle(),
                accOfOptions.getOptions().getKind(),
                accOfOptions.getOptions().getInternet(),
                accOfOptions.getOptions().getSMS(),
                accOfOptions.getOptions().getMinutes()
            });
        }
    }

    private void fillTableOfCounts(List<PHCounts> listOfCounts) {
        DefaultTableModel tableModel = prepareTableModel();
        for (int i = 0; i < listOfCounts.size(); i++) {
            PHCounts phcounts = listOfCounts.get(i);
            tableModel.addRow(new Object[]{
                phcounts.getId(),
                phcounts.getDateOpen(),
                phcounts.getDateClose(),
                phcounts.getName(),
                phcounts.getAddress(),
                phcounts.getPhone(),
                phcounts.getEmail()
            });
        }
    }

    private void fillTableOfClients(List<PHClients> listOfClients) {
        DefaultTableModel tableModel = prepareTableModel();
        for (int i = 0; i < listOfClients.size(); i++) {
            PHClients phclients = listOfClients.get(i);
            tableModel.addRow(new Object[]{
                phclients.getId(),
                phclients.getDateOpen(),
                phclients.getDateClose(),
                phclients.getName(),
                phclients.getAddress(),
                phclients.getPhone(),
                phclients.getEmail()
            });
        }
    }

    private void fillTableOfCount(List<PHCount> currentListOfCounts) {
        DefaultTableModel tableModel = prepareTableModel();
        for (int i = 0; i < currentListOfCounts.size(); i++) {
            PHCount phcount = currentListOfCounts.get(i);
            tableModel.addRow(new Object[]{
                DATE_FORMAT.format(phcount.getDateOpen()),
                DATE_FORMAT.format(phcount.getDateClose()),
                phcount.getEntityId(),
                phcount.getOptionsId()
            });
        }
    }

    private void fillTableOfConnections(List<PHConnection> listOfConnection) {
        DefaultTableModel tableModel = prepareTableModel();
        for (int i = 0; i < listOfConnection.size(); i++) {
            PHConnection phcon = listOfConnection.get(i);
            tableModel.addRow(new Object[]{
                DATE_FORMAT.format(phcon.getDateOpen()),
                DATE_FORMAT.format(phcon.getDateClose()),
                phcon.getEntityId(),
                phcon.getOptionsId()
            });
        }
    }

    private void updSelectedOptions() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int[] selRows = jTable1.getSelectedRows();
        if (selRows.length > 0) {
            for (int i = selRows.length - 1; i >= 0; i--) {
                int row = selRows[i];
                    controller.updAccountigOfOptions(new AccountingOfOptions(
                            new Options(
                                    Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0))),
                                    String.valueOf(tableModel.getValueAt(row, 1)),
                                    KindsOfOptions.getValueOf(tableModel.getValueAt(row, 2).toString()),
                                    String.valueOf(tableModel.getValueAt(row, 3)),
                                    String.valueOf(tableModel.getValueAt(row, 4)),
                            String.valueOf(tableModel.getValueAt(row, 5)))));                            
            }
        }
        removeCellSelection();
    }

    private void updSelectedCounts() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int[] selRows = jTable1.getSelectedRows();
        if (selRows.length > 0) {
            for (int i = selRows.length - 1; i >= 0; i--) {
                int row = selRows[i];
                try {
                    controller.updCount(new PHCounts(
                            Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0))),
                            DATE_FORMAT.parse(String.valueOf(tableModel.getValueAt(row, 2))),
                            DATE_FORMAT.parse(String.valueOf(tableModel.getValueAt(row, 3))), 
                            String.valueOf(tableModel.getValueAt(row, 4)),
                            String.valueOf(tableModel.getValueAt(row, 5)),
                            String.valueOf(tableModel.getValueAt(row, 6)),
                            String.valueOf(tableModel.getValueAt(row, 7))));
                } catch (NumberFormatException ex) {
                    System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                    JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                } catch (ParseException ex) {
                    System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
                    JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
                }
            }
        }
        removeCellSelection();
    }

    private void updSelectedClients() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int[] selRows = jTable1.getSelectedRows();
        if (selRows.length > 0) {
            for (int i = selRows.length - 1; i >= 0; i--) {
                int row = selRows[i];
                try {
                    controller.updClient(new PHClients(
                        Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0))),
                        DATE_FORMAT.parse(String.valueOf(tableModel.getValueAt(row, 2))),
                        DATE_FORMAT.parse(String.valueOf(tableModel.getValueAt(row, 3))), 
                        String.valueOf(tableModel.getValueAt(row, 4)),
                        String.valueOf(tableModel.getValueAt(row, 5)),
                        String.valueOf(tableModel.getValueAt(row, 6)),
                        String.valueOf(tableModel.getValueAt(row, 7))));
                } catch (NumberFormatException ex) {
                    System.err.println(ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                    JOptionPane.showMessageDialog(this, ClientMessages.NUMBER_FORMAT_EXCEPTION_DESCRIPTION);
                } catch (ParseException ex) {
                    System.err.println(ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
                    JOptionPane.showMessageDialog(this, ClientMessages.DATE_PARSE_EXCEPTION_DESCRIPTION);
                }
            }
        }
        removeCellSelection();
    }

    private DefaultTableModel prepareTableModel() {
        String[] fields;
        boolean[] fieldsCanEdit;
        switch (tableContains) {
            case LIST_OF_ACCOUNTING_OF_OPTIONS:
                fields = new String[]{
                    "Id", "Наименование", "Вид", "Количество GB", "Количество SMS", 
                    "Количество минут" 
                };
                fieldsCanEdit = new boolean[]{
                    false, true, false, true, true, true
                };
                break;
            case LIST_OF_COUNTS:
            case LIST_OF_CLIENTS:    
            case LIST_OF_COUNTS_OF_OPTIONS:
            case LIST_OF_CLIENTS_OF_OPTIONS:
                fields = new String[]{
                    "Id", "Баланс", "Дата открытия", "ФИО", "Адрес", "Телефон", "E-mail"
                };
                fieldsCanEdit = new boolean[]{
                    false, true, true, true, true, true, true
                };
                break;
            case LIST_OF_COUNT:
                fields = new String[]{
                    "Дата начала обслуживания", "Дата оконачания обслуживания", "Id счета", "Id тарифа", "Баланс"
                };
                fieldsCanEdit = new boolean[]{
                    false, false, false, false, false
                };
                break;
            case LIST_OF_CONNECTIONS:
                fields = new String[]{
                    "Дата", "Id клиента", "Id тарифа", "Баланс"
                };
                fieldsCanEdit = new boolean[]{
                    false, false, false, false
                };
                break;
            default:
                fields = new String[]{};
                fieldsCanEdit = new boolean[]{};
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, fields) {
            boolean[] canEdit = fieldsCanEdit;

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        return tableModel;
    }

    private void delSelected() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int[] selRows = jTable1.getSelectedRows();
        if (selRows.length > 0) {
            for (int i = selRows.length - 1; i >= 0; i--) {
                int row = selRows[i];
                int id = Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0)));
                performDeletion(id);
                int modelRow = jTable1.convertRowIndexToModel(row);
                tableModel.removeRow(modelRow);
            }
        }
        removeCellSelection();
    }

    private void performDeletion(int id) {
        switch (tableContains) {
            case LIST_OF_ACCOUNTING_OF_OPTIONS:
                controller.delAccountigOfOptions(id);
                break;
            case LIST_OF_COUNTS:
                controller.delCount(id);
                break;
            case LIST_OF_CLIENTS:
                controller.delClient(id);
                break;
            case LIST_OF_COUNTS_OF_OPTIONS:
                controller.delCountForOptions(id, selectedOptionsIdForListOfEntities);
                break;
            case LIST_OF_CLIENTS_OF_OPTIONS:
                controller.delClientForOptions(id, selectedOptionsIdForListOfEntities);
                break;
        }
    }

    private void removeCellSelection() {
        DefaultCellEditor dce = (DefaultCellEditor) jTable1.getCellEditor();
        if (dce != null) {
            dce.stopCellEditing();
        }
        jTable1.clearSelection();
    }

    public ClientController getClient() {
        return controller;
    }

    private void initClient() {
        controller = new ClientController();
        controller.connect();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ViewMain().setVisible(true);
        });
    }

    private ClientController controller;
    private JFrame messageConsoleFrame;

    private enum TableContainer {
        LIST_OF_ACCOUNTING_OF_OPTIONS,
        LIST_OF_COUNTS,
        LIST_OF_CLIENTS,
        LIST_OF_COUNTS_OF_OPTIONS,
        LIST_OF_CLIENTS_OF_OPTIONS,
        LIST_OF_COUNT,
        LIST_OF_CONNECTIONS;
    }
    private TableContainer tableContains;
    private int selectedOptionsIdForListOfEntities;

    private final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    
    public static enum Entities {
        COUNTS,
        CLIENTS
    }
    
    public static enum Operations {
        CONNECTION,
        COUNT
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddClient;
    private javax.swing.JMenuItem jMenuItemAddClientForGoods;
    private javax.swing.JMenuItem jMenuItemAddCountForGoods;
    private javax.swing.JMenuItem jMenuItemAddCounts;
    private javax.swing.JMenuItem jMenuItemAddOptions;
    private javax.swing.JMenuItem jMenuItemCompleteConnection;
    private javax.swing.JMenuItem jMenuItemGetListOfAllClients;
    private javax.swing.JMenuItem jMenuItemGetListOfAllCounts;
    private javax.swing.JMenuItem jMenuItemGetListOfAllOptions;
    private javax.swing.JMenuItem jMenuItemGetListOfClientsByOptions;
    private javax.swing.JMenuItem jMenuItemGetListOfConnectionsByDate;
    private javax.swing.JMenuItem jMenuItemGetListOfCountsByDate;
    private javax.swing.JMenuItem jMenuItemGetListOfCountsByGoods;
    private javax.swing.JMenuItem jMenuItemGetListOfGoodsByConsumer;
    private javax.swing.JMenuItem jMenuItemGetListOfOptionsByCount;
    private javax.swing.JMenuItem jMenuItemGetListOfOptionsByKind;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
