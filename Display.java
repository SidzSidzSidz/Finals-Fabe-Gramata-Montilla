import java.util.Scanner;
public class Display{
	Scanner z = new Scanner(System.in);
	int grade;
	
	public void printMenu(){
		System.out.println("Welcome to the School's Grading System");
		System.out.println();
		System.out.println("Choose Action: 1 for Sign-up | 2 for Login ");
		System.out.print("Choice: ");
	}
	public int printSignup(){
		System.out.println();
		System.out.println("Sign-up");
		System.out.println("Choose: 1 for Teacher | 2 for Student ");
		System.out.print("Choice: ");
		int sch = z.nextInt();
		System.out.println();
		return sch;
	}
	
	public String printSignname(){
		z.nextLine();
		System.out.print("Enter Name: ");
		String stname = z.nextLine();
		System.out.println();
		return stname;

	}
	
	public String printSignpass(){
		System.out.print("Enter Password(Letters): ");
		String spass = z.nextLine();
		System.out.println();
		return spass;
	}
	
	public String printSignsubj(){
		System.out.print("Enter Subject: ");
		String tsubj = z.nextLine();
		System.out.println();
		return tsubj;
	}
	public void printdoneSign(){
		System.out.println("Thank you for Signing-up!");
		System.out.println("Please Login again.");
		System.out.println("-----End-----");
		System.out.println("Welcome to the School's Grading System");
		System.out.println();
		System.out.println("Choose Action: 1 for Sign-up | 2 for Login ");
		System.out.print("Choice: ");
	}
	
	public int printLogin(){
		System.out.println();
		System.out.println("Login");
		System.out.println("Choose: 1 for Teacher | 2 for Student ");
		System.out.print("Choice: ");
		int lch = z.nextInt();
		System.out.println();
		return lch;	
	}

	
	public String loginName(){
		z.nextLine();
		System.out.print("Name: ");
		String tname = z.nextLine();
		System.out.println();
		return tname;
	}
	
	public String loginPass(){
		System.out.print("Enter Password: ");
		String tpass = z.nextLine();
		System.out.println();
		return tpass;
	}
	public void nameError (){
		System.out.println ("Name not found! Enter again.");
		System.out.println();
		System.out.println("!Press Enter!");
	}
	
	public void passError (){
		System.out.println ("Incorrect Password! Enter again");
	}
	
	public void subjError (){
		System.out.println ("Subject does not exist! Enter again.");
	}
	
	public int printloginTeacher(String tname){
		System.out.println();
		System.out.println("Hello " + tname + "!");
		System.out.println("Choose Action: 1. View Students | 2. Edit Grades | 0. Return to Main Menu");
		System.out.print("Choice: ");
		int tlm = z.nextInt();
		System.out.println();
		return tlm;
	}
	
	public int printloginStudent(String sname){
		System.out.println();
		System.out.println("Hello " + sname + "!");
		System.out.println("Choose Action: 1. View Subjects | 0. Return to Main Menu");
		System.out.print("Choice: ");
		int slm = z.nextInt();
		System.out.println();
		return slm;
	}
	public void printSubjects(){
		System.out.println("1 English");
		System.out.println("2 Math");
		System.out.println("3 Science");
		System.out.println("4 PE");
		System.out.println("5 Filipino");
		System.out.println("6 RS");
		System.out.println("7 History");
		System.out.println("8 Business");
		System.out.println("9 Music and Arts");
		System.out.println("10 Homeroom");
	}
	
	public void printsubjectStudent(String[][] list, int num){
		System.out.println("Press Enter");
		z.nextLine();
		System.out.println();
		System.out.println("Add Subject: ");
		String subj = z.nextLine();
		System.out.println();

	}
	
	public String editGrade(){
		z.nextLine();
		System.out.print("Enter Full Name of Student.");
		String name = z.nextLine();
		System.out.println();
		return name;
	}
	
	public int enterGrade(){
		do{	
			System.out.print("Enter Grade: ");
			grade = z.nextInt();
			System.out.println();
			if(grade<50 && grade > 100){
				System.out.println("Grades can only be from 50 - 100");
			}
		}
		while(grade<50 && grade > 100);
			return grade;
	}
	public void suDone(){
		System.out.println("Thank you for Signing-up!");
		System.out.println("Please Login again.");
		System.out.println();
	}
}