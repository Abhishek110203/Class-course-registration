package mainpackage;

import java.awt.EventQueue;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudentPage;
	private JTextField textfistName;
	private JTextField textlastName;
	private JTextField txtSerialNumber;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudentPage = new JFrame();
		frmDeleteStudentPage.setTitle("Delete Student Page");
		frmDeleteStudentPage.setBounds(250, 50, 1050, 800);
		frmDeleteStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Entry");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setBounds(208, 29, 619, 78);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 109, 1016, 2);
		frmDeleteStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Serial Number to Update");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 145, 557, 69);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtSerialNumber.getText());
				
				JDBCHandling db = new JDBCHandling();
				ResultSet result = null;
				result = db.getRow(number);
				try {
					while(result.next()) {
						textfistName.setText(result.getString(2));
						textlastName.setText(result.getString(3));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(803, 162, 160, 42);
		frmDeleteStudentPage.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Frist Name");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(29, 298, 245, 42);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(29, 393, 245, 42);
		frmDeleteStudentPage.getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 578, 1016, 2);
		frmDeleteStudentPage.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentPage.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(41, 613, 139, 42);
		frmDeleteStudentPage.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling db= new JDBCHandling();
				int SerialNumber= Integer.parseInt(txtSerialNumber.getText());
				
				int status =db.deleteUpdate(SerialNumber);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in Deleted Data");
				}
				
				textfistName.setText(null);
				textlastName.setText(null);
				txtSerialNumber.setText(null);
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(465, 613, 139, 42);
		frmDeleteStudentPage.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("CLOSE");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentPage.setVisible(false);
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(838, 613, 139, 42);
		frmDeleteStudentPage.getContentPane().add(btnNewButton_1_2);
		
		txtSerialNumber = new JTextField();
		txtSerialNumber.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtSerialNumber.setColumns(10);
		txtSerialNumber.setBounds(607, 162, 107, 33);
		frmDeleteStudentPage.getContentPane().add(txtSerialNumber);
		
		textfistName = new JTextField();
		textfistName.setForeground(Color.BLUE);
		textfistName.setFont(new Font("Arial Black", Font.BOLD, 15));
		textfistName.setBounds(302, 305, 608, 33);
		frmDeleteStudentPage.getContentPane().add(textfistName);
		textfistName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setForeground(new Color(0, 0, 255));
		textlastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		textlastName.setColumns(10);
		textlastName.setBounds(302, 400, 608, 33);
		frmDeleteStudentPage.getContentPane().add(textlastName);
	}
}
