package project2_GroupProject;

import java.sql.*;

public class OrderTableManager {
    // Create a named constant for the URL
    public final String DB_URL = "jdbc:derby://localhost:1527/Pizza";
    
    
    // Field for database connection
    private Connection conn;
    
    /**
     * Constructor
     */
    public OrderTableManager() throws SQLException {
        // Create a connection to database
        conn = DriverManager.getConnection(DB_URL, "user1", "password");
    }
    
    public void insert(String size, String crustStyle,
            String toppingList, double cost) throws SQLException {
        String query = "INSERT INTO ordertable VALUES" + "(" + "'" + size +
                "', " + "'" + crustStyle + "', " + "'" + toppingList +
                "', " + "'" + cost + "'" + ")";
        
        // Create a statement object
        Statement stmt = conn.createStatement();
        
        // Send statement to the DBMS
        stmt.executeUpdate(query);
        
        // Close statement
        conn.close();
        stmt.close();
    }
    
}
