import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	
	public static void main(String[] args) {
		
		Connection con  = null;
		try {
			//loads the class in memory
			//registering itself with driver manager
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcurl = "jdbc:mysql://localhost:3306/firstdb";
			con = DriverManager.getConnection(jdbcurl, "root", "siddhu");
			System.out.println("Connection established");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}
}
