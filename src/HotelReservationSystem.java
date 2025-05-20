import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HotelReservationSystem {

    private static final  String url = "jdbc:mysql://localhost:3306/?user=root";

    private static final  String username = "root";

    private static final  String password = "House07road11";



    public static void main(String[] args)  throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Succesful connection with database");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}