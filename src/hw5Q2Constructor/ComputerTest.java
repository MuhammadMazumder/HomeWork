package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.brandName = "Apple";
		computer.modelName = "MacBook Air";
		computer.operatingSystem = "MacOs Mojava";
		computer.price = 800;
		computer.grade = 'A';
		computer.madeInUsa = false;

		Computer computerWindows = new Computer();

		computerWindows.brandName = "Lenovo";
		computerWindows.modelName = "ThinkPad E15";
		computerWindows.price = 550;
		computerWindows.grade = 'A';
		computerWindows.madeInUsa = false;

		System.out.println("My brand name: " + computer.brandName);
		System.out.println("My model name: " + computer.modelName);
		System.out.println("My operating system: " + computer.operatingSystem);
		System.out.println("My price: " + computer.price);
		System.out.println("My grade: " + computer.grade);
		System.out.println("Made in USA: " + computer.madeInUsa);

		System.out.println("<------------------------------------------------------------->");

		System.out.println("My laptop Name: " + computerWindows.brandName);
		System.out.println("My laptop Model: " + computerWindows.modelName);
		System.out.println("My laptop Price: " + computerWindows.price);
		System.out.println("My laptop Grade: " + computerWindows.grade);
		System.out.println("Made in USA: " + computerWindows.madeInUsa);

	}

}