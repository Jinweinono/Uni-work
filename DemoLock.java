package pracs;
import java.util.Scanner;

public class DemoLock {
	private int Password;
	public static void main(String[] args) {
		DemoLock object =  new DemoLock();
		System.out.println("ONLY THREE DIGITS");
		System.out.println("If frist time user enter 1, change password enter 2,");
		System.out.println("to open your lock enter 3, stop using enter 4.");
		while (true) {
			Scanner ss = new Scanner(System.in);
			int options = ss.nextInt();
			if(options == 1) {
				object.setPassWord();
				System.out.println("Password has been set.");
			}
			else {
				switch (options) {
				case 2:
					object.ChangePassWord();
					break;
				case 3:
					object.OpenTheLock();
					break;
				case 4:				
					break;
				}
			}
		}
		
		
	}
	public DemoLock() {
		Password = 0;
	}
	public void setPassWord() {
		System.out.println("Setting the new password.");
		Scanner S1 = new Scanner(System.in);
		int npw = S1.nextInt();
		Password = npw;
		S1.close();
		
	}
	public void ChangePassWord() {		
		System.out.println("Please enter the old password.");
		Scanner s2 = new Scanner(System.in);
		int oldpw = s2.nextInt();	
		if(Password == oldpw) {
			System.out.println("Please enter the new password.");
			Scanner S3 = new Scanner(System.in);
			int newpw = S3.nextInt();
			Password = newpw;
			System.out.println("Password has been changed.");
			S3.close();
		}
		else {
			System.out.println("Error: wrong password.");
		}	
		s2.close();
	}
	public void OpenTheLock() {
		System.out.println("Please the password.");
		Scanner s4 = new Scanner(System.in);
		int tmp = s4.nextInt();
		if(tmp == Password) {
			System.out.println("Password Correct.");
			System.out.println("Lock OPEN");
		}
		else {
			System.out.println("INCORRECT PASSWORD!");
		}
	}

}
