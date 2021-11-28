package com.supmti.DAO;

import com.supmti.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    private Connection connection;

    public UserDAO(Connection connection) {
        super();
        this.connection = connection;
    }

    public boolean userRegister(User user)
    {
        boolean state = false;
        try{
                String query ="INSERT INTO user(nom,prenom,email,password) values (?,?,?,?)";
                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getLastname());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getPassword());


                preparedStatement.executeUpdate();
                state = true;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
            return  state;
    }

}
