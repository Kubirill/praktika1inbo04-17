package p6;

public class Student {
  private String name="";
  private int idstudent=0;
  public Student (String fname, int ids) {
	  name=fname;
	  idstudent=ids;
  }
  public int get_idstudent() {
	  return idstudent;
  }
  public String get_name() {
	  return name;
  }
}
