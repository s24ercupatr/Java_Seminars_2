package model;

public class Course {
	private long c_ID;
	private String title;
	private int credit_points;
	private Professor professor;
	
	private static long counter = 0;
	
	public long get_c_ID() {
		return c_ID;
	}
	
	public String get_title() {
		return title;
	}
	
	public int get_credit_points() {
		return credit_points;
	}
	
	public Professor get_professor() {
		return professor;
	}
	
	public void set_c_ID() {
		c_ID = counter;
		counter++;
	}
	
	public void set_title(String title) {
		if (title != null && !title.isEmpty() && title.matches("[A-ZĀŪĪŅĒŠĢĶĻŽČ][a-z,ā,ū,ī,ņ,ē,š,ģ,ķ,ļ,ž,č]")) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}
	}
	
	public void set_credit_point(int credit_points) {
		this.credit_points = credit_points;
	}
	
	public void set_professor(Professor professor) {
		this.professor = professor;
	}
}
