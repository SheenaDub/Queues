
public interface Deque <E> {
	
	
	/** * Returns the number of elements in the deque. */
	public int size(); 
	
	/** * Returns whether the deque is empty. */
	public boolean isEmpty(); 
	
	/** * Returns the first element; an exception is thrown if deque is empty. */
	public E getFirst() throws EmptyDequeException; 
	
	/** * Returns the last element; an exception is thrown if deque is empty. */
	public E getLast() throws EmptyDequeException; 
	
	/** * Inserts an element to be the first in the deque. */
	public void insertFirst (E element); 
	
	/** * Inserts an element to be the last in the deque. */
	public void insertLast (E element); 
	
	/** * Removes the first element; an exception is thrown if deque is empty. */
	public E removeFirst() throws EmptyDequeException; 
	
	/** * Removes the last element; an exception is thrown if deque is empty. */
	public E removeLast() throws EmptyDequeException; 
	
	
	

}
