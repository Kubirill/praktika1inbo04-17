package p6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Student[] univ= new Student[5];
		String text="";
		int num=0;
        for (int i=0;i<5;i++) {
        	System.out.println("Enter the name ");
        	text=in.nextLine();
        	System.out.println("Enter the Id " + text + " ");
        	num = in.nextInt();
        	univ[i]=new Student(text,num*100+i);
        	text=in.nextLine();
        }
        SortingStudentsByGPA m= new SortingStudentsByGPA();
        univ=m.don(univ);
        for (int i=0;i<5;i++) {
        	System.out.println(univ[i].get_name());
        }
        in.close();
	}

}
