/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Aluno
 */
public class User {
	private String username;
	private String email;
	private String password;
	
	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
        
        public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public User(String nomeUsuario) {
		this.username = username;
	}
	
	public User() {
		
	}

	public String getUserName() {
		return username;
	}

	public void setNomeUsuario(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return email;
	}

	public void setEmailUser(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return password;
	}

	public void setEmailUsuario(String password) {
		this.password = password;
	}
    
}
