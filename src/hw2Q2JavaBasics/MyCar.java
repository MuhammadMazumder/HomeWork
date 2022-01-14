package hw2Q2JavaBasics;

/*
 * 2) Create a package name "hw2Q2JavaBasics"[create it by the help of header, not by right click of src file] inside the Homework project created before. Create a Class "MyCar" from the header (not by right click of package, this is the other way to create class). Under main method the first outcome will be: [My name is <your name>, I love to drive, My car info is below:]. Use String concatenation feature from above outcome[10]. Now use other syso to print your car each info (color, model, year, wheel drive [example:4WD] etc.[you can add more if you want]) in a separate line [try to follow how to copy and paste a line in IDE by key board command]. Use print instead of println for the car feature when print[20], use \n and \t at least once anywhere in the class[10]. organize code at the end [10], After completing the code, paste it below
 */
public class MyCar {
	public static void main(String[] args) {
		System.out.print("My name is Muhammad Taufiq Mazumder," + "\nI Love to drive," + "\nMy car info is bellow");
		System.out.print("\n\tCar: Ford escape\n");
		System.out.print("\tColor: Green\n");
		System.out.print("\tModel: 2015 SE\n");
		System.out.print("\tWheel drive: FWD");
	}

}
