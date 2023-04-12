import java.sql.*;
public class createTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:/student1";
        String name ="root";
        String paw="Rahultota1234@#$";

        try {
            Connection con=DriverManager.getConnection(url, name, paw);

            String sql="create table ITStudent1 "+"(id int , name varchar(20))";
            Statement st=con.createStatement();

            st.executeUpdate(sql);

            System.out.println("--- done ---");
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

