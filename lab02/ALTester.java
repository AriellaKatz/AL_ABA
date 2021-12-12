/*
ABA - Ariella Katz, Alif Rahman, Brianna Tieu, Tom, Grippy, Pepe
APCS
Lab02 -- Well Al B. Sorted
2021-12-10
time spent: 0.5 hrs
*/

/*
DISCO:
0. ArrayList = ArrayList<Integer> will produce a warning saying that the code
   uses unsafe or unchecked operations because the first ArrayList is not
   necessarily an array of Integers. However, it's still allowed.
1. If you get the above warning, if you want more details (like what
   specifically caused the warning) you can enter javac -Xlint:unechecked
   Class.java into the terminal. (However, since it's just a warning, no
   further action is actually necessary.)
QCC:
0.
*/

import java.util.*;

public class ALTester {

	/*checks ascending order by returning false if any element is greater
	than the following one and true if there is no such case*/
	public static boolean orderCheck(OrderedArrayList oAList) {
		for (int i = 0; i < oAList.size()-1; i++) {
			if (oAList.get(i) > oAList.get(i+1)) { return false; }
		}
		return true;
	}

	/*sets each element of an ArrayList to a random integer on the
	interval [0,100)*/
	public static void populate(OrderedArrayList oAList, int size) {
		for (int i = 0; i < size; i++) {
			oAList.add((int)(Math.random() * 100));
		}
	}

	public static void main(String[] args) {
		OrderedArrayList test = new OrderedArrayList();
		System.out.println("Printing empty OrderedArrayList test...");
		System.out.println(test);
		populate(test, 23);
		System.out.println("Printing populated OrderedArrayList test (populated with random ints)...");
		System.out.println(test);
		System.out.println("Is it ordered?");
		System.out.println(orderCheck(test));
		test.set(12, (int)(Math.random()*100));
		System.out.println("Printing OrderedArrayList test post-alteration...");
		System.out.println(test);
		System.out.println("Is it ordered?");
		System.out.println(orderCheck(test));
		test.add((int)(Math.random()*100));
		System.out.println("Printing OrderedArrayList test post-add...");
		System.out.println(test);
                System.out.println("Is it ordered?");
                System.out.println(orderCheck(test));
		test.remove(6);
		System.out.println("Printing OrderedArrayList test post-remove...");
		System.out.println(test);
                System.out.println("Is it ordered?");
                System.out.println(orderCheck(test));
	}

}
