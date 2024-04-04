package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AddStudent {

	private JFrame frmAddStudentPage;
	private JTextField textFistName;
	private JTextField textLastName;
	private JTextField txtMobile;
	private JTextField textField;
	private JTextArea textAddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentPage = new JFrame();
		frmAddStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th.jpg"));
		frmAddStudentPage.setTitle("Update Student Pages");
		frmAddStudentPage.setBounds(250, 50, 1050, 800);
		frmAddStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(48, 0, 939, 88);
		frmAddStudentPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 85, 1016, 2);
		frmAddStudentPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Frist Name ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 118, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(48, 183, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(48, 254, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(48, 327, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(48, 456, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Degree");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(559, 456, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("D O B");
		lblNewLabel_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_2.setBounds(48, 538, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("Subject");
		lblNewLabel_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(559, 538, 135, 49);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1_1_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setForeground(new Color(255, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(680, 553, 99, 23);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_1.setForeground(new Color(255, 0, 0));
		chckbxNewCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(803, 551, 107, 23);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 15));
		textField.setBounds(302, 541, 282, 33);
		frmAddStudentPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 585, 1016, 2);
		frmAddStudentPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		
		JTextArea textAddress = new JTextArea();
		textAddress.setFont(new Font("Arial Black", Font.BOLD, 15));
		textAddress.setBounds(302, 341, 608, 104);
		frmAddStudentPage.getContentPane().add(textAddress);
		
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(10, 618, 122, 37);
		frmAddStudentPage.getContentPane().add(btnNewButton);
		
		textFistName = new JTextField();
		textFistName.setForeground(Color.BLUE);
		textFistName.setFont(new Font("Arial Black", Font.BOLD, 15));
		textFistName.setBounds(302, 134, 608, 33);
		frmAddStudentPage.getContentPane().add(textFistName);
		textFistName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setForeground(new Color(0, 0, 255));
		textLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		textLastName.setColumns(10);
		textLastName.setBounds(302, 199, 608, 33);
		frmAddStudentPage.getContentPane().add(textLastName);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(Color.BLUE);
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(302, 270, 608, 33);
		frmAddStudentPage.getContentPane().add(txtMobile);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(302, 470, 282, 35);
		frmAddStudentPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(0, 7, 111, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(146, 7, 111, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE ", "BCA", "BCS", "MCA", "ME"}));
		comboBox.setBounds(694, 471, 216, 22);
		frmAddStudentPage.getContentPane().add(comboBox);
		
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName= textFistName.getText();
				String lastName= textLastName.getText();
				
				long mobile= Long.parseLong(txtMobile.getText());
				String address=textAddress.getText();
				
				System.out.println(firstName+lastName+mobile+address);
				
				
				long date= Long.parseLong(textField.getText());
				System.out.println(date);
				
				
				
				String subject1=null;
				String subject2=null;
				
				boolean isSelected=chckbxNewCheckBox.isSelected();
				if(isSelected) {
					subject1=chckbxNewCheckBox.getLabel();
				}
				isSelected=chckbxNewCheckBox_1.isSelected();
				if(isSelected) {
					subject1=chckbxNewCheckBox_1.getLabel();
				}
				
				System.out.println(subject1+subject2);
				
				String gender=null;
				if(rdbtnNewRadioButton.isSelected()) {
					gender="male";
					
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					gender="female";
				}
				System.out.println(gender);
				
				String degree=null;
				degree=(String)comboBox.getSelectedItem();
				System.out.println(degree);
				String dob= textField.getText();
				
				
				
				JDBCHandling db=new JDBCHandling();
				
				int status=db.insertData(firstName, lastName, mobile, address, gender, degree,dob, subject1, subject2);
				System.out.println(firstName+lastName+mobile+address+gender+degree+dob+subject1+subject2);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null,"Data Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Data insert in");
				}
				
				
				
				
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(250, 618, 122, 37);
		frmAddStudentPage.getContentPane().add(btnSave);
		
		JButton btnNewButton_1_1 = new JButton("RESET");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFistName.setText(" ");
				textLastName.setText(" ");
				txtMobile.setText(" ");
				textField.setText(" ");
				textAddress.setText(" ");
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				textField.setText(null);
				
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(559, 618, 122, 37);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("CLOSE");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(843, 618, 122, 37);
		frmAddStudentPage.getContentPane().add(btnNewButton_1_2);
		
		
		
	
		
	}
}
