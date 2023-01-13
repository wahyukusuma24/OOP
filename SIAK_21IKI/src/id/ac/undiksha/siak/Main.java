package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {//we can't an object

	public static void main(String[] args) { //static = we don't need an object to make a class
		// TODO Auto-generated method stub
		
		Student std1 = new Student();
		std1.setNim ("2115101035"); 
		std1.setName ("Norman F. Alano"); 
		std1.setAddress("Philipino");
		std1.setGender(false);
		std1.setStudyProgram("Computer Science");
		std1.setDepartment("MMSU");
		std1.setFaculty("MMSU");
		
		Student std2 = new Student ("2115101036", "Sin Sun Sang", "Taiwan", false, "Computer Science", "MCUT", "MCUT");
		Lecturer lecturer2 = new Lecturer("2115101037", "Kadek", "Singaraja", true, "CS", "Informatics",
				"Vocational and Engineering ");
		Staff staff2 = new Staff("2115101037", "Adi", "Singaraja", true, "UPT TIK");
		
		std2.printAllInfo();
		staff2.printAllInfo();
		std1.printAllInfo();
	}

}

