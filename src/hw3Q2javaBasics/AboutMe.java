package hw3Q2javaBasics;

public class AboutMe {

	public String myInfo;
	// here variable is declared

	public String name = "Taufiq Mazumder";
	// here variable is initialized

	public byte myAge = 30;
	public short houseRent = 2500;
	public int mySalary = 10000000;
	public long myBankBalance = 20000000;
	public float myHeight = 5.4f;
	public double myGrade = 3.67893;
	public char mySex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name: " + aboutMe.name);
		System.out.println("My Age: " + aboutMe.myAge);
		System.out.println("My House Rent: " + aboutMe.houseRent);
		System.out.println("My Salary: " + aboutMe.mySalary);
		System.out.println("My Bank Balance: " + aboutMe.myBankBalance);
		System.out.println("My Height: " + aboutMe.myHeight);
		System.out.println("My Grade: " + aboutMe.myGrade);
		System.out.println("My Sex: " + aboutMe.mySex);
		System.out.println("U S citizen: " + aboutMe.usCitizen);

	}
}
