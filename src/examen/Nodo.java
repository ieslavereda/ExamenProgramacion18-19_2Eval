package examen;

import java.io.Serializable;

public class Nodo<E> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private E element;
	private Nodo<E> next;
	private Nodo<E> previous;
	
	public Nodo(E elemento){
		this.element = elemento;
	}

	/**
	 * @return the element
	 */
	public E getElement() {
		return element;
	}

	/**
	 * @return the next
	 */
	public Nodo<E> getNext() {
		return next;
	}

	/**
	 * @return the previous
	 */
	public Nodo<E> getPrevious() {
		return previous;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Nodo<E> next) {
		this.next = next;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(Nodo<E> previous) {
		this.previous = previous;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return element.toString() ;
	}
	
}
