package id.ac.undiksha.siak.entities;

public class Student extends Person{

	private String nim;
	private String name;
	private String address;
	private boolean gender; //0 is female and 1 is male
	private String studyProgram;
	private String department;
	private String faculty;
	
	public Student() {
		this.nim			= "<valid nim>";
		this.name			= "<valid name>";
		this.address		= "<valid address>";
//		this.gender			= "<valid gender>";
		this.studyProgram	= "<valid study program>";
		this.department		= "<valid department>";
		this.faculty		= "<valid faculty>";
	}
	
	public Student(String nim, String name, String address, boolean gender, String studyProgram, String department,
			String faculty) {
		super();
		this.nim = nim;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}

	public void printAllInfo() {
		System.out.println("NIM : " + this.nim);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println("Gender : " + (gender ? "Male" : "Female"));
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Department : " + this.department);
		System.out.println("Faculty : " + this.faculty);
		
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getName () {
		return this.name;
	}
}
