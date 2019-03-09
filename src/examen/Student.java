package examen;

import java.io.Serializable;
/**
 * Solution of exercise 2
 * @author joaalsai
 *
 */
public class Student extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String NIA;

	public Student(String nombre, String apellidos, String NIA) {
		super(nombre, apellidos);
		this.NIA = NIA;
	}
	
	public String getNIA() {
		return NIA;
	}

	public void setNIA(String nIA) {
		NIA = nIA;
	}
	
	public String toString() {
		return NIA + " - " + name + " " + surname + "\n";
	}
}
