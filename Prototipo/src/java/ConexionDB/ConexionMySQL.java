package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {
    
    Connection connection;

    public ConexionMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
