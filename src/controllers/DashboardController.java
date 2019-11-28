/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import models.User;
import cloud.Actions;

import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class DashboardController implements Initializable {
    
    private Actions user_action = new Actions();
    
    @FXML
    private TableView<User> table;
    
    //FXML dos input field

    @FXML
    private TableColumn<User, String> col_name;

    @FXML
    private TableColumn<User, String> col_email;

    @FXML
    private TableColumn<User, String> col_password;

    private ObservableList<User> users = FXCollections.observableArrayList();
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Actions action = new Actions();
      
        col_name.setCellValueFactory(new PropertyValueFactory<>("username"));
        col_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        col_password.setCellValueFactory(new PropertyValueFactory<>("password"));      
        
        users.addAll(action.userList());
        table.setItems(users);
    }
       
}
