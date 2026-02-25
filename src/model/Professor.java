package model;

public class Professor {
	public long p_ID = 0;
	public String name = "";
	public String surname = "";
	public String degree = "";
	
	public void Professor() {
		
	}
	
	public Professor(long _p_ID, String _name, String _surname, String _degree) {
		p_ID = _p_ID;
		name = _name;
		surname = _surname;
		degree = _degree;
	}
}
