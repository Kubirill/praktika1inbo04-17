package prac1;

public class Book {
     private String avthor="";
     private String title="";
     private int pagecount=1;
     public Book(String name,String firsttitle) {
    	 avthor=name;
    	 title=firsttitle;
     }
     public void getbook() {
    	 System.out.print(title+ " written by " + avthor + " and have " + pagecount + " pages.");
     }
     public void changetitle(String newtitle) {
    	 title=newtitle;
     }
     public void addpage(int count) {
    	 pagecount=pagecount+count;
     }
     public void subtuctpage(int count) {
    	 pagecount=pagecount-count;
     }
}
