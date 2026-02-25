package model;

import model_enums.ProfDegree;

public class Professor {
	private long p_ID;
	private String name;
	private String surname;
	private ProfDegree degree;
	
	private static long counter = 0;
	
	public long get_p_ID() {
		return p_ID;
	}
	
	public String get_name() {
		return name;
	}
	
	public String surname() {
		return surname;
	}
	
	public ProfDegree get_degree() {
		return degree;
	}
	
	public void set_p_ID() {
		p_ID = counter;
		counter++;
	}
	
	public void set_name(String name) {
		if (name != null && !name.isEmpty() && name.matches("[A-ZĀŪĪŅĒŠĢĶĻŽČ]{1}[a-zāūīņēšģķļžč]{2,15}([ ]{1}[A-ZĀŪĪŅĒŠĢĶĻŽČ]{1}[a-zzāūīņēšģķļžč]{2,15})?")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	
	public void set_surname(String surname) {
		if (surname != null && !surname.isEmpty() && surname.matches("[A-ZĀŪĪŅĒŠĢĶĻŽČ]{1}[a-zāūīņēšģķļžč]{2,15}([-]{1}[A-ZĀŪĪŅĒŠĢĶĻŽČ]{1}[a-zzāūīņēšģķļžč]{2,15})?")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	
	public void set_degree(ProfDegree degree) {
		if (degree != null) {
			this.degree = degree;
		} else {
			this.degree = ProfDegree.OTHER;
		}
	}
	
	public Professor() {
		set_p_ID();
		set_name("Janis");
		set_surname("Berzins");
		set_degree(ProfDegree.BACHELOR);
	}
	
	public Professor(String name, String surname, ProfDegree degree) {
		set_p_ID();
		set_name(name);
		set_surname(surname);
		set_degree(degree);
	}
	
	public String toString() {
		return p_ID + ": " + name + " " + surname + ", " + degree;
	}
}
