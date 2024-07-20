import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "");
        Statement stmt = connection.createStatement();
        String query = "UPDATE EMPLOYEE set name='employee1' WHERE id=11";
        stmt.executeUpdate(query);
        System.out.println("Updated successfully!");          
    }
}