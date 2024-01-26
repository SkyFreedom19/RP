
package Config;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    
    public static Connection getConnection(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/db_masjid";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = (Connection)DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
          
        }
        return conn;
    }
}

