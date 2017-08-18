package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mijares on 03/08/2017.
 */
public class DBUtil {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "toor";
    private static final String CONN_STRING =
            "jdbc:mysql://localhost/casa";

    public static Connection getConnection(DBType dbType) throws SQLException {

        switch (dbType){
            case MYSQL:
                return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            default:
                return null;
        }

    }

    public static void processException(SQLException e){
        System.err.println("Error message: " + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
        System.err.println("SQL state: " +e.getSQLState());

    }
}
