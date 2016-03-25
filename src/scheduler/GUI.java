/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.awt.Color;
import java.awt.Component;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayomitunde
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    static final String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday"};
    static int realYear, realMonth, realDay, currentYear, currentMonth;
    GregorianCalendar calendar;
    static DefaultTableModel CalendarTableModel = new DefaultTableModel(days, 6);
    final int CALENDAR_HEIGHT = 63;
    static HashMap<User, Boolean> userInfo = new HashMap<>();
    User currentUser;
    //File testLog;
    static boolean logged = false;

    public GUI() throws IOException {
        this.calendar = new GregorianCalendar();
        realDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        realMonth = calendar.get(GregorianCalendar.MONTH);
        realYear = calendar.get(GregorianCalendar.YEAR);
        currentMonth = realMonth;
        currentYear = realYear;
        initComponents();
        set();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        cmbYear = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        lblMonth = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPrintCalendar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuMainEdit = new javax.swing.JMenu();
        mnuEdit = new javax.swing.JMenuItem();
        mnuUser = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuEditUser = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuServerLocation = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Event");

        btnLogin.setText("Log Out");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tblCalendar.setModel(CalendarTableModel);
        tblCalendar.setRowHeight(CALENDAR_HEIGHT);
        tblCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCalendarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCalendar);

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        cmbYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbYearMouseClicked(evt);
            }
        });
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        lblMonth.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogin))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPrev)
                        .addGap(366, 366, 366)
                        .addComponent(lblMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(464, 464, 464)
                        .addComponent(btnNext)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(lblMonth))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnPrintCalendar.setText("Print Calendar");
        btnPrintCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrintCalendar)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnPrintCalendar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        mnuMainEdit.setText("Edit");

        mnuEdit.setText("Edit Password");
        mnuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditActionPerformed(evt);
            }
        });
        mnuMainEdit.add(mnuEdit);

        mnuUser.setText("User");
        mnuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUserActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Add User");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuUser.add(jMenuItem5);

        mnuEditUser.setText("List/Edit Users");
        mnuEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditUserActionPerformed(evt);
            }
        });
        mnuUser.add(mnuEditUser);

        jMenuItem6.setText("Remove User");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuUser.add(jMenuItem6);

        mnuMainEdit.add(mnuUser);

        mnuServerLocation.setText("Server Location");
        mnuServerLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuServerLocationActionPerformed(evt);
            }
        });
        mnuMainEdit.add(mnuServerLocation);

        jMenuBar1.add(mnuMainEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Serialize.save(Serialize.fileLocation); // change this to your desktop just for testing
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        AddUsers.run();

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void set() {
        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);
        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        for(int i = realYear - 100; i <= realYear+100; i++){
            cmbYear.addItem(String.valueOf(i));
        }
        refreshCalendar(realMonth, realYear);
        if (logged == true) {
            for (Iterator<User> u = userInfo.keySet().iterator(); u.hasNext();) {
                currentUser = u.next();
                if (currentUser.getLogged()) {
                    if (currentUser.isAdmin() == false) {
                        mnuUser.setVisible(false);
                    }
                }
            }
        }
    }
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        if (logged == false) {
            //Logon.run();
        } else {
            System.exit(0);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RemoveUser.run();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnuEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EditUser.run();
    }//GEN-LAST:event_mnuEditUserActionPerformed

    private void mnuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditActionPerformed
        // TODO add your handling code here:
        // Edit password here
        String newPassword = JOptionPane.showInputDialog("Enter new password here");
        if (logged == true && !"".equals(newPassword)) {
            for (Iterator<User> u = userInfo.keySet().iterator(); u.hasNext();) {
                User user = u.next();
                if (user.equals(currentUser)) {
                    user.setPassword(newPassword);
                    userInfo.put(user, user.isAdmin());
                    break;
                }
            }
            Serialize.save(Serialize.fileLocation);
        }
    }//GEN-LAST:event_mnuEditActionPerformed

    private void mnuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuUserActionPerformed

    private void mnuServerLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuServerLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuServerLocationActionPerformed

    private void btnPrintCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCalendarActionPerformed
        // TODO add your handling code here:
        print();
    }//GEN-LAST:event_btnPrintCalendarActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:
        if(cmbYear.getSelectedItem() != null){
            String cYear = cmbYear.getSelectedItem().toString();
            currentYear = Integer.parseInt(cYear);
            refreshCalendar(currentMonth, currentYear);
        }
        
    }//GEN-LAST:event_cmbYearActionPerformed

    
    public static void refreshCalendar(int month, int year){
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int numDays, startMonth;
        
        btnPrev.setEnabled(true); btnNext.setEnabled(true);
        
        if(month == 11 && year >= realYear+100) btnNext.setEnabled(false);
        if(month == 0 && year <= realYear-100) btnPrev.setEnabled(false);
        lblMonth.setText(months[month]);
        cmbYear.setSelectedItem(String.valueOf(year));
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                CalendarTableModel.setValueAt(null, i, j);
            }
        }
        
        GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
        numDays = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        startMonth = calendar.get(GregorianCalendar.DAY_OF_WEEK);
        
        for(int i = 1; i <= numDays; i++){
            int row = (i+startMonth-2)/7;
            int column = (i+startMonth-2)%7;
            CalendarTableModel.setValueAt(i, row, column);
            
        }
        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }
    
    static class tblCalendarRenderer extends DefaultTableCellRenderer{
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if(column == 0 || column == 6){ // weekend
                setBackground(new Color(255, 220, 220)); 
            }else{
                setBackground(new Color(255,255,255));
            }
            if(value != null){
                if(Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){
                    //current Day
                    setBackground(new Color(220, 220, 255));
                }
            }
            setBorder(null);
            setForeground(Color.black);
            return this;
        }
    }
    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        // TODO add your handling code here:
        if(currentMonth == 0){
            currentMonth = 11;
            currentYear -=1;
        }else{
            currentMonth -=1;
        }
        refreshCalendar(currentMonth, currentYear);
    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        if(currentMonth == 11){
            currentMonth = 0;
            currentYear += 1; // go to next year
        }else{
            currentMonth += 1; // just increment month
        }
        refreshCalendar(currentMonth, currentYear);
    }//GEN-LAST:event_btnNextMouseClicked

    private void cmbYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbYearMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbYearMouseClicked

    private void tblCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCalendarMouseClicked
        int row = tblCalendar.getSelectedRow();
        int col = tblCalendar.getSelectedColumn();
        new DateSelected(tblCalendar, row, col);
    }//GEN-LAST:event_tblCalendarMouseClicked

    private void print(){
        try{
            tblCalendar.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     */
    public static void run() {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GUI().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private static javax.swing.JButton btnNext;
    private static javax.swing.JButton btnPrev;
    private javax.swing.JButton btnPrintCalendar;
    private static javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblMonth;
    private javax.swing.JMenuItem mnuEdit;
    private javax.swing.JMenuItem mnuEditUser;
    private javax.swing.JMenu mnuMainEdit;
    private javax.swing.JMenuItem mnuServerLocation;
    private javax.swing.JMenu mnuUser;
    private static javax.swing.JTable tblCalendar;
    // End of variables declaration//GEN-END:variables
}
