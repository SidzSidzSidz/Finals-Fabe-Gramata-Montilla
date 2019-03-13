import java.util.Scanner;

public class Foundation{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		Display dp = new Display();
		AddTeacher at = new AddTeacher();
		AddStudent as = new AddStudent();
		Check ch = new Check();
		String signname, subj,namegrade;
		String signpass,signsubj, logname, logpass;
		boolean x,y,q;
		int signup,ctrlogin,teachernumber,slogin,studentnum,choice = 1, lol, login,studnum = 0,counter = 0;
		String [][] teacherlist = new String [10][3];
		String [][] studentlist = new String [50][3];
		int [][] subjectlist = new int [50][10];
		String [] mystudents = new String [50];
		String [][] mysubjects = new String [50][10];
		int [][] studentgrade = new int [50][1];
		
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				teacherlist[a][b] = "Empty";
			}
		}
		for(int c = 0; c < 50; c++){
			for(int d = 0; d < 3; d++){
				studentlist[c][d] = "Empty";
			}
		}
		for(int e = 0; e < 50; e++){
			for(int f = 0; f < 10; f++){
				subjectlist[e][f] = 0;
				mysubjects[e][f] = "Empty";
			}
		}		
		for(int h = 0; h < 50; h++){
			mystudents[h] = "Empty";
		}
		for(int i = 0; i < 50; i++){
			for(int j = 0; j < 1; j++){
			studentgrade[i][j]= 0;	
			}
		}
		
		do{
			dp.printMenu();
			int menu = z.nextInt();
			if(menu == 1){
				do{	
					signup = dp.printSignup();
					if(signup == 1){
						
						signname = dp.printSignname();
						signpass = dp.printSignpass();
						dp.printSubjects();
						signsubj = dp.printSignsubj();
						teacherlist = at.addTeacher(signname, signpass, signsubj);
						
						dp.suDone();
					}
					
					else if(signup == 2){
						signname = dp.printSignname();
						signpass = dp.printSignpass();
						studentlist = as.addStudent(signname, signpass);
						mystudents = as.addStudents(signname);
						int b = 0;
						mystudents [b] = signname;
						counter++;
						b++;
						dp.suDone();
					}
					else{
						System.out.println("Error! Choose from the 2!");
					}
				}
				while(signup < 1 && signup > 2);
			}
			else if(menu == 2){
				login = dp.printLogin();
						if(login == 1){
							do{
								logname = dp.loginName();
								boolean lname = ch.checkteacherName(teacherlist, logname);
								teachernumber = ch.teacherNumber(teacherlist, logname);
								x = lname;
								if(lname == false){
									dp.nameError();
								}
							}
							while(x == false);
							do{
								logpass = dp.loginPass();
								boolean lpass = ch.checkteacherPass(teacherlist, logpass);
								y = lpass;
								if(lpass == false){
									dp.passError();
								}
							}
							while(y == false);
							
							do{
								int tlogin = dp.printloginTeacher(logname);
								if(tlogin == 1){
									System.out.println("Students: ");
									for(int b = 0; b < counter; b++){
										System.out.print(mystudents[b] + ", ");
									}
									System.out.println();
								}
								else if(tlogin == 2){
									namegrade = dp.editGrade();
									studnum = ch.studentNumber(studentlist, namegrade);
									int gradenum = dp.enterGrade();
									studentgrade = as.addsubjectGrade(studentgrade, gradenum, studnum);
									System.out.println("Change Successful!");
								}
								else if(tlogin == 0){
									choice = 0;
									break;
								}
								else{
								System.out.println("Error! Choose from the 2!");
								}
							}
							while(choice!= 0);
						}
					
						else if(login == 2){
							do{
								logname = dp.loginName();
								boolean lname = ch.checkstudentName(studentlist, logname);
								x = lname;
								if(lname == false){
									dp.nameError();
								}
							}
							while(x == false);
							do{
								logpass = dp.loginPass();
								boolean lpass = ch.checkstudentPass(studentlist, logpass);
								y = lpass;
								if(lpass == false){
									dp.passError();
								}
							}
							while(y == false);
							slogin = dp.printloginStudent(logname);
								if(slogin == 1){
									System.out.println("Subjects: ");
									for(int b = 0; b < 10; b++){
										System.out.print(mysubjects[studnum][b] + ", ");
									}
									System.out.println();
								}
								else if(slogin == 0){
									choice = 0;
									break;
								}
								System.out.println("Press Enter");
							break;
						}
		
						else{
							System.out.println("Error! Choose from the 2!");
						}
			}
		}
	
		while(choice != 0);
	}
}