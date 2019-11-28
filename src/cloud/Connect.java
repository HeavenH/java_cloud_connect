package cloud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
    String url = "jdbc:postgresql://localhost:5432/cloud";
    String usuario = "postgres";
    String senha = "heaven";

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            
            return conn;
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o driver JDBC");
            
            return null;
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" + e.getMessage());
            
            return null;
        }
    }
}
