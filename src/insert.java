import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "");
        Statement stmt = connection.createStatement();
        String query = "INSERT INTO Employee (id,name,email) VALUES (11,'EMP1','emp1@gmail.com')";
        stmt.executeUpdate(query);
        System.out.println("INSERTED successfully!");          
    }
}