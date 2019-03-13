public class AddStudent{
	int a = 0, column = 3,z = 0;
	String [][] list = new String [50][3];
	String [] slist = new String [50];
	int [][] gradelist = new int [50][1];
	public String [][] addStudent(String name, String pass){
		list[a][0] = name;
		list[a][1] = pass;
		a++;
		return list;
	}
	
	public String[][] addstudentSubject(String [][] slist, int num){
		slist [num][0]  =  "English";
		slist [num][1]  =  "Math";
		slist [num][2]  =  "Science";
		slist [num][3]  =  "PE";
		slist [num][4]  =  "Filipino";
		slist [num][5]  =  "RS";
		slist [num][6]  =  "History";
		slist [num][7]  =  "Business";
		slist [num][8]  =  "Music and Arts";
		slist [num][9]  =  "Homeroom";
		return slist;
	}
	
	public int [][] addsubjectGrade(int [][] list, int grade, int number){
		gradelist[number][1] = grade;
		return list;
	}
	
	public String [] addStudents(String name){
		slist[z] = name;
		z++;
		return slist;
	}

		
	public String[] myStudents(String[][] list, String[] students){
		for(int h = 0; h < 50; h++){
			students[h] = "Empty";
		}
		for(int h = 0; h < 50; h++){
			students[h] =  list[h][0];
		}
		return students;
	}
}