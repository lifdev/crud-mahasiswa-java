package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 */
public class koneksi {
    
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_crud_java";
        String user = "root";
        String pass = "";
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        Connection c = koneksi.getConnection();
        if (c != null) {
            try {
                System.out.println("Connected to database: " + c.getCatalog());
            } catch (SQLException e) {
                System.out.println("Error fetching catalog: " + e.getMessage());
            }
        }
    }
}
