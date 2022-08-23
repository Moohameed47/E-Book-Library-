package javaapplication1;

import javax.swing.JOptionPane;

public class Library extends javax.swing.JFrame {

    public Library() {
        initComponents();
        setSize(900, 600);
        setResizable(false);
        setTitle("Book Store");
        setLocation(500, 250);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 170, 172, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(210, 240, 172, 30);

        jLabel4.setFont(new java.awt.Font("_PDMS_Saleem_QuranFont", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserName");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 170, 110, 32);

        jLabel5.setFont(new java.awt.Font("_PDMS_Saleem_QuranFont", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 240, 100, 29);

        jButton1.setBackground(new java.awt.Color(60, 63, 65));
        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 300, 110, 40);

        jLabel3.setFont(new java.awt.Font("_PDMS_IslamicFont", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("login:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 170, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm/newpackage/S1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ADMINUSER = "shreen";
        String ADMINPASS = "123";
        String User = jTextField1.getText();
        char[] Pass = jPasswordField1.getPassword();
        String Password = "";
        for (char it : Pass) {
            Password += it;
        }
        if (User.equals(ADMINUSER) && Password.equals(ADMINPASS)) {
            Open o = new Open();
            o.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "INVALID INPUT");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
