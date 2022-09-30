import java.io.*;

import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {

	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD student");
			System.out.println("Press 2 to DELETE student");
			System.out.println("Press 3 to DISPLAY student");
			System.out.println("Press 4 to EXIT app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//Add Student to Database
				System.out.println("Enter student name");
				String name=br.readLine();
				System.out.println("Enter student phone");
				String phone=br.readLine();
				System.out.println("Enter student city");
				String city=br.readLine();
				
				Student s=new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(s);
				if(ans==true)
					System.out.println("Student succesfully added");
				else
					System.out.println("Something went wrong :((");
			}
			else if(c==2) {
				//Delete Student from Database
				System.out.println("Enter student ID");
				int id=Integer.parseInt(br.readLine());
				boolean b=StudentDao.delete(id);
				if(b==true)
					System.out.println("Student successfully deleted");
				else
					System.out.println("Something went wrong :((");
			}
			else if(c==3) {
				//Display Students
				StudentDao.display();
			}
			else if(c==4) {
				break;
			}
			else {
				System.out.println("Wrong choice");
				continue;
			}
		}
	}
}
