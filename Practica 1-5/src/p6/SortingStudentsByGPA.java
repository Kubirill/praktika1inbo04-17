package p6;

public class SortingStudentsByGPA {
 public Student[] don(Student[] a) {
	 for (int y=0; y<4;y++) {
		for (int x=0;x<4-y;x++) {
			if (a[x].get_idstudent()>a[x+1].get_idstudent()) {
				Student z = a[x+1];
				a[x+1]=a[x];
				a[x]=z;
			}
		}
	 }
	 return a;
 }
}
