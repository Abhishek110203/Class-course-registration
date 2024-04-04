package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCHandling {
	
	Connection con =null;
	PreparedStatement psmt=null;
	Statement stmt;
	ResultSet result;
	JDBCHandling(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Got Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problem In Driver");
		}
		
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avk","root","Abhishek11");    
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Probelm in driver");
		}
		
		
	}
	


	int insertData(String fristName,String lastName,long mobile,String address,String gender,String degree,String dob,String subject1,String subject2) {
		int status=0;
		try {
			psmt =con.prepareStatement("Insert into student values(default,?,?,?,?,?,?,?,?,?)");
			
			psmt.setString(1, fristName);
			psmt.setString(2, lastName);
			psmt.setLong(3, mobile);
			psmt.setString(4, address);
			psmt.setString(5, gender);
			psmt.setString(6, degree);
			psmt.setString(7, dob);
			psmt.setString(8, subject1);
			psmt.setString(9, subject2);
			
			
			
			status=psmt.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return status;
	}
	
	
	
	
	ResultSet getTable() {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			result = stmt.executeQuery("Select * from student");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	ResultSet getRow(int SerialNumber) {
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select * from student where srNo = "+SerialNumber;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	int insertUpdate(String firstName, String lastName, long mobile, String address, String gender, String degree, String dob, String subject1, String subject2,int SerialNumber) {
		
		int status = 0;
		
		
		try {
			psmt = con.prepareStatement("update student set firstName = ? , lastName = ? , mobile = ? , address = ? , gender = ? , degree = ? , dob = ? , subject1 = ? , subject2 = ? where srNo = ?");
			psmt.setString(1, firstName);
			psmt.setString(2, lastName);
			psmt.setLong(3, mobile);
			psmt.setString(4, address);
			psmt.setString(5, gender);
			psmt.setString(6,  degree);
			psmt.setString(7, dob);
			psmt.setString(8, subject1);
			psmt.setString(9, subject2);
			psmt.setInt(10, SerialNumber);
			
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	int deleteUpdate(int SerialNumber) {
		int status = 0;
		try {
			psmt = con.prepareStatement("delete from student where srNo =?");
			psmt.setInt(1, SerialNumber);
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		

		
	}	
}