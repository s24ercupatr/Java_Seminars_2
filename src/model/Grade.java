package model;

public class Grade {
	public long g_ID = 0;
	public int value = 0;
	public Student student;
	public Course course;
	
	public Grade(long _g_ID, int _value, Student _student, Course _course) {
		g_ID = _g_ID;
		value = _value;
		student = _student;
		course = _course;
	}
}
