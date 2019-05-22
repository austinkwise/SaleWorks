package main.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    /*
     * Server name:remotemysql.com
     * Database name: hgUMbE0USB
     * Username: hgUMbE0USB
     * Password: N4x3lR8EnR
     *
     * @author austinwise
     */
    private static final String databaseName = "hgUMbE0USB";
    private static final String DB_URL = "jdbc:mysql://remotemysql.com/" + databaseName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "hgUMbE0USB";
    private static final String pass = "N4x3lR8EnR";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    private static Connection conn;

    public static void init() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        conn = DriverManager.getConnection(DB_URL, user, pass);
    }


}
