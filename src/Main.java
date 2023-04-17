import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost";

        try (Connection conn = DriverManager.getConnection(url, "root", "")) {
            if (conn != null) {
                System.out.println("Verbinding met SQLite-database is succesvol!");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}