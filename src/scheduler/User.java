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
public class User implements Serializable, Cloneable{
    private String username;
    private String password;
    private boolean logged;
    
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
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public void setLogged(){
        logged = true;
    }
    
    public boolean getLogged(){
        return logged;
    }
    
}
