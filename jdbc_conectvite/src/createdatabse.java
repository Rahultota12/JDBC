import java.sql.*;
public class createdatabse {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:/";
        String name ="root";
        String paw="Rahultota1234@#$";

        try {
            Connection con=DriverManager.getConnection(url, name, paw);

            String sql="create database student1 ";
            Statement st=con.createStatement();

            st.executeUpdate(sql);

            System.out.println("--- done ---");
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
