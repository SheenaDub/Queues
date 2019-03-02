



public class LinkedDeque<E> implements Deque<E> {

	private Node<E> front;
	private Node<E> rear;
	private int size;
	
	// constructor - makes empty deque
	public LinkedDeque() {  
	    front = new Node<E>();
	    rear = new Node<E>();
	    front.setNext(rear);  
	    rear.setPrev(front); 
	    size = 0;
	  }
	
	
	
	
	/** * Returns the number of elements in the deque. */
	public int size() {
		return size;	
	} 
	
	/** * Returns whether the deque is empty. */
	public boolean isEmpty() {
		if (size ==0) return true;
		else return false;
	}
	
	/** * Returns the first element; an exception is thrown if deque is empty. */
	public E getFirst() throws EmptyDequeException{
	if (isEmpty())
	      throw new EmptyDequeException("Deque is empty.");
	else {
		
		Node<E> temp = front.getNext();
	    return temp.getElement();
	    }
	
	}
	
	
	 public E getLast() throws EmptyDequeException { 
		    if (isEmpty())
		      throw new EmptyDequeException("Deque is empty.");
		    else {
		    Node<E> temp = rear.getPrev();
		    return temp.getElement();}
		    
		    
		  }
	
	
	
	/** * Inserts an element to be the first in the deque. */
	public void insertFirst (E element) {
		
		Node<E> newnode = new Node(element, null,null);
		
		Node<E> currentfirst = front.getNext();
		
		
		newnode.setPrev(front);
		newnode.setNext(currentfirst);
		
		if (isEmpty()) {
			rear.setPrev(newnode);
		}
		else {
		currentfirst.setPrev(newnode);}
		
		
		front.setNext(newnode);
		
		
		size = size + 1;
		
	}
	
	/** * Inserts an element to be the last in the deque. */
	public void insertLast (E element) {
		
		Node<E> newnode = new Node<E>(element,null,null);
		Node<E> currentlast = rear.getPrev();
		
		currentlast.setNext(newnode);
		newnode.setNext(rear);
		newnode.setPrev(currentlast);
		
		if (isEmpty()) {
			
			front.setNext(newnode);
			
		}
		
		
			
		rear.setPrev(newnode);
		
		size = size + 1;
		
		
	}
	
	/** * Removes the first element; an exception is thrown if deque is empty. */
	public E removeFirst() throws EmptyDequeException{
		
		if (isEmpty()) { throw new EmptyDequeException("Deque is empty");}
		else {
			
			Node<E> first = front.getNext();
			E temp = first.getElement(); // temporary variable for first item 
			
			Node<E> second = first.getNext();
			
			second.setPrev(front);
			front.setNext(second);			
			first = null;
			size = size - 1;
			return temp;
		}
		
		
		
		
	} 
	
		
	/** * Removes the last element; an exception is thrown if deque is empty. */
	public E removeLast() throws EmptyDequeException{
		
		if (isEmpty()) { throw new EmptyDequeException("Deque is empty");}
		else 
		{
			
			
		Node<E> currentlast = rear.getPrev();
		E temp = currentlast.getElement(); // temporary variable for last item
		
		Node<E> secondlast = currentlast.getPrev();
		
		secondlast.setNext(rear);
		rear.setPrev(secondlast);
		

		size = size - 1;
		
		return temp;
		
		}
		
		
	}// end removeLast
	
	
	public String toString() {
		String output = "";
		Node<E> node = front.getNext();
		while (node != rear) {
	
			output = output + " " + node.getElement();
			node = node.getNext();
				}
			return "Size: " + size + ".\tDeque contents: " + output;
				}
	
	
	
	
	// inner class to represent node with previous and next pointers
	public class Node<E> {
		  private E element;
		  private Node<E> next, prev;
		  Node() { this(null, null, null); }
		  Node(E e, Node<E> p, Node<E> n) {
		    element = e;
		    prev = p;
		    next = n;
		  }
		  public void setElement(E newElem) { element = newElem; }
		  public void setNext(Node<E> newNext) { next = newNext; }
		  public void setPrev(Node<E> newPrev) { prev = newPrev; }
		  public E getElement() { return element; }
		  public Node<E> getNext() { return next; }
		  public Node<E> getPrev() { return prev; }
		  
		  public String toString() {
			  			  
				return element.toString();
				}
		
		  
		  
		} // end inner class
	
	
	public static void main(String[] args) {
		
		
		LinkedDeque<String> test = new LinkedDeque<String>();
		System.out.println("initial state:");
		System.out.println(test);
		System.out.println();
		test.insertLast("A");
		System.out.println("after insert last A :");
		System.out.println(test);
		

	} // end main
	
	
	
} // end class
