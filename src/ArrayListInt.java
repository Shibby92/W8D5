/**
 * Klasa array lista za integere
 * 
 * @author harisarifovic
 *
 */
public class ArrayListInt {
	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	public ArrayListInt() {
		this.array = new int[DEFAULT_SIZE];
		this.size = 0;
	}

	public int getSize() {
		return this.size;
	}

	/**
	 * Ispisivanje elemenata array liste
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(String.valueOf(array[i]));
			if (i != size - 1) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}

	/**
	 * Brisanje elementa iz array liste
	 * 
	 * @param indeks
	 *            Indeks elementa koji se brise
	 */
	public void remove(int indeks) {
		for (int i = indeks; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	/**
	 * Dodavanje elementa u array listu
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje
	 */
	public void add(int value) {
		if (size == array.length) {
			resize();
		}
		array[size++] = value;

	}

	/**
	 * Ako je niz pun, udvostruci mu velicinu
	 */
	private void resize() {
		int[] tmp = new int[this.array.length * 2];
		for (int i = 0; i < this.array.length; i++) {
			tmp[i] = this.array[i];
		}
		this.array = tmp;
	}
/**
 * Dodaje element na specificni indeks niza
 * @param value Vrijednost koja se ubacuje
 * @param indeks Mjesto gdje nastaje izmjena
 */
	public void add(int value, int indeks) {
		int[] tmp = new int[size + 1];
		int count = 0;
		for (int i = 0; i < tmp.length; i++) {
			if (i == indeks) {
				tmp[i] = value;
			} else {
				tmp[i] = array[count];
				count++;

			}

		}
		array = tmp;
		size++;
	}
}
