/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RedflixReto5;

import java.sql.*;

/**
 *
 * @author JLL
 */
public class DBConnection {
    
    private final String redflix;
    private final String usuario;
    private final String pass;
    private final String url;
    private final String puerto;
    private final String ip;
    private Connection conn;

    public DBConnection(String redflix, String usuario, String pass, String url, String puerto, String ip) {
        this.redflix = redflix;
        this.usuario = usuario;
        this.pass = pass;
        this.url = url;
        this.puerto = puerto;
        this.ip = ip;
    }
    
    private void connect(){
        
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    public void closeConnection(){
        
    }
    
    
    
    
}
