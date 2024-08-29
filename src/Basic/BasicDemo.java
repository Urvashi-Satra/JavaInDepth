package Basic;
/*
  just to summarize, an identifier will have the following rules:

+ It can include letters (a-z, A-Z), digits (0-9), the underscore character (_), and the dollar sign ($).

+ It cannot begin with a digit. Subsequent characters can include a digit.

+ It cannot be a reserved keyword in Java (e.g., class, interface, public, static, etc.).

+ It cannot be null, true, false

+ Identifiers are case-sensitive (MyClass and myclass would be considered different).
 */
public class BasicDemo {
	
//1.Naming rules for classes/methods/variables
	//a) first character : letter , underscore ,$
	//Remaining:letter,underscore,$,numbers
	//b) No reserved keywords
	
	int $id1,_id2,id3,id=0;
	
	//2. Java is case-sensitive
	int id1,Id,ID=0;
	void foo() {
	}
	void Foo() {}
	
	//3.Printing to console.
	static void print() {
	System.out.println("Printing to console");
	}
	
	
	public static void main(String[] args) {
		print();

	}

}
