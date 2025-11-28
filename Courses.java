import java.util.ArrayList;

public class Courses {
   String courseName;
   String professorName;
   int year;
   ArrayList<Student> students = new ArrayList <Student>();
   
   public void enroll(Student student){
	   students.add(student);
   }//enroll

	   public void unEnroll(Student student){
	       students.remove(student);
	   }//unEnroll

	   public int countStudents(){
	       
	       return students.size();
	   }//countStudents
	   
	   public int bestGrade(){
		   int n= 0;
	     for (Student grd : students) {
			if(grd.grade> n) {
				n=grd.grade;
			}
		}
	       return n;
	   }//bestGrade
	   
    public void enroll(Student[] studentsArray){
		      for (Student student : studentsArray) {
		    	  students.add(student);
			}
	 }   
}//classCourses
