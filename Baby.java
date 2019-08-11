package week1.day3.assignment3;

/**
 * Class to demonstrate constructor chaining from base class, or same class
 * @author Mark
 *
 */
public class Baby extends Daddy {
	int age;
	public Baby (String name) {
		super(name);	// constructor chaining from base class
		System.out.println("It's a mystery when this baby was born");
	}
	
	public Baby (String name, int age) {
		this(name);		// constructor chaining within same class
		this.age = age;
		System.out.println("A new baby and we know how old it is");
	}
}
