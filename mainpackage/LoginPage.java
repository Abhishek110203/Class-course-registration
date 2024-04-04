package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frmAvkDevelopment;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmAvkDevelopment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAvkDevelopment = new JFrame();
		frmAvkDevelopment.getContentPane().setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		frmAvkDevelopment.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th.jpg"));
		frmAvkDevelopment.setTitle("AVK Developments ");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width =screenSize.width;
		int height =screenSize.height;
		frmAvkDevelopment.setSize(width/2, height/2);
		frmAvkDevelopment.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmAvkDevelopment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAvkDevelopment.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AVK Development");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(55, 11, 515, 34);
		frmAvkDevelopment.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 43, 594, 2);
		frmAvkDevelopment.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(55, 86, 96, 34);
		frmAvkDevelopment.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(55, 163, 86, 34);
		frmAvkDevelopment.getContentPane().add(lblNewLabel_2);
		
		JTextArea textLoginname = new JTextArea();
		textLoginname.setBackground(new Color(255, 255, 255));
		textLoginname.setFont(new Font("Arial Black", Font.BOLD, 15));
		textLoginname.setBounds(205, 92, 365, 28);
		frmAvkDevelopment.getContentPane().add(textLoginname);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtPassword.setBounds(205, 171, 365, 28);
		frmAvkDevelopment.getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 251, 616, 2);
		frmAvkDevelopment.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String loginName =textLoginname.getText();
				String password = txtPassword.getText();
				System.out.println(loginName + password);
				
				
				
				
				if(loginName.equals("Abhishek")&& password.equals("abhishek11")){
					//System.out.println("wow:Your are valid user");
					
					MainEntryPage.main(null);
					
					
				}else {
						JOptionPane.showMessageDialog(null, "Invalid user");
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnLogin.setBounds(34, 270, 107, 34);
		frmAvkDevelopment.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textLoginname.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(266, 270, 107, 34);
		frmAvkDevelopment.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(480, 270, 107, 34);
		frmAvkDevelopment.getContentPane().add(btnExit);
	}
}
