import java.util.ArrayList;
import java.util.Iterator;

public class GenericStack<E> extends ArrayList<E> {
	private ArrayList<E> list = new ArrayList<E>();
	
	public int getSize() {
		return list.size();
	}
	public E peek() {
		return list.get(getSize() - 1);
	}
	public void push(E o) {
		list.add(o);
	}
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(o);
		return o;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public String toString() {
		return "stack:" + list.toString();
	}
	
	public void iterate() {
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
	}
	public void enhancedFor() {
		for(Object obj : list) {
			System.out.print(obj + ", ");
		}
	}
}
