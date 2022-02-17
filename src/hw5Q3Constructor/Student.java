package hw5Q3Constructor;

public class Student {
//	variable declare
	public String stName;
	public int stId;
	public char stSex;
	public float stGrade;
	public boolean isProgrammer;

//	default constructor declare
	public Student() {
		System.out.println("this is from default constructor of student class");
	}

// parameterized constructor declare
	public Student(String stName, int stId, char stSex, float stGrade, boolean isProgrammer) {
		this.stName = stName;
		this.stId = stId;
		this.stSex = stSex;
		this.stGrade = stGrade;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name: " + stName + "ID: " + stId + "Sex: " + stSex + "Grade: " + stGrade
				+ "Is Programmer: " + isProgrammer);
	}

}
