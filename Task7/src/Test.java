import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "Welcome");
		String numberOfStudentsString =JOptionPane.showInputDialog("Please enter number of students");
		int numberOfStudents = Integer.parseInt(numberOfStudentsString);
		
		Student []students = new Student[numberOfStudents];
		
		for(int i=0;i<students.length;i++) {
			String name= JOptionPane.showInputDialog("Pleas Enter Student with ID:"+ (i+1) );	 	
			String email=JOptionPane.showInputDialog("Pleas Enter Email "); 	
			String phone=JOptionPane.showInputDialog("Pleas Enter Phone number ");	 	
			String faculty=JOptionPane.showInputDialog("Pleas Enter Faculty ");
			
			Student student = new Student(name, email, phone, faculty);
			
		    String numberOfGradesString=JOptionPane.showInputDialog("Pleas Enter number of grades ");
		    
		    
		    int numberOfGrades = Integer.parseInt(numberOfGradesString);
			    
			    Grade []grades = new Grade[numberOfGrades];
			    
			    for(int j=0;j<grades.length;j++) 
			    {
			    	
			    	String grade = JOptionPane.showInputDialog("Pleas Enter subject"+(j+1));
			    	
			    	String markString = JOptionPane.showInputDialog("Pleas Enter Mark");
			    	int mark = Integer.parseInt(markString);
			    	
			    	Grade g = new Grade(mark, grade);
			    	grades[j]=g;
			    }
			    
			    student.setGrades(grades);
			    
			   students[i]=student;
			 
		}
		
		String result=" ";
		for(int i=0;i<students.length;i++) {
			
			result+="student with ID:"+(i+1)+"\n"+"Name:"+students[i].getName()+"\n";
			result+="Email:"+students[i].getEmail()+"\n";
			result+="Phone:"+students[i].getPhone()+"\n";
			result+="Faculty:"+students[i].getFaculty()+"\n";
			result+="Grades:"+"\n";
			
			for(int j=0;j<students[i].getGrades().length;j++) {
				result+="Subject:"+(j+1)+"\n"+"Name:"+students[i].getGrades()[j].getName()+"\n";
				result+="Subject:"+(j+1)+"\n"+"Name:"+students[i].getGrades()[j].getMark()+"\n";	
				if(students[i].getGrades()[j].getMark()>=85) {
					result+="Congratulation Dear \n ";
				}
				if(students[i].getGrades()[j].getMark()<=59) {
					result+="sorry you failed \n ";
				}
				}
			
			result+="--------------------------------------------------------------- \n";
			
		}
		
		
		JOptionPane.showMessageDialog(null, result);

	}
    
}
