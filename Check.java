public class Check{
	int b;
	public boolean checkteacherName(String [][] list, String name){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkteacherPass(String[][]list, String pass){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 1;
			String ctr = list[a][b];
			if(ctr.equals(pass)){
				return true;
			}
		}
		return false;
	}
			
	
	public boolean checkteacherSubj(String[][]list, String subj){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 2;
			String ctr = list[a][b];
			if(ctr.equals(subj)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkstudentName(String [][] list, String name){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkstudentPass(String[][]list, String pass){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 1;
			String ctr = list[a][b];
			if(ctr.equals(pass)){
				return true;
			}
		}
		return false;
	}
	
	public int studentNumber(String [][] list, String name){
		for(int a = 0; a < 50; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 50 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return a;
			}
		}
		return 0;
	}
	
	public int teacherNumber(String [][] list, String name){
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 3; b++){
				if(list[a][b] == null){
				list[a][b] = "Empty";
				}
			}
		}
		for(int a = 0; a < 10 ; a++){
			b = 0;
			String ctr = list[a][b];
			if(ctr.equals(name)){
				return a;
			}
		}
		return 0;
	}
	
}