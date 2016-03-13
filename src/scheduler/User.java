/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.io.Serializable;

/**
 *
 * @author Ayomitunde
 */
public class User implements Serializable{
    private String username;
    private String password;
    
    public User(String user, String pass){
        this.username = user;
        this.password = pass;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
}
