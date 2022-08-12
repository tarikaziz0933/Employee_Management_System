package Ems;
import java.sql.Connection;
import java.sql.DriverManager;


public class javaconnect {
    Connection conn = null;
     public static Connection ConnecrDb() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/emp_ms","root","");
            System.out.println("Database connected");
            return con;
        }catch(Exception e){
                //JOptionPane.showMessageDialog(null, e);
                System.out.println("Error: "+e);
                return null;
        }
    }
    
}
