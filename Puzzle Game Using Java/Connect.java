
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MODERN
 */
public class Connect {
     
    public static Connection getConnection(){
    String url="jdbc:sqlite:C://sqlite/PuzzleGamers.db";
     Connection conn=null;
    try{
    conn=DriverManager.getConnection(url);
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
    return conn;
    }
    
}
    

