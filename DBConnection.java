package taruva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/taruwa"; // Modify this URL to your MySQL database
    private static final String USER = "root"; // MySQL username
    private static final String PASSWORD = "Koko@1990$"; // MySQL password
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());

    public static Connection getConnection() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish and return connection
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "MySQL JDBC Driver not found!", e);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Database connection failed!", e);
        }
        return null; // Return null if connection fails
    }

    public static void main(String[] args) {
        // Check if connection is successful
        Connection conn = getConnection();

        if (conn != null) {
            System.out.println("Database connection is working fine!");
            try {
                conn.close(); // Close connection after checking
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
