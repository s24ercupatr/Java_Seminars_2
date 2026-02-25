package model;

public class Course {
	public long c_ID = 0;
	public String title = "";
	public int creditPoints = 0;
	public Professor professor;
	
	public Course(long _c_ID, String _title, String _surname, int _creditPoints, Professor _professor) {
		c_ID = _c_ID;
		title = _title;
		creditPoints = _creditPoints;
		professor = _professor;
	}
}
