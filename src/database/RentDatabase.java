package database;
import java.sql.*;
import javax.swing.JOptionPane;
public class RentDatabase {
	
	public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sewabuku", "root", "");
            return connection;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke Database pastikan connection sudah benar !");
            return null;
        }
    }
}
