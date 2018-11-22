package p2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String name="";
		String email="";
		String text="";
		char gender=' ';
		System.out.println("Enter the name ");
    	name=in.nextLine();
    	System.out.println("Enter the email ");
    	email=in.nextLine();
    	
    	
    	do  {
    		System.out.println("Enter the gender (M,F or U)");
    		text=in.nextLine();
    		if ((text.charAt(0)=='M')||(text.charAt(0)=='U')||(text.charAt(0)=='F')) {
    			gender=text.charAt(0);
    		}
    	}
    	while ((text.charAt(0)!='M')&(text.charAt(0)!='U')&(text.charAt(0)!='F'));
    	Author human = new Author (name,email,gender);
    	System.out.println( human.ToString());
    	in.close();
	}
		

}
