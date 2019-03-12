/**
 * 
 */
package examen;

import java.io.Serializable;

/**
 * Solution of exercise 1
 * 
 * @author joaalsai
 *
 */
public class Stack<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Nodo<E> peak;

	public Stack() {
		peak = null;
	}

	/**
	 * Place the element on top of the stack
	 * 
	 * @param q
	 *            the element to push
	 */
	public void push(E q) {
		Nodo<E> nodo = new Nodo<E>(q);

		if (peak == null)
			peak = nodo;
		else {
			nodo.setNext(peak);
			peak.setPrevious(nodo);
			peak = nodo;
		}
	}

	/**
	 * Get the element on top of the stack
	 * 
	 * @return the element
	 */
	public E pop() {

		E aux = null;
		if (peak != null) {
			aux = peak.getElement();
			peak = peak.getNext();
			if (peak != null)
				peak.setPrevious(null);
		}
		return aux;

	}

	public String toString() {
		Nodo<E> aux = peak;
		String salida = "";
		while (aux != null) {
			salida = salida + aux.toString();
			aux = aux.getNext();
		}
		return salida;
	}

}
