/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invproject;

/**
 *
 * @author Celeste Artley
 */
public class User {
    private String username = "";
    private String password = "";
    private String email = "";
    
    public User(String username, String password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassWord(String password)
    {
        this.password = password;
    }
    public String getEmail()
    {
        return username;
    }
    public void setEmail(String password)
    {
        this.password = password;
    }
    
    
}
