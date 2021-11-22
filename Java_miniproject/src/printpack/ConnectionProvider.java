package printpack;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author praty
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/new?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
