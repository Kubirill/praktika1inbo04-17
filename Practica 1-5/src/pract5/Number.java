package pract5;

public class Number {
  public static void flip(int n) {
	  if (n%10==n ) {
		  System.out.println(n); 
	  }
	  else {
		  System.out.println(n%10);
		  flip(n/10);
	  }
  }
  public static void main (String[] args) {
	  final  int s=3; //����� ��� ��������
	  flip(s);
  }
}
