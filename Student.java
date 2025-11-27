
public class Student {
  String firstName;
  String lastName;
  int registration;
  int grade;
  int year;
  
  public Student (String firstName, String lastName, int registration, int grade, int year) {
	  
  }//Constructor 1
  
  public Student (int registration, int grade, int year) {
	  
  }//Constructor 2
  
  public Student(int registration) {
	  
  }//Constructor 3
  
  public void printFullName(){
      System.out.println(firstName + lastName);
   }//PrintFullName

   public boolean isApproved(){
	 return grade >=60;
     
   }//isAproved

   public int changeYearIfApproved(){
	   if (isApproved()) {
		   year = year +1;
		   System.out.println("Congratulations");
	   }//if
       
       return year;
   }//ChangeYear
}// class Student
