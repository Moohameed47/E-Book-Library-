/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.DriverManager;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class pub extends javax.swing.JFrame {

    public pub() {
        initComponents();
        setSize(900, 600);
        setLocation(500, 250);
        setResizable(false);
        setTitle("Book Store");
        show_user();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        returnpub = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 130, 190, 20);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 160, 190, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(200, 190, 190, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 250, 190, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 220, 190, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 100, 190, 20);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 370, 80, 30);

        returnpub.setText("Return");
        returnpub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnpubActionPerformed(evt);
            }
        });
        getContentPane().add(returnpub);
        returnpub.setBounds(700, 440, 90, 30);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Phone"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 70, 310, 350);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 130, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 160, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("pass");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 190, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("phone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 220, 50, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("city");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 250, 60, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("code");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 90, 50, 40);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 370, 80, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/court-of-the-dead-deluxe-hardcover-sketchbook-500492-09.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 910, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void returnpubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnpubActionPerformed
        Insert n = new Insert();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_returnpubActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=library", "shreen", "123");
            String query1 = "insert into publisher (pub_code,name,phone,city,email,pass) values (?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query1);
            pstmt.setInt(1, Integer.parseInt(jTextField4.getText()));
            pstmt.setString(2, jTextField1.getText());
            pstmt.setString(3, jTextField6.getText());
            pstmt.setString(4, jTextField7.getText());
            pstmt.setString(5, jTextField3.getText());
            pstmt.setString(6, jTextField2.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "INSERTED SUCCESSFULLY");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
    }//GEN-LAST:event_jButton1ActionPerformed

        /*     
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
*/
        this.setVisible(false);
        pub p = new pub();
        p.setVisible(true);
        show_user();
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=library", "shreen", "123");
            int Row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(Row, 0).toString());
            String query1 = "DELETE FROM publisher WHERE name = '" + value + "'";
            PreparedStatement pss = con.prepareStatement(query1);
            pss.execute();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "DELETED SUCCESSFULLY");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(pub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pub().setVisible(true);
            }
        });
    }

    public ArrayList<User> userList() {
        ArrayList<User> userList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=library", "shreen", "123");
            String query1 = "SELECT name , pub_code , phone FROM publisher";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while (rs.next()) {
                user = new User(rs.getString("name"), rs.getInt("pub_code"), rs.getString("phone"));
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
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[3];
            for (int i = 0; i < list.size(); ++i) {
                row[0] = list.get(i).getName();
                row[1] = list.get(i).getISBN();
                row[2] = list.get(i).getPhone();
                model.addRow(row);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton returnpub;
    // End of variables declaration//GEN-END:variables
}
