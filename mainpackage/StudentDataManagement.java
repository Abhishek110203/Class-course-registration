package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class StudentDataManagement {

	private JFrame frmStudentdatabasemanagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStudentdatabasemanagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentdatabasemanagement = new JFrame();
		frmStudentdatabasemanagement.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th.jpg"));
		frmStudentdatabasemanagement.setTitle("Student Database Management Frame");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width =screenSize.width;
		int height =screenSize.height;
		frmStudentdatabasemanagement.setSize(width,height);
		frmStudentdatabasemanagement.setLocationRelativeTo(null);
		//frmStudentdatabasemanagement.setBounds(100, 100, 450, 300);
		frmStudentdatabasemanagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentdatabasemanagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(16, 11, 1233, 64);
		frmStudentdatabasemanagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 87, 1246, -12);
		frmStudentdatabasemanagement.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 74, 1246, 2);
		frmStudentdatabasemanagement.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(168, 86, 936, 487);
		frmStudentdatabasemanagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAdd = new JButton("");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
				
			}
		});
		btnAdd.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th (1).jpg"));
		btnAdd.setBounds(23, 11, 306, 194);
		panel.add(btnAdd);
		
		JButton btnShow = new JButton("");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStudents.main(null);
			}
		});
		btnShow.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\multimedia-photo-icon-31.png"));
		btnShow.setBounds(567, 11, 306, 194);
		panel.add(btnShow);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th (2).jpg"));
		btnUpdate.setBounds(23, 262, 306, 194);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th (3).jpg"));
		btnDelete.setBounds(567, 262, 306, 194);
		panel.add(btnDelete);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 581, 1256, 2);
		frmStudentdatabasemanagement.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentdatabasemanagement.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(42, 608, 141, 52);
		frmStudentdatabasemanagement.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1082, 608, 141, 52);
		frmStudentdatabasemanagement.getContentPane().add(btnExit);
	}
}
