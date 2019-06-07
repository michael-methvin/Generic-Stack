import java.util.ArrayList;
import java.util.Collections;
// Questions 1 2 and 3
public class StackTest {
	public static void main(String[] args) {
		//Creating String stack
		GenericStack<String> list = new GenericStack<>();
		// Adding names to the stack
		list.push("Michael"); list.push("Spencer");   list.push("Sammy");
		list.push("John");    list.push("Katherine"); list.push("Billy");
		
		System.out.println(list);
		System.out.println("Number of names = " + list.getSize());
		System.out.println("peek: " + list.peek());
		System.out.println("pop: " + list.pop());
		list.iterate();
		System.out.println("");
		
		// Creating Integer stack
		GenericStack<Integer> list2 = new GenericStack<>();
		// Adding integers into the stack
		list2.push(11); list2.push(22); list2.push(33);
		list2.push(44); list2.push(55); list2.push(999);
		
		System.out.println(list2);
		System.out.println("Number of numbers = " + list2.getSize());
		System.out.println("peek: " + list2.peek());
		System.out.println("pop: " + list2.pop());
		list2.enhancedFor();
		// Duplicate test
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3); list3.add(3); list3.add(4); list3.add(5);
		System.out.println("");
		System.out.println("Remove duplicates for integers");
		System.out.println("Original List: " + list3);
		System.out.println("Duplicate remove list: " + removeDuplicates(list3));
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Cooper"); list4.add("Sammy"); list4.add("Brad"); list4.add("Brad");
		System.out.println("Same method for strings");
		System.out.println("Original List: " + list4);
		System.out.println("Duplicate List: " + removeDuplicates(list4));
		// Searching for specific integer
		Integer[] list5 = list3.toArray(new Integer[list3.size()]);
		System.out.println("Looking for 4 index = " + LinearSearch(list5, 4));
		// Integer array for max test
		Integer[] numbers = {1,3,4,5,7,3,7,9,0,11,14,2,15,6,8,0,9,};
		System.out.println("The maximum integer is: " + max(numbers));
		
		// String array for max test
		String[] strings = {"Red", "Green", "Blue"};
		System.out.println("The maximum string is: " + max(strings));
		// Creating circles and Circle array
		Circle a = new Circle(4);
		Circle b = new Circle(2);
		Circle c = new Circle(6);
		Circle d = new Circle(5);
		Circle[] list8 = {a,b,c,d};
		System.out.println(max(list8));
	}
	// Question 2
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> list2 = new ArrayList<E>();
		
		for(E obj : list) {
			if(!list2.contains(obj)) {
				list2.add(obj);
			}
			else {
		}
		}
		return list2;
	}
	// Question 3
	public static <E extends Comparable<E>> int LinearSearch(E[] list, E key) {
		int i = 0;
		for(E obj : list) {
			if(obj == key) {
				return i;
			}
			else {
				i++;
			}
		}
		return -1;
	}
	// Question 4
	public static <E extends Comparable<E>> E max(E[] list) {;
		E max = list[0];
		for(E obj : list) {
			if(obj.compareTo(max) > 0) {
				max = obj;
			}
		}
		return max;
	}
}