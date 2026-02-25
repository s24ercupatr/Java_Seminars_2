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
		if (this.name != null && !this.name.isEmpty() && this.name.matches("/[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?/gm")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	
	public void set_surname(String surname) {
		if (this.surname != null && !this.surname.isEmpty() && this.surname.matches("/[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?/gm")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	
	public void set_social_security_nr(String social_security_nr) {
		if (this.social_security_nr != null && !this.social_security_nr.isEmpty() && this.social_security_nr.matches("/[0-9]{6}-[0-9]{5}/gm")) {
			this.social_security_nr = social_security_nr;
		} else {
			this.social_security_nr = "Unknown";
		}
	}
}
