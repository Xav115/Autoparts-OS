import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame 
{

	private JPanel contentPane;
	protected static JTextField User;
	protected static JPasswordField Password;

	
	public Login() 
	{
		setFont(new Font("Verdana", Font.BOLD, 12));
		setForeground(new Color(255, 99, 71));
		setBackground(new Color(255, 99, 71));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 316);
		contentPane = new Fondo("fondo 4.png");
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 250, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_User = new JLabel("Username:");
		lbl_User.setForeground(Color.RED);
		lbl_User.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lbl_User.setBackground(Color.WHITE);
		lbl_User.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_User.setBounds(168, 79, 86, 23);
		contentPane.add(lbl_User);
		
		User = new JTextField();
		User.setBackground(Color.LIGHT_GRAY);
		User.setBounds(157, 113, 111, 20);
		contentPane.add(User);
		User.setColumns(10);
		
		JLabel lbl_Password = new JLabel("Password:");
		lbl_Password.setForeground(Color.RED);
		lbl_Password.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lbl_Password.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Password.setBounds(168, 144, 86, 23);
		contentPane.add(lbl_Password);
		
		Password = new JPasswordField();
		Password.setBackground(Color.LIGHT_GRAY);
		Password.setBounds(157, 178, 111, 20);
		contentPane.add(Password);
		
		final Login_Data data = new Login_Data();
		final Autoparts_os window2 = new Autoparts_os();
		
		JButton btn_Enter = new JButton("Enter");
		btn_Enter.setBackground(new Color(192, 192, 192));
		btn_Enter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_Enter.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				if(data.testPassword()) 
				{
					JOptionPane.showMessageDialog(null, "Welcome to Auto Parts Inventory Software!");
					window2.setVisible(true);
					dispose();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Error, please check your username or password");
				}
			}
		});
		btn_Enter.setBounds(178, 227, 66, 23);
		contentPane.add(btn_Enter);
		
		JLabel lblInfiniyAutoParts = new JLabel("Infiniy Auto Parts");
		lblInfiniyAutoParts.setForeground(Color.RED);
		lblInfiniyAutoParts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblInfiniyAutoParts.setBounds(105, 11, 230, 57);
		contentPane.add(lblInfiniyAutoParts);
	}
}
