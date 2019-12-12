
import javax.swing.JOptionPane;

public class Prediction {
	
	private int days = 5;
	
	public void needResupply(int amount){
		if(amount == 0)
		{
			JOptionPane.showMessageDialog(null, "");
			
		
		}else if(((35 - amount)/days) < this.days && amount < 36){
			JOptionPane.showMessageDialog(null, "You need to contact your supplier inmediately");
		}
	}
	
	public void needResupply(int amount, int myDays){
		
		if(amount == 0){
			//
		}else if(((35-amount)/3) < myDays){
			JOptionPane.showMessageDialog(null, "You need to contact your supplier inmediately for the next: " + myDays);
		}
	}
}
