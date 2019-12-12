public class Login_Data 
{	
	public String username = "";
	private String password = "";
	
	public boolean testPassword() 
	{
		username = Login.User.getText();
		password = Login.Password.getText();
		
		if(username.equals("Xav1_15") && password.equals("4319") || username.equals("Edwin123") && password.equals("2303")) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
