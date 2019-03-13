public class AddTeacher{
	int a = 0, column = 3;
	String [][] list = new String [10][3];
	public String [][] addTeacher(String name, String pass, String subj){
		list[a][0] = name;
		list[a][1] = pass;
		list[a][2] = subj;
		a++;
		return list;
	}
}
		
		
		
		