package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowStudents {

	private JFrame frmShowstudent;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudents window = new ShowStudents();
					window.frmShowstudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowStudents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmShowstudent = new JFrame();
		frmShowstudent.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhis\\OneDrive\\Desktop\\Avk Images\\th.jpg"));
		frmShowstudent.setTitle("ShowStudent");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width =screenSize.width;
		int height =screenSize.height;
		frmShowstudent.setSize(width, height);
		frmShowstudent.setLocationRelativeTo(null);
		//frmShowstudent.setBounds(100, 100, 450, 300);
		frmShowstudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmShowstudent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(62, 38, 1142, 76);
		frmShowstudent.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 112, 1246, 2);
		frmShowstudent.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 609, 1246, 2);
		frmShowstudent.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(43, 622, 115, 50);
		frmShowstudent.getContentPane().add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				JDBCHandling db = new JDBCHandling();
				ResultSet result = db.getTable();
				
				DefaultTableModel model=new DefaultTableModel();
				String[] columnNames= {"Serial No", "Frist Name", "Last Name", "Mobile", "Address", "Gender", "Degree", "DOB", "Subject1", "Subject2"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[]{
							result.getInt(1),
							result.getString(2),
							result.getString(3),
							result.getLong(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							result.getString(8),
							result.getString(9),
							result.getString(10)
						});
					}
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				try {
					result.close();
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				
			}
			
		});
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnShow.setBounds(617, 622, 115, 50);
		frmShowstudent.getContentPane().add(btnShow);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnClose.setBounds(1089, 622, 115, 50);
		frmShowstudent.getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 125, 1142, 438);
		frmShowstudent.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Arial Black", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(table);
		
		
		
		
		
	}
}
