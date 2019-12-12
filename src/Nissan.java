import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Nissan extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Nissan_Data NissanData = new Nissan_Data();
	static String Motor = "Piezas de motor: 35";
	static String Acc = "Piezas de accesorios: 35";
	static String Ext = "Piezas de exterior: 35";
	static String Marca = "";
	static String Modelo = "";
	static String Ano = "";
	String cantidadM = "";
	String cantidadA = "";
	String cantidadE = "";
	
	static int cantidadPm;
	static int cantidadPa;
	static int cantidadPe;
	
	float PrecioM;
	float PrecioA;
	float PrecioE;
	
	protected JTextField Cmotor;
	protected JTextField Cexte;
	protected JTextField Cac;

	public Nissan() {
		setTitle("Nissan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 575, 439);
		contentPane = new Fondo("fondo 4.png");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModelo = new JLabel("Model");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModelo.setBounds(260, 24, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblA = new JLabel("Year");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblA.setBounds(266, 92, 40, 14);
		contentPane.add(lblA);
		
		JLabel lblSeleccioneLaPieza = new JLabel("Motor Parts");
		lblSeleccioneLaPieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccioneLaPieza.setBounds(24, 191, 110, 14);
		contentPane.add(lblSeleccioneLaPieza);
		
		JComboBox Cb_Motor = new JComboBox();
		Cb_Motor.setModel(new DefaultComboBoxModel(new String[] {"", "Air Filter", "Carburetor", "Distributor", "Petrol pump", "Ignition", "Oil Filter", "Oil Pump", "Valve Spring"}));
		Cb_Motor.setBounds(153, 188, 186, 20);
		contentPane.add(Cb_Motor);
		
		JComboBox cbBoxModelo = new JComboBox();
		cbBoxModelo.setModel(new DefaultComboBoxModel(new String[] {"", "Sentra", "370z", "Altima", "Armada", "Cabstar"}));
		cbBoxModelo.setBounds(234, 49, 93, 20);
		contentPane.add(cbBoxModelo);
		
		JComboBox cbBoxano = new JComboBox();
		cbBoxano.setModel(new DefaultComboBoxModel(new String[] {"", "1997", "2001", "2002", "2003", "2004", "2006"}));
		cbBoxano.setBounds(234, 116, 93, 20);
		contentPane.add(cbBoxano);
		
		JComboBox Cb_Exte = new JComboBox();
		Cb_Exte.setModel(new DefaultComboBoxModel(new String[] {"", "Bumper", "Fenders", "Hood", "Roof Rack", "Handle", "Side Skirt", "Spoiler", "Grilles"}));
		Cb_Exte.setBounds(153, 240, 186, 20);
		contentPane.add(Cb_Exte);
		
		JComboBox Cb_Ac = new JComboBox();
		Cb_Ac.setModel(new DefaultComboBoxModel(new String[] {"", "Radio", "Vent Visors", "GPS", "Led Lights", "Car Sun Shade", "Mat", "Speakers", "Remote Control Key"}));
		Cb_Ac.setToolTipText("");
		Cb_Ac.setBounds(153, 296, 186, 20);
		contentPane.add(Cb_Ac);
		
		Cexte = new JTextField();
		Cexte.setText("1");
		Cexte.setColumns(10);
		Cexte.setBackground(Color.LIGHT_GRAY);
		Cexte.setBounds(453, 240, 40, 20);
		contentPane.add(Cexte);
		
		
		Cac = new JTextField();
		Cac.setText("1");
		Cac.setColumns(10);
		Cac.setBackground(Color.LIGHT_GRAY);
		Cac.setBounds(453, 299, 40, 20);
		contentPane.add(Cac);
		
		Cmotor = new JTextField();
		Cmotor.setText("1");
		Cmotor.setBackground(Color.LIGHT_GRAY);
		Cmotor.setBounds(453, 188, 40, 20);
		contentPane.add(Cmotor);
		Cmotor.setColumns(10);
		
		JButton btnEnterButton = new JButton("Enter");
		btnEnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				Motor = Cb_Motor.getSelectedItem().toString();
				Acc = Cb_Ac.getSelectedItem().toString();
				Ext = Cb_Exte.getSelectedItem().toString();
				Modelo = cbBoxModelo.getSelectedItem().toString();
				Ano = cbBoxano.getSelectedItem().toString();
				cantidadM = Cmotor.getText();
				cantidadA = Cac.getText();
				cantidadE = Cexte.getText();
				
				cantidadPm = Integer.parseInt(cantidadM);
				cantidadPa = Integer.parseInt(cantidadA);
				cantidadPe = Integer.parseInt(cantidadE);
				
				if(cantidadPm > 35 || cantidadPa > 35 || cantidadPe > 35)
				{
					JOptionPane.showMessageDialog(null, "You have exceeded the amoun availble!");
				}


				dispose();
			}
		});
		btnEnterButton.setBounds(478, 374, 71, 23);
		contentPane.add(btnEnterButton);
		
		JLabel lblCantidad = new JLabel("Amount");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad.setBounds(377, 191, 77, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblExteriores = new JLabel("Exteriors");
		lblExteriores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExteriores.setBounds(24, 243, 110, 14);
		contentPane.add(lblExteriores);
		
		JLabel lblAccesorios = new JLabel("Accessories");
		lblAccesorios.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAccesorios.setBounds(24, 299, 110, 14);
		contentPane.add(lblAccesorios);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAmount.setBounds(377, 243, 77, 14);
		contentPane.add(lblAmount);
		
		JLabel lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAmount_1.setBounds(377, 299, 77, 14);
		contentPane.add(lblAmount_1);
		
	}
	public String motorReci()
	{
		String Mc = "Nissan " + " " + Modelo + " " + Ano + "\n"; 
		
		if(Motor == "Air Filter")
		{
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM = (float) (23.47 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $23.47 " + precio;
			
		}
		else if(Motor == "Carburetor") {
			
			String motor = Motor + " " +cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM = (float) (55.78 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $55.78 " + precio;
		}
		else if(Motor == "Distributor") {
			
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (88.99 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $88.99 " + precio;
		}
		else if(Motor == "Petrol pump") {
			
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (94.07 * cantidad);
			
			String precio = "\n "+ "$" + Float.toString(PrecioM)+"\n";
			
			return Mc + motor + " $94.07 " + precio;
		}
		else if(Motor == "Ignition") {
			
			String motor = Motor + " " +cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (73.24 * cantidad);
			
			String precio = "\n " +"$"+ Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $73.24" + precio;
		}
		else if(Motor == "Oil Filter") {
			
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (88.90 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioM)+"\n";
			
			return Mc + motor + " $88.90 "+ precio;
		}
		else if(Motor == "Oil Pump") {
			
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (79.40 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $79.40" + precio;
		}
		else if(Motor == "Valve Spring") {
			
			String motor = Motor + " " + cantidadM;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioM =  (float) (77.90 * cantidad);
			
			String precio = "\n " + "$" +Float.toString(PrecioM) + "\n";
			
			return Mc + motor + " $77.90 " + precio;
		}	
		else {
			return " ";
		}
	}
	public String accReci() {
		String Mc = "Mitsubitshi " + " " + Modelo + " " + Ano + "\n"; 
		
		if(Acc == "Radio")
		{
			String motor = Acc + " " + cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA = (float) (92.45 * cantidad);
			
			String precio = "\n " + "$" +Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $92.45 " + precio;
			
		}
		else if(Acc == "Vent Visors") {
			
			String motor = Acc + " " +cantidadA;
			
			int cantidad = Integer.parseInt(cantidadM);
			
			PrecioA = (float) (22.89 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $22.89 "+ precio;
		}
		else if(Acc == "GPS") {
			
			String motor = Acc + " " + cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (119.29 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $119.29 " + precio;
		}
		else if(Acc == "Led Lights") {
			
			String motor = Acc + " " + cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (94.07 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $94.07" +precio;
		}
		else if(Acc == "Car Sun Shade") {
			
			String motor = Acc + " " +cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (73.24 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $73.24 " + precio;
		}
		else if(Acc == "Mat") {
			
			String motor = Acc + " " + cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (12.98 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $12.98 " + precio;
		}
		else if(Acc == "Speakers") {
			
			String motor = Acc + " " + cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (134.67 * cantidad);
			
			String precio = "\n "+ "$" + Float.toString(PrecioA) + "\n";
			
			return Mc + motor + " $134.67 " + precio;
		}
		else if(Acc == "Remote Control Key") {
			
			String motor = Acc + " "+ cantidadA;
			
			int cantidad = Integer.parseInt(cantidadA);
			
			PrecioA =  (float) (15.99 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioA)+ "\n";
			
			return Mc + motor + " $15.99"+ precio;
		}	
		else {
			return " ";
		}
	}
	
	public String exteReci() {
		String Mc = "Mitsubitshi " + " " + Modelo + " " + Ano + "\n"; 
		
		if(Ext == "Bumper")
		{
			String motor = Ext + " "+ cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE = (float) (220.15 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioE)+ "\n";
			
			return Mc + motor + " $220.15" + precio;
			
		}
		else if(Ext == "Fenders") {
			
			String motor = Ext + " " +cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE = (float) (31.12 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $31.12 "+ precio;
		}
		else if(Ext == "Hood") {
			
			String motor = Ext + " " + cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (114.49 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $114.49 " + precio;
		}
		else if(Ext == "Roof Rack") {
			
			String motor = Ext + " " + cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (40.99 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $40.99 " + precio;
		}
		else if(Ext == "Handle") {
			
			String motor = Ext + " " +cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (13.76 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $13.76 "+ precio;
		}
		else if(Ext == "Side Skirt") {
			
			String motor = Ext + " " + cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (45.98 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $45.98 " + precio;
		}
		else if(Ext == "Spoiler") {
			
			String motor = Ext + " " + cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (93.44 * cantidad);
			
			String precio = "\n " + "$"+ Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $93.44 "+ precio;
		}
		else if(Ext == "Grilles") {
			
			String motor = Ext + " " + cantidadE;
			
			int cantidad = Integer.parseInt(cantidadE);
			
			PrecioE =  (float) (55.90 * cantidad);
			
			String precio = "\n " + "$" + Float.toString(PrecioE) + "\n";
			
			return Mc + motor + " $55.90 " + precio;
		}	
		else {
			return " ";
		}
	}
		public static final double total()
		{	
			double Precio_motor = 0;
			double Precio_Acc = 0;
			double Precio_Ext = 0;
			
			if(Motor == "Air Filter")
			{	
				Precio_motor = 23.47 * cantidadPm;
				
				
			}
			else if(Motor == "Carburetor") {
				
				Precio_motor = 55.78 * cantidadPm;
				
			}
			else if(Motor == "Distributor") {
				
				Precio_motor =  88.99 * cantidadPm;
				
			}
			else if(Motor == "Petrol pump") {
						
				Precio_motor =  94.07 * cantidadPm;
			
			}
			else if(Motor == "Ignition") {
				
				Precio_motor = 73.24 * cantidadPm;
				
			}
			else if(Motor == "Oil Filter") {
				
				Precio_motor =  88.90 * cantidadPm;
				
			}
			else if(Motor == "Oil Pump") {
				
				Precio_motor =  79.40 * cantidadPm;
				
			}
			else if(Motor == "Valve Spring") {
				
				Precio_motor = 77.90 * cantidadPm;
			}	
			else 
			{
				
			}
		
			if(Acc == "Radio")
			{
				Precio_Acc = 92.45 * cantidadPa;
				
			}
			else if(Acc == "Vent Visors") {
				
				Precio_Acc = 22.89 * cantidadPa;
				
			}
			else if(Acc == "GPS") {
				
				Precio_Acc =  119.29 * cantidadPa;
				
			}
			else if(Acc == "Led Lights") {
				
				Precio_Acc =  94.07 * cantidadPa;
				
			}
			else if(Acc == "Car Sun Shade") {
				
				Precio_Acc =  73.24 * cantidadPa;
				
			}
			else if(Acc == "Mat") {
				
				Precio_Acc =  12.98 * cantidadPa;
				
			}
			else if(Acc == "Speakers") {
								
				Precio_Acc =  134.67 * cantidadPa;
				
			}
			else if(Acc == "Remote Control Key") {
				
				Precio_Acc =  15.99 * cantidadPa;
				
			}	
			else 
			{
				
			}
			
			if(Ext == "Bumper")
			{
				
				Precio_Ext = 220.15 * cantidadPe;
				
			}
			else if(Ext == "Fenders") {
				
				Precio_Ext = 31.12 * cantidadPe;
				
			}
			else if(Ext == "Hood") {
				
				Precio_Ext =  114.49 * cantidadPe;
				
			}
			else if(Ext == "Roof Rack") {
				
				Precio_Ext =  40.99 * cantidadPe;
				
			}
			else if(Ext == "Handle") {
				
				Precio_Ext =  13.76 * cantidadPe;
				
			}
			else if(Ext == "Side Skirt") {
				
				Precio_Ext =  45.98 * cantidadPe;
			
			}
			else if(Ext == "Spoiler") {
				
				Precio_Ext =  93.44 * cantidadPe;
				
			}
			else if(Ext == "Grilles") {
				
				Precio_Ext =  55.90 * cantidadPe;
			
			}	
			else 
			{
				
			}
			 
			double total = Precio_motor + Precio_Acc + Precio_Ext;
			
			return total;	
				
		}
}
