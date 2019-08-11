package week1.day3.assignment3;

public class MainProgram {

	public static void main(String[] args) {
		Daddy dad = new Daddy("Bob");
		Baby kid = new Baby("Timmy", 2);
		dad = kid;
		System.out.println(dad.name + " is " + kid.name + "'s own daddy!");
	}

}
