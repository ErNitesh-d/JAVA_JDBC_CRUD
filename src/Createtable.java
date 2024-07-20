import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Createtable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "");
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS EMPLOYEE ("
                    + "id INT(11) NOT NULL AUTO_INCREMENT, "
                    + "name VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(50) NOT NULL, "
                    + "PRIMARY KEY (id))");
        System.out.println("Table created successfully!");          
    }
}