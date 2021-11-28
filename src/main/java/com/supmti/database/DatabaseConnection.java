package com.supmti.database;
import java.sql.*;

public class DatabaseConnection {

    private static Connection connection;


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/authentification","root","");

        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }



        return connection;
    }


}
