/**
 * Testiranje liked liste i array liste
 * 
 * @author harisarifovic
 *
 */
public class Test {

	public static void main(String[] args) {
		LinkedListIn test = new LinkedListIn();
		test.add(2);
		test.add(4);
		test.add(6);
		test.add(99,1);
		test.add(100,4);
		System.out.println(test.toString());
		test.remove(2);
		System.out.println(test.toString());
		ArrayListInt <Integer>test2 = new ArrayListInt<Integer>();
		test2.add(1);
		test2.add(3);
		test2.add(5);
		test2.add(99, 1);
		test2.add(100, 2);
		test2.add(500,5);
		System.out.println(test2.toString());
		test2.remove(2);
		System.out.println(test2.toString());
		LinkedList <Integer>test3 = new LinkedList<Integer>();
		test3.add(1);
		int c=24;
		test3.add(c);
		
	}

}
