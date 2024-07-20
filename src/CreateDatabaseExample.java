import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseExample {

    public static void main(String[] args) throws SQLException ,IOException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "");
        Statement stmt= conn.createStatement();

        String query="CREATE DATABASE IF NOT EXISTS Company";
        stmt.executeUpdate(query);
        System.out.println("created Succcess");
    }
}
