package examen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		
		File f = new File("test");

		Student a1 = new Student("Jose", "Garcia", "1234");
		Student a2 = new Student("Manuel", "Martinez", "3424");
		Student a3 = new Student("Carlos", "Lopez", "3114");

		Stack<Student> p1 = new Stack<Student>();
		p1.push(a1);
		p1.push(a2);
		p1.push(a3);
		System.out.println("Source stack");
		System.out.println(p1.toString());

		Stack<Student> p2 = new Stack<Student>();

		invertirPila(p1, p2);

		System.out.println("Target stack");
		System.out.println(p2.toString());

		
		store(p2, f);

		// Only to check the store method
		System.out.println("Stack from file");
		System.out.println(load(f));

	}

	public static void invertirPila(Stack<Student> p1, Stack<Student> p2) {
		Student aux;

		while ((aux = p1.pop()) != null) {
			p2.push(aux);
		}
	}

	public static void store(Stack<Student> p, File f) {

		ObjectOutputStream oos = null;

		try {

			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

			oos.writeObject(p);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	/*
	 * This method is only to check the store method
	 */
	@SuppressWarnings("unchecked")
	public static Stack<Student> load(File f) {

		ObjectInputStream ois = null;
		Stack<Student> stack = null;

		try {

			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));

			stack = (Stack<Student>) ois.readObject();

		} catch (IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return stack;
	}

}
