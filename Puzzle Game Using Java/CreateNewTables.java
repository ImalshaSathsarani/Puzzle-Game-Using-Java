
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MODERN
 */
public class CreateNewTables {
    
      
    public static void createNewTableHard(){
        String sql="CREATE TABLE IF NOT EXISTS GamersHard (\n"
                +"UserName text PRIMARY KEY  ,\n"
                +"Marks text NOT  NULL,\n"
                +"Moves text NOT  NULL,\n"
                +"Timing text NOT NULL\n"
                +");";
        
        try{
            Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.execute(sql);
        }catch(SQLException e){
        System.out.println(e.getMessage());
        }
    
    }
    
     public static void createNewTableMedium(){
        String sql="CREATE TABLE IF NOT EXISTS GamersMedium (\n"
                +"UserName text PRIMARY KEY  ,\n"
                +"Marks text NOT  NULL,\n"
                +"Moves text NOT  NULL\n"
                +");";
        
        try{
            Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.execute(sql);
        }catch(SQLException e){
        System.out.println(e.getMessage());
        }
    
    }
     
      public static void createNewTableEasy(){
        String sql="CREATE TABLE IF NOT EXISTS GamersEasy (\n"
                +"UserName text PRIMARY KEY  ,\n"
                +"Marks text NOT  NULL\n"
                +");";
        
        try{
            Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.execute(sql);
        }catch(SQLException e){
        System.out.println(e.getMessage());
        }
    
    }
      
      public static void deleteEasyDetails(){
      
      String sql= "DELETE  FROM GamersEasy";
      try{
           Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
      }catch(SQLException e){
        System.out.println(e.getMessage());
        }
      
      }
      
      
      public static void deleteMediumDetails(){
      
      String sql= "DELETE  FROM GamersMedium";
      try{
           Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
      }catch(SQLException e){
        System.out.println(e.getMessage());
        }
      
      }
      
      
      
      public static void deleteHardDetails(){
      
      String sql= "DELETE  FROM GamersHard";
      try{
           Connection conn=Connect.getConnection();
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
      }catch(SQLException e){
        System.out.println(e.getMessage());
        }
      
      }
      
    
    
}
