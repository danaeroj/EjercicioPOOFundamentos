import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	Student n1 = new Student ("Laura", "Rojas", 1234, 80, 1);
	Student n2 = new Student ("Oscar", "hernandez", 1256, 76, 1);
	Student n3 = new Student ("Graciela", "Orta", 1345, 90, 1);
	
	Courses curso1 = new Courses();
	curso1.courseName="Biología";
	curso1.professorName="Dr. Becker";
	curso1.year =2025;
	
	curso1.enroll(n1);
	curso1.enroll(n2);
	
	n1.printFullName();
	n2.printFullName();
	
	n1.isApproved();
	n2.isApproved();
	
	n1.changeYearIfApproved();
	n2.changeYearIfApproved();
	
	
	System.out.println("Estudiantes inscritos: "+ curso1.countStudents());
	System.out.println("Mejor calificación: "+ curso1.bestGrade());
	
	Student[] studentsArray = new Student[3];
	studentsArray[0]=n1;
	studentsArray[1]=n2;
	studentsArray[2]=n3;
	
	Courses curso2 = new Courses();
	curso2.courseName="Computo";
	curso2.professorName="Dr. Chapatin";
	curso2.year =2025;
	
	curso2.enroll(studentsArray);
	
	System.out.println("Estudiantes inscritos: "+ curso2.countStudents());
	System.out.println("Mejor calificación: "+ curso2.bestGrade());

	}//main

}//ClassMain
