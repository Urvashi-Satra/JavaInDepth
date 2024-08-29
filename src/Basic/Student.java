package Basic;
/*
 * Instance & Static:
 * -Declared at class - level
 * -Scope: Entire class
 * -Gets defaukt value
 * -Cannot be re-initialized directly within class
 * 
 * Instance : Represents object state
 * 
 * -Values are unique to object
 * -From outside class:Accessible via object reference
 * 
 * static:
 * 
 * -Values are unique to class~ one copy per class(shared across objects)
 * -From outside class: Accessible via class Name or object reference
 * 
 * Instance & static variables are also referred to as fields or attributes.
 * Attributes is probably more commonly associated with instance variables.
 * 
 */
public class Student {
	int id = 1000; //literals
	String name = "John";
	String gender = "male";
	byte age = 18;
//	short rank = 165;
//	long phone = 2234567890L ; //long literal
	long phone = 223_456_7890L; //java 7 -- readability
	//Integer literals : int literal , long literal
	double gpa = 3.8;
	char degree = 'B';
	
	boolean international; //Default false value
	double tuitionFees = 12000.0;
	double internationalFees = 5000.0;
	
	
	 void compute() {
		 
		int nextId = id + 1 ;
		
		if(international) {
			tuitionFees = tuitionFees + internationalFees;
		}
		
		System.out.println("\nid: "+id);
		System.out.println("next Id: "+nextId);
		System.out.println("name: " +name);
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("phone: " +phone);
		System.out.println("gpa : " +gpa);
		System.out.println("degree : " +degree);
		System.out.println("tuitionFees: "+tuitionFees);
		
	}
	
	static void primitives(){
		System.out.println("\n\nInside primitive");
		
		int intHex = 0x0041;
		System.out.println("intHex : " +intHex);
		
		int intBinary = 0b01000001;
		System.out.println("intBinary : "+intBinary);
		
		 int intOctal = 0101;
		 System.out.println("intOctal : "+intOctal);
		
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id = 1000; //literals
		student1.name = "John";
		student1.gender = "male";
		student1.age = 18;
		student1.phone = 223_456_7890L;
		student1.gpa = 3.8;
		student1.degree = 'B';
		student1.international=false;
		student1.compute();
		
	}

}
