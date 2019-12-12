import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Autoparts_os extends JFrame 
{
	private JPanel contentPane;
	private JTextField Daytxt;

	public Autoparts_os() 
	{	
		Mitsubitshi mitsu = new Mitsubitshi();
		
		Mitsubitshi_Data data = new Mitsubitshi_Data();
		Prediction myPrediction = new Prediction();
		
		Mazda maz = new Mazda();
		
		Nissan nissan = new Nissan();
		
		Suzuki suzuki = new Suzuki();
		
		Toyota toyota = new Toyota();
		
		
		setTitle("Auto Parts OS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 600);
		contentPane = new Fondo("fondo 5.jpg");
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Fondo panel = new Fondo("fondo 4.png");
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 104, 282, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea ReciboTxT = new JTextArea();
		ReciboTxT.setEditable(false);
		ReciboTxT.setBackground(Color.WHITE);
		ReciboTxT.setBounds(20, 114, 241, 287);
		panel.add(ReciboTxT);
		
		JLabel lblNewLabel = new JLabel("Subtotal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 22, 78, 19);
		panel.add(lblNewLabel);
		
		JTextArea subtotal = new JTextArea();
		subtotal.setEditable(false);
		subtotal.setBounds(125, 19, 115, 22);
		panel.add(subtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(20, 68, 46, 14);
		panel.add(lblTotal);
		
		JTextArea totalt = new JTextArea();
		totalt.setEditable(false);
		totalt.setBounds(125, 65, 115, 22);
		panel.add(totalt);
		
		JButton Recibo = new JButton("Reciept");
		Recibo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{	
				
				ReciboTxT.setText(mitsu.motorReci() + mitsu.accReci() + mitsu.exteReci() +
						maz.motorReci() + maz.accReci() + maz.exteReci() +
						suzuki.motorReci() + suzuki.accReci() + suzuki.exteReci() +
						toyota.motorReci() + toyota.accReci() + toyota.exteReci() +
						nissan.motorReci() + nissan.accReci() + nissan.exteReci());
				
			}
		});
		Recibo.setFont(new Font("Tahoma", Font.BOLD, 14));
		Recibo.setBounds(96, 412, 89, 23);
		panel.add(Recibo);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				ReciboTxT.setText(mitsu.motorReci() + mitsu.accReci() + mitsu.exteReci() +
						maz.motorReci() + maz.accReci() + maz.exteReci() +
						suzuki.motorReci() + suzuki.accReci() + suzuki.exteReci() +
						toyota.motorReci() + toyota.accReci() + toyota.exteReci() +
						nissan.motorReci() + nissan.accReci() + nissan.exteReci());
				
				double totales = Mitsubitshi.total() + Mazda.total() + Nissan.total() + Suzuki.total() + Toyota.total();
				
				String StrSubtotal = "$" + String.format("%.2f",totales);
				
				subtotal.setText(StrSubtotal);
				
				double total = (totales * 1.115);
				
				String Strtotal = "$" + String.format("%.2f",total);
				
				totalt.setText(Strtotal);
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(9, 412, 89, 23);
		panel.add(btnTotal);
		
		Fondo panel_1 = new Fondo("fondo 4.png");
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(334, 153, 384, 397);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Button toyota_btn = new Button("Toyota");
		toyota_btn.setFont(new Font("Dialog", Font.BOLD, 18));
		toyota_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				toyota.setVisible(true);
			}
		});
		toyota_btn.setBackground(Color.CYAN);
		toyota_btn.setBounds(29, 72, 134, 65);
		panel_1.add(toyota_btn);
		
		Button nissan_btn = new Button("Nissan");
		nissan_btn.setFont(new Font("Dialog", Font.BOLD, 18));
		nissan_btn.setBackground(new Color(250, 250, 210));
		nissan_btn.setBounds(29, 196, 134, 65);
		panel_1.add(nissan_btn);
		nissan_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				nissan.setVisible(true);
			}
		});
		
		Button mitsubitshi_btn = new Button("Mitsubitshi");
		mitsubitshi_btn.setFont(new Font("Dialog", Font.BOLD, 18));
		mitsubitshi_btn.setBackground(Color.GREEN);
		mitsubitshi_btn.setBounds(222, 72, 134, 65);
		panel_1.add(mitsubitshi_btn);
		mitsubitshi_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			mitsu.setVisible(true);
			}
		});
		
		Button mazda_btn = new Button("Mazda");
		mazda_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				maz.setVisible(true);
			}
		});
		mazda_btn.setFont(new Font("Dialog", Font.BOLD, 18));
		mazda_btn.setBackground(Color.MAGENTA);
		mazda_btn.setBounds(222, 196, 134, 65);
		panel_1.add(mazda_btn);
		
		JLabel lblPiezasDeCarro = new JLabel("Brands");
		lblPiezasDeCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPiezasDeCarro.setBounds(153, 11, 89, 25);
		panel_1.add(lblPiezasDeCarro);
		
		Button button_Suzuki = new Button("Suzuki");
		button_Suzuki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				suzuki.setVisible(true);
			}
		});
		button_Suzuki.setActionCommand("Suzuki");
		button_Suzuki.setFont(new Font("Dialog", Font.BOLD, 18));
		button_Suzuki.setBackground(Color.YELLOW);
		button_Suzuki.setBounds(127, 300, 134, 65);
		panel_1.add(button_Suzuki);
		
		Fondo panel_2 = new Fondo("Logo1.png");
		panel_2.setBounds(731, 27, 176, 61);
		contentPane.add(panel_2);
		
		Fondo fondo = new Fondo("fondo 4.png");
		fondo.setBounds(752, 153, 188, 168);
		contentPane.add(fondo);
		fondo.setLayout(null);
		fondo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fondo.setBackground(Color.LIGHT_GRAY);
		
		Button button_1 = new Button("Display");
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Inventary_in In = new Inventary_in();
				In.setMitsubishiData(data);
				In.setVisible(true);
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 18));
		button_1.setBackground(UIManager.getColor("Button.shadow"));
		button_1.setBounds(37, 73, 117, 65);
		fondo.add(button_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				ReciboTxT.setText("");
				subtotal.setText("");
				totalt.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(183, 412, 89, 23);
		panel.add(btnReset);
		
		JLabel lblComands = new JLabel("Inventory");
		lblComands.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblComands.setBounds(37, 11, 117, 25);
		fondo.add(lblComands);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(908, 0, 65, 23);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("Logout");
		toolBar.add(btnNewButton);
		
		JLabel lblInfinityAutoParts = new JLabel("Infinity Auto Parts");
		lblInfinityAutoParts.setForeground(Color.RED);
		lblInfinityAutoParts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblInfinityAutoParts.setBounds(336, 11, 434, 94);
		contentPane.add(lblInfinityAutoParts);
		
		Fondo fondo_1 = new Fondo("fondo 4.png");
		fondo_1.setLayout(null);
		fondo_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fondo_1.setBackground(Color.LIGHT_GRAY);
		fondo_1.setBounds(752, 349, 188, 201);
		contentPane.add(fondo_1);
		
		JLabel lblManualPrediction = new JLabel("M Prediction");
		lblManualPrediction.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblManualPrediction.setBounds(34, 11, 144, 33);
		fondo_1.add(lblManualPrediction);
		
		Daytxt = new JTextField();
		Daytxt.setBounds(95, 90, 32, 20);
		fondo_1.add(Daytxt);
		Daytxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter amount of days");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 55, 168, 24);
		fondo_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("to predict:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 90, 75, 16);
		fondo_1.add(lblNewLabel_2);
		Button button = new Button("Enter");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Prediction p = new Prediction();
				
				String Days = Daytxt.getText();
				
				int days = Integer.parseInt(Days);
				
				p.needResupply(mitsu.cantidadPm, days);
				p.needResupply(mitsu.cantidadPa, days);
				p.needResupply(mitsu.cantidadPe, days);
				
				p.needResupply(maz.cantidadPm, days);
				p.needResupply(maz.cantidadPa, days);
				p.needResupply(maz.cantidadPe, days);
			

				p.needResupply(suzuki.cantidadPm, days);
				p.needResupply(suzuki.cantidadPa, days);
				p.needResupply(suzuki.cantidadPe, days);
				
				p.needResupply(nissan.cantidadPm, days);
				p.needResupply(nissan.cantidadPa, days);
				p.needResupply(nissan.cantidadPe, days);

				p.needResupply(toyota.cantidadPm, days);
				p.needResupply(toyota.cantidadPa, days);
				p.needResupply(toyota.cantidadPe, days);

			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBackground(SystemColor.controlShadow);
		button.setBounds(113, 167, 65, 24);
		fondo_1.add(button);
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				OptionBye bye = new OptionBye();
				final Login log = new Login();
				
					log.setVisible(true);
					dispose();
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
