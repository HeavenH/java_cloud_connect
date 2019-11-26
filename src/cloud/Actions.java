/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

import models.User;

/**
 *
 * @author Aluno
 */
public class Actions {
    private final Connect conn = new Connect();
    
    private final String insertUser = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
    private final String userList = "SELECT * FROM users";
    public boolean createUser(User user) {
        try {
            // conecta ao banco de dados
            PreparedStatement prepareStatement;
            prepareStatement = conn.getConnection().prepareStatement(insertUser);
            prepareStatement.setString(1, user.getUserName());
            prepareStatement.setString(2, user.getUserEmail());
            prepareStatement.setString(3, user.getUserPassword());
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo usuário" + e.getMessage());
             return false;
        }   
    }
    
    public ArrayList<User> userList(){
        ArrayList<User> user_list = new ArrayList<>();
        
        try {
            PreparedStatement prepareStatement;
            prepareStatement = conn.getConnection().prepareStatement(userList);
            
            ResultSet rs = prepareStatement.executeQuery();
            
            while (rs.next()) { //enquanto houver registro
		User user = new User(rs.getString("name"),rs.getString("email"), rs.getString("password"));
		user_list.add(user); 
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user_list;
    }
}
