/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import javax.security.auth.Subject;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Open extends javax.swing.JFrame {

    public Open() {
        initComponents();
        setSize(900, 600);
        setLocation(500, 250);
        setResizable(false);
        setTitle("Book Store");
        show_user();
    }

    public ArrayList<User> userList() throws Exception {
        ArrayList<User> userList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=library", "shreen", "123");
            String query1 = "SELECT * FROM book";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while (rs.next()) {
                user = new User(rs.getString("title"), rs.getInt("ISBN"), rs.getString("Type"), rs.getInt("Price"), rs.getInt("page_Count"));
                userList.add(user);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return userList;
    }

    public void show_user() {
        try {
            ArrayList<User> list = userList();
            DefaultTableModel model = (DefaultTableModel) jTable1_Display_Books.getModel();
            Object[] row = new Object[5];
            for (int i = 0; i < list.size(); ++i) {
                row[0] = list.get(i).getTitle();
                row[1] = list.get(i).getISBN();
                row[2] = list.get(i).getPrice();
                row[3] = list.get(i).getType();
                row[4] = list.get(i).getPage_Count();
                model.addRow(row);
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Display_Books = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(184, 184, 184));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/DO.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 90, 100, 100);

        jTable1_Display_Books.setBackground(new java.awt.Color(184, 184, 184));
        jTable1_Display_Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "ISBN", "Price", "Type", "page"
            }
        ));
        jTable1_Display_Books.setFillsViewportHeight(true);
        jTable1_Display_Books.setSelectionBackground(new java.awt.Color(184, 184, 184));
        jScrollPane1.setViewportView(jTable1_Display_Books);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 110, 310, 310);

        jButton4.setBackground(new java.awt.Color(184, 184, 184));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/DIS.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(170, 290, 100, 90);

        jLabel3.setBackground(new java.awt.Color(184, 184, 184));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Insert ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 190, 100, 30);

        jButton5.setBackground(new java.awt.Color(184, 184, 184));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/P.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(340, 290, 110, 90);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 380, 100, 25);

        jButton3.setBackground(new java.awt.Color(116, 44, 44));
        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 440, 100, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Searching:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 50, 140, 60);

        jLabel4.setBackground(new java.awt.Color(184, 184, 184));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delete");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 190, 80, 25);

        jButton1.setBackground(new java.awt.Color(184, 184, 184));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/BO.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 90, 100, 100);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All Book");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 380, 80, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/court-of-the-dead-deluxe-hardcover-sketchbook-500492-09.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Library l1 = new Library();
        this.setVisible(false);
        l1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=library", "shreen", "123");
            int Row = jTable1_Display_Books.getSelectedRow();
            String value = (jTable1_Display_Books.getModel().getValueAt(Row, 0).toString());
            String query1 = "DELETE FROM book WHERE title = '" + value + "'";
            PreparedStatement pss = con.prepareStatement(query1);
            pss.execute();
            DefaultTableModel model = (DefaultTableModel) jTable1_Display_Books.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Insert I = new Insert();
        I.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Update U = new Update();
        U.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AllBook B = new AllBook();
        B.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Open().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Display_Books;
    // End of variables declaration//GEN-END:variables
}
