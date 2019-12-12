import javax.swing.JOptionPane;

public class OptionBye extends Goodbye
{
	public OptionBye()
	{
		JOptionPane.showMessageDialog(null, super.bye);
	}

}
