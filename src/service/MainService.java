package service;

import model.Student;
import model.Professor;

public class MainService {
	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println(stud1);
		
		Student stud2 = new Student("Patriks Noass", "Ercums", "123456-12345");
		System.out.println(stud2);
		
		Student stud3 = new Student("123test", "test123", "123-456");
		System.out.println(stud3);
		
		Professor prof1 = new Professor();
		System.out.println(prof1);
	}
}
