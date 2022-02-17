package hw5Q3Constructor;

public class StudentTest {
	public static void main(String[] args) {

		Student student = new Student();
		student.stName = "Muhammad Taufiq Mazumder";
		student.stId = 1205;
		student.stSex = 'M';
		student.stGrade = 3.97f;
		student.isProgrammer = true;

		System.out.println("Student Name: " + student.stName + ". ID: " + student.stId + ". Sex: " + student.stSex
				+ ". Grade: " + student.stGrade + ". IS Programmer: " + student.isProgrammer);
	}

}
