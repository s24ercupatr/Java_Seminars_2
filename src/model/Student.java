package model;

public class Student {
	private long st_ID;
	private String name;
	private String surname;
	private String social_security_nr;
	
	private static long counter = 0;
	
	public long get_st_ID() {
		return st_ID;
	}
	
	public String get_name() {
		return name;
	}
	
	public String surname() {
		return surname;
	}
	
	public String get_social_security_nr() {
		return social_security_nr;
	}
	
	public void set_st_ID() {
		st_ID = counter;
		counter++;
	}
	
	public void set_name(String name) {
		if (name != null && !name.isEmpty() && name.matches("[A-Z,Ā,Ū,Ī,Ņ,Ē,Š,Ģ,Ķ,Ļ,Ž,Č]{1}[a-z,ā,ū,ī,ņ,ē,š,ģ,ķ,ļ,ž,č]{2,15}([ ]{1}[A-Z,Ā,Ū,Ī,Ņ,Ē,Š,Ģ,Ķ,Ļ,Ž,Č]{1}[a-z,ā,ū,ī,ņ,ē,š,ģ,ķ,ļ,ž,č]{2,15})?")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	
	public void set_surname(String surname) {
		if (surname != null && !surname.isEmpty() && surname.matches("[A-Z,Ā,Ū,Ī,Ņ,Ē,Š,Ģ,Ķ,Ļ,Ž,Č]{1}[a-z,ā,ū,ī,ņ,ē,š,ģ,ķ,ļ,ž,č]{2,15}([-]{1}[A-Z,Ā,Ū,Ī,Ņ,Ē,Š,Ģ,Ķ,Ļ,Ž,Č]{1}[a-z,ā,ū,ī,ņ,ē,š,ģ,ķ,ļ,ž,č]{2,15})?")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	
	public void set_social_security_nr(String social_security_nr) {
		if (social_security_nr != null && !social_security_nr.isEmpty() && social_security_nr.matches("[0-9]{6}-[0-9]{5}")) {
			this.social_security_nr = social_security_nr;
		} else {
			this.social_security_nr = "Unknown";
		}
	}
	
	public Student() {
		set_st_ID();
		set_name("Janis");
		set_surname("Berzins");
		set_social_security_nr("123456-12345");
	}
	
	public Student(String name, String surname, String social_security_nr) {
		set_st_ID();
		set_name(name);
		set_surname(surname);
		set_social_security_nr(social_security_nr);
	}
	
	public String toString() {
		return st_ID + ": " + name + " " + surname + " (" + social_security_nr + ")";
	}
}
