
package org.me.usuarios;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class UsuarioConecta {
    
    private static final String URL = "jdbc:derby://localhost:1527/DB_DomiCalc";
    private static final String USERNAME = "EMPRESA";
    private static final String PASSWORD = "empresa";
    
    private Connection connection = null;
    private PreparedStatement insertNovoUsuario = null;
    private PreparedStatement selecionaUsuario = null;
    
    
    public UsuarioConecta () throws ClassNotFoundException{
     try
     {
     Class.forName("org.apache.derby.jdbc.ClientDriver");
     connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
     insertNovoUsuario = connection.prepareStatement ("INSERT INTO EMPRESA.USUARIOS " + "(NOME , EMAIL, SENHA, TELEFONE) " + "VALUES (?, ?, ?, ?)");
     selecionaUsuario = connection.prepareStatement("SELECT * FROM EMPRESA.USUARIOS WHERE EMAIL = ? AND SENHA = ?" );
       
     }
     catch (SQLException sqlException)
     {
     sqlException.printStackTrace();
     System.exit(1);
     }
     
    }
    
    
    
    public int adicionaUsuario(
     String nome, String email, String senha, String telefone )
     {
     int result = 0;
    try{
     insertNovoUsuario.setString(1, nome);
     insertNovoUsuario.setString(2, email);
     insertNovoUsuario.setString(3, senha);
     insertNovoUsuario.setString(4, telefone);

     result = insertNovoUsuario.executeUpdate();
     }
    catch (SQLException sqlException)
    {
     sqlException.printStackTrace();
     close();
    }
     return result;
     }
    
    
    public ResultSet Logar (String email, String senha){
        ResultSet resultSet = null;
        try {
        selecionaUsuario.setString(1, email);
        selecionaUsuario.setString(2, senha);
        
        resultSet = selecionaUsuario.executeQuery();
        
        }catch (SQLException sqlException)
        {
        sqlException.printStackTrace();
        close();
        }
        return resultSet;
        }

    public void close (){
     try
     {
     connection.close();
     }
     catch (SQLException sqlException)
    {
     sqlException.printStackTrace();
    }
    
  }

    
    
}
