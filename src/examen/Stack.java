/**
 * 
 */
package examen;

import java.io.Serializable;

/**
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

	public void push(E q) {
		Nodo<E> nodo = new Nodo<E>(q);
		Nodo<E> aux = peak;
		if (peak == null)
			peak = nodo;
		else {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			nodo.setPrevious(aux);
			aux.setNext(nodo);
			peak = nodo;
		}
	}

	public E pop() {
		Nodo<E> aux = peak;

		if (peak == null)
			return null;
		else if (peak.getPrevious() == null) {
			aux = peak;
			peak = null;
			return aux.getElement();
		} else {
			peak = peak.getPrevious();
			peak.setNext(null);
			return aux.getElement();
		}

	}

	public String toString() {
		Nodo<E> aux = peak;
		String salida = "";
		while (aux != null) {
			salida = salida + aux.toString();
			aux = aux.getPrevious();
		}
		return salida;
	}

}
