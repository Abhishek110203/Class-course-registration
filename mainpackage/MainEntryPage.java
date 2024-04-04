package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmAvkDevelopmentMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmAvkDevelopmentMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAvkDevelopmentMain = new JFrame();
		frmAvkDevelopmentMain.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th.jpg"));
		frmAvkDevelopmentMain.setTitle("AVK Development Main Entry Page");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width =screenSize.width;
		int height =screenSize.height;
		frmAvkDevelopmentMain.setSize(width,height);
		frmAvkDevelopmentMain.setLocationRelativeTo(null);
		//frmAvkDevelopmentMain.setBounds(100, 100, 450, 300);
		frmAvkDevelopmentMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAvkDevelopmentMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to AVK Development Systems");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel.setBounds(38, 48, 1189, 50);
		frmAvkDevelopmentMain.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 123, 1256, 2);
		frmAvkDevelopmentMain.getContentPane().add(separator);
		
		JButton btnstaff = new JButton("");
		btnstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnstaff.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\staff_login.png"));
		btnstaff.setBounds(119, 183, 364, 345);
		frmAvkDevelopmentMain.getContentPane().add(btnstaff);
		
		JButton btnstudent = new JButton("");
		btnstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
					
				
				
				
			}
		});
		btnstudent.setIcon(new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\student-login.jpg"));
		btnstudent.setBounds(727, 183, 398, 345);
		frmAvkDevelopmentMain.getContentPane().add(btnstudent);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 556, 1256, 2);
		frmAvkDevelopmentMain.getContentPane().add(separator_1);
		
		JButton btnNewButton_2 = new JButton("STAFF");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_2.setBounds(223, 149, 138, 23);
		frmAvkDevelopmentMain.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("STUDENT");
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(854, 149, 149, 23);
		frmAvkDevelopmentMain.getContentPane().add(btnNewButton_2_1);
		
		JButton btnback = new JButton("Back");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAvkDevelopmentMain.setVisible(false);
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnback.setBounds(60, 596, 111, 41);
		frmAvkDevelopmentMain.getContentPane().add(btnback);
		
		JButton btnexit = new JButton("Exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnexit.setBounds(1040, 596, 111, 41);
		frmAvkDevelopmentMain.getContentPane().add(btnexit);
	}

}
