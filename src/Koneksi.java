
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIMAS
 */
public class Koneksi {
    private static Connection connector;
    public static Connection Connect(String Dbs) throws SQLException {
        try {
            String DB = "jdbc:mysql://localhost:3306/" + Dbs;
            String username = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connector = (java.sql.Connection) DriverManager.getConnection(DB, username, password);
            return connector;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}
