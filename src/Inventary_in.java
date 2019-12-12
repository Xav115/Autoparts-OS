import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Inventary_in extends JFrame {

	Mitsubitshi m = new Mitsubitshi();
	Mitsubitshi_Data myMitsubitshi = new Mitsubitshi_Data();
	
	Nissan n = new Nissan();
	Nissan_Data myNissan = new Nissan_Data();
	
	Suzuki s = new Suzuki();
	Suzuki_Data mySuzuki = new Suzuki_Data();
	
	Toyota t = new Toyota();
	Toyota_Data myToyota = new Toyota_Data();
	
	Mazda z = new Mazda();
	Mazda_Data myMazda = new Mazda_Data();
	
	
	private JPanel contentPane;
	
	public void setMitsubishiData(Mitsubitshi_Data mitsubishiData)
	{
		this.myMitsubitshi = mitsubishiData;		
	}
	
	public Mitsubitshi_Data getMitsubishiData()
	{
		return this.myMitsubitshi;
	}
	
	public void setMazdaData(Mazda_Data mazdaData)
	{
		this.myMazda = mazdaData;		
	}
	
	public Mazda_Data getMazdaData()
	{
		return this.myMazda;
	}
	
	public void setSuzukiData(Suzuki_Data suzukiData)
	{
		this.mySuzuki = suzukiData;		
	}
	
	public Suzuki_Data getSuzukiData()
	{
		return this.mySuzuki;
	}
	
	public void setToyotaData(Toyota_Data toyotaData)
	{
		this.myToyota = toyotaData;		
	}
	
	public Toyota_Data getToyotaData()
	{
		return this.myToyota;
	}
	
	public void setNissanData(Nissan_Data nissanData)
	{
		this.myNissan = nissanData;		
	}
	
	public Nissan_Data getNissanData()
	{
		return this.myNissan;
	}
	
	
	public Inventary_in() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1319, 268);
		contentPane = new Fondo("fondo 5.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(27, 88, 1248, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea mi = new JTextArea();
		mi.setEditable(false);
		mi.setBounds(10, 11, 236, 54);
		panel.add(mi);
		
		JTextArea ma = new JTextArea();
		ma.setEditable(false);
		ma.setBounds(256, 11, 236, 54);
		panel.add(ma);
		
		JTextArea su = new JTextArea();
		su.setEditable(false);
		su.setBounds(502, 11, 236, 54);
		panel.add(su);
		
		JTextArea to = new JTextArea();
		to.setEditable(false);
		to.setBounds(748, 11, 236, 54);
		panel.add(to);
		
		JTextArea ni = new JTextArea();
		ni.setEditable(false);
		ni.setBounds(994, 11, 236, 54);
		panel.add(ni);
		
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				mi.setText(m.Motor + " " + myMitsubitshi.SubstractMotorM(m.Motor,m.cantidadPm) + "\n"
				+ m.Acc + " " + myMitsubitshi.SubstractMotorA(m.Acc,m.cantidadPa) + "\n"
				+ m.Ext + " " + myMitsubitshi.SubstractMotorE(m.Ext,m.cantidadPe));
				
				ma.setText(z.Motor + " " + myMazda.SubstractMotorM(z.Motor,z.cantidadPm) + "\n"
						+ z.Acc + " " + myMazda.SubstractMotorA(z.Acc,z.cantidadPa) + "\n"
						+ z.Ext + " " + myMazda.SubstractMotorE(z.Ext,z.cantidadPe)); 
						
				
				su.setText(s.Motor + " " + mySuzuki.SubstractMotorM(s.Motor,s.cantidadPm) + "\n"
						+ s.Acc + " " + mySuzuki.SubstractMotorA(s.Acc,s.cantidadPa) + "\n"
						+ s.Ext + " " + myMitsubitshi.SubstractMotorE(s.Ext,s.cantidadPe));
				
				ni.setText(n.Motor + " " + myNissan.SubstractMotorM(n.Motor,n.cantidadPm) + "\n"
						+ n.Ext + " " + myNissan.SubstractMotorA(n.Acc,n.cantidadPa) + "\n"
						+n.Acc + " " + myNissan.SubstractMotorE(n.Ext,n.cantidadPe));
				
				to.setText(t.Motor + " " + myToyota.SubstractMotorM(t.Motor,t.cantidadPm) + "\n"
						+ t.Ext + " " + myToyota.SubstractMotorA(t.Acc,t.cantidadPa) + "\n"
					+ t.Acc + " " + myToyota.SubstractMotorE(t.Ext,t.cantidadPe));
			}
		});
		btnRefresh.setBounds(10, 11, 89, 23);
		contentPane.add(btnRefresh);
		
		JLabel lblMitsubitshi = new JLabel("Mitsubitshi");
		lblMitsubitshi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblMitsubitshi.setForeground(Color.RED);
		lblMitsubitshi.setBounds(94, 58, 113, 19);
		contentPane.add(lblMitsubitshi);
		
		JLabel lblMazda = new JLabel("Mazda");
		lblMazda.setForeground(Color.RED);
		lblMazda.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblMazda.setBounds(361, 59, 75, 19);
		contentPane.add(lblMazda);
		
		JLabel lblSuzuki = new JLabel("Suzuki");
		lblSuzuki.setForeground(Color.RED);
		lblSuzuki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSuzuki.setBounds(603, 58, 75, 19);
		contentPane.add(lblSuzuki);
		
		JLabel lblToyota = new JLabel("Toyota");
		lblToyota.setForeground(Color.RED);
		lblToyota.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblToyota.setBounds(855, 58, 75, 19);
		contentPane.add(lblToyota);
		
		JLabel lblNissan = new JLabel("Nissan");
		lblNissan.setForeground(Color.RED);
		lblNissan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNissan.setBounds(1107, 58, 75, 19);
		contentPane.add(lblNissan);
	}
}
