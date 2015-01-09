/**
 * Klasa linked list za tip integer
 * 
 * @author harisarifovic
 *
 */
public class LinkedListIn {
	private Node head;
	private int size;

	/**
	 * Klasa Node za integere
	 * 
	 * @author harisarifovic
	 *
	 */
	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public LinkedListIn() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Dodavanje elementa na listu
	 * 
	 * @param value
	 */
	public void add(int value) {
		if (head == null) {
			this.head = new Node(value);
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(value);
		size++;
	}

	/**
	 * Ispisivanje elemenata iz linked liste
	 */
	public String toString() {
		Node print = head;
		StringBuilder sb = new StringBuilder();
		while (print != null) {
			sb.append(String.valueOf(print.value));
			if (print.next != null) {
				sb.append(", ");
			}
			print = print.next;

		}
		return sb.toString();
	}

	/**
	 * Brisanje elementa iz linked liste
	 * 
	 * @param indeks
	 *            Broj "indeksa" elementa koji se brise
	 */
	public void remove(int indeks) {
		if (indeks < 0 || indeks >= size) {
			throw new IndexOutOfBoundsException("Index nije validan!");
		}
		if (indeks == 0) {
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter != indeks) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		size--;
	}

	/**
	 * Dodaje element u listu u bilo koje mjesto liste
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje
	 * @param indeks
	 *            Mjesto u listi
	 */
	public void add(int value, int indeks) {
		if (indeks == size) {
			add(value);
			return;
		}
		Node position = head;
		int counter = 1;
		while (counter != indeks) {
			position = position.next;
			counter++;
		}
		Node newNode = new Node(value);
		newNode.next = position.next;
		position.next = newNode;
		size++;

	}

}
