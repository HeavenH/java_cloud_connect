/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Actions {
    private final Connect conn = new Connect();
    
    private final String insertUser = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
    public boolean createUser(String name, String email, String password) {
        try {
            // conecta ao banco de dados
            PreparedStatement prepareStatement;
            prepareStatement = conn.getConnection().prepareStatement(insertUser);
            prepareStatement.setString(1, name);
            prepareStatement.setString(2, email);
            prepareStatement.setString(3, password);
            prepareStatement.execute();
            return true;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo usuário" + e.getMessage());
             return false;
        }   
    }
}
