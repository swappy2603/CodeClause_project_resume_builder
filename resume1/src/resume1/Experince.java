package resume1;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Experince extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblFirstName;
	private JTextField textField_1;
	private JLabel lblFirstName_2;
	private JTextField textField_2;
	private JLabel lblFirstName_3;
	private JLabel lblFirstName_4;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblFirstName_5;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblLastName;
	private JTextField textField_6;
	/*** PI var***/
	String firstname,lastname,email,phone,address,nationality;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Experince frame = new Experince();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Experince() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 751);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Experience");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(52, 42, 226, 41);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 0, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setBounds(52, 90, 226, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		
		lblFirstName = new JLabel("Company name1");
		lblFirstName.setForeground(new Color(0, 0, 0));
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFirstName.setBounds(52, 156, 226, 41);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFirstName.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblFirstName.setBounds(52, 156, 226, 41);
			}
		});
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setColumns(10);
		textField_1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(52, 195, 226, 33);
		contentPane.add(textField_1);
		
		lblFirstName_2 = new JLabel("Job title1");
		lblFirstName_2.setForeground(new Color(0, 0, 0));
		lblFirstName_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFirstName_2.setBounds(52, 254, 226, 33);
		contentPane.add(lblFirstName_2);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFirstName_2.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblFirstName_2.setBounds(52, 254, 226, 33);
			
			}
		});
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setColumns(10);
		textField_2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(52, 297, 226, 33);
		contentPane.add(textField_2);
		
		lblFirstName_3 = new JLabel("Company name2");
		lblFirstName_3.setForeground(new Color(0, 0, 0));
		lblFirstName_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFirstName_3.setBounds(52, 384, 226, 41);
		contentPane.add(lblFirstName_3);
		
		lblFirstName_4 = new JLabel("University name");
		lblFirstName_4.setForeground(new Color(0, 0, 0));
		lblFirstName_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFirstName_4.setBounds(471, 380, 226, 41);
		contentPane.add(lblFirstName_4);
		
		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFirstName_3.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblFirstName_3.setBounds(52, 384, 226, 41);
			}
		});
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setColumns(10);
		textField_3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(52, 435, 226, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFirstName_4.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblFirstName_4.setBounds(471, 380, 226, 41);
			}
		});
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setColumns(10);
		textField_4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(471, 420, 209, 41);
		contentPane.add(textField_4);
		
		lblFirstName_5 = new JLabel("Job title2");
		lblFirstName_5.setForeground(new Color(0, 0, 0));
		lblFirstName_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFirstName_5.setBounds(52, 489, 226, 41);
		contentPane.add(lblFirstName_5);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFirstName_5.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblFirstName_5.setBounds(52, 489, 226, 41);
			}
		});
		textField_5.setForeground(new Color(0, 0, 0));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setColumns(10);
		textField_5.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(52, 540, 693, 33);
		contentPane.add(textField_5);
		
		btnNewButton = new JButton("Save and Continue");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Skills sk = new Skills();
				sk.setVisible(true);
				dispose();
				
				/*** VAR defination***/
				sk.companyname1=textField_1.getText();
				sk.companyname2=textField_3.getText();
				sk.jobtitle1=textField_2.getText();
				sk.jobtitle2=textField_5.getText();
				sk.uniname=textField_4.getText();
				sk.degree=textField_6.getText();
				
				/*** PI var defination***/
				sk.FN=firstname;
				sk.LN=lastname;
				sk.EM=email;
				sk.PN=phone;
				sk.ADD=address;
				sk.NA=nationality;
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(495, 650, 245, 41);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Resume Builder made by swapnil");
		lblNewLabel_1.setBounds(52, 668, 171, 13);
		contentPane.add(lblNewLabel_1);
		
		lblLastName = new JLabel("Degree");
		lblLastName.setForeground(new Color(0, 0, 0));
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblLastName.setBounds(442, 156, 226, 41);
		contentPane.add(lblLastName);
		
		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblLastName.setFont(new Font("Sylfaen", Font.PLAIN,15));
				lblLastName.setBounds(442, 156, 226, 41);
				
			}
		});
		textField_6.setForeground(Color.BLUE);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setColumns(10);
		textField_6.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,Color.BLUE));
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(442, 195, 226, 33);
		contentPane.add(textField_6);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setForeground(Color.BLUE);
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQualification.setBounds(442, 42, 226, 41);
		contentPane.add(lblQualification);
	}
}
