package hw4Q2JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
//		variable initialized
		aboutMe.name = "Taufiq Mazumder";
		aboutMe.age = 40;
		aboutMe.mortgage = 2500;
		aboutMe.income = 100000;
		aboutMe.bankBalance = 200000;
		aboutMe.height = 5.6f;
		aboutMe.grade = 3.67893;
		aboutMe.sex = 'M';
		aboutMe.usCitizen = true;

		AboutMe aboutAlex = new AboutMe();
		aboutAlex.name = "Alex";
		aboutAlex.age = 45;
		aboutAlex.mortgage = 2000;
		aboutAlex.income = 150000;
		aboutAlex.bankBalance = 250000;
		aboutAlex.height = 5.6f;
		aboutAlex.grade = 3.67893;
		aboutAlex.sex = 'M';
		aboutAlex.usCitizen = false;

		System.out.println("My name: " + aboutMe.name);
		System.out.println("My age: " + aboutMe.age);
		System.out.println("My mortgage: " + aboutMe.mortgage);
		System.out.println("My income: " + aboutMe.income);
		System.out.println("My bank balance:" + aboutMe.bankBalance);
		System.out.println("My height: " + aboutMe.height);
		System.out.println("My grade: " + aboutMe.grade);
		System.out.println("My sex: " + aboutMe.sex);
		System.out.println("US Citizen: " + aboutMe.usCitizen);
		System.out.println("<------------------------------------------------->");
		System.out.println("\nMy best friend name: " + aboutAlex.name);
		System.out.println("Age: " + aboutAlex.age);
		System.out.println("Mortgage: " + aboutAlex.mortgage);
		System.out.println("Income: " + aboutAlex.income);
		System.out.println("Bank balance: " + aboutAlex.bankBalance);
		System.out.println("Height: " + aboutAlex.height);
		System.out.println("Grade: " + aboutAlex.grade);
		System.out.println("Sex: " + aboutAlex.sex);
		System.out.println("US Citizen: " + aboutAlex.usCitizen);
	}

}
