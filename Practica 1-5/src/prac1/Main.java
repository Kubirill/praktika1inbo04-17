package prac1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print ("What your name?");
		String name="";
		name=in.nextLine();
		System.out.print ("What books first title?");
		String title="";
		title=in.nextLine();
		Book firstbook= new Book(name,title);
		System.out.print ("How many page you wrote?");
		int page=0;
		page = in.nextInt();
		firstbook.addpage(page);
		System.out.print ("How many page you trash?");
		page = in.nextInt();
		firstbook.subtuctpage(page); 
		System.out.println ("What books finish title?");
		title=in.nextLine();
		title=in.nextLine();
		firstbook.changetitle(title);
		firstbook.getbook();
		in.close();
	}

}
