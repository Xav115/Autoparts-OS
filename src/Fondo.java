import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel 
{
     ImageIcon imagen;
     
	public Fondo(String nombre) 
	{
		super();
      imagen = new ImageIcon(getClass().getResource(nombre));
      setSize(341, 55);
	}
    protected void paintComponent(Graphics g)
    {
    	Dimension d = getSize();
    	g.drawImage(imagen.getImage(),0,0, d.width, d.height, null);
    	this.setOpaque(false);
    	super.paintComponent(g);
    }
}
