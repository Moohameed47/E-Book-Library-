package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class L1 {
   
    public static void main(String args[]) {
        Connection con;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=library";
        String username = "shreen";
        String password = "123";
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("DATABASE CONNECTED");
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }
}
