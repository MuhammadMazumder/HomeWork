package hw4Q2JavaVariables;

public class AboutMe {
//	variable declared
	public String myInfo;
	public String name;
	public byte age;
	public short mortgage;
	public int income;
	public long bankBalance;
	public float height;
	public double grade;
	public char sex;
	public boolean usCitizen;

//	constructor declared
	public AboutMe() {
//	constructor initialized
		System.out.println("This is all about me");
	}

//	method implemented
	public void aboutMe() {
//		method initialized
		System.out.println("My name: " + name + "\nMy age: " + age + "\nMy mortgage: " + mortgage + "\nMy income: "
				+ income + "\nMy bank balance: " + bankBalance + "\nMy height: " + height + "\nMy grade: " + grade
				+ "\nMy sex: " + sex + "\nUS Citizen: " + usCitizen);
	}

}
