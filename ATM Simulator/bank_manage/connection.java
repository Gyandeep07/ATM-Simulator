package bank_manage;
import java.sql.*;
public class connection {
   // public static final String N = null;
    Connection c;
    Statement s;
    public connection() {
        try {
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Gyandeep@123");
s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
