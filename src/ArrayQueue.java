


public class ArrayQueue implements Queue {
	
	protected Object Q[]; // array of objects - to hold the queue elements
	private int N; // actual array size
	protected int f; // index of front element
	protected int r; // index of rear element
	public static final int CAPACITY = 1000; // capacity for default array
	private int size = 0;
	/** * Default (no-arg) constructor, 
	 * creates array of objects
	 * with 1000 elements. */
	public ArrayQueue(){
		this(CAPACITY);
	} // end default constructor
	
	/** *Constructor that creates array of objects of length specified by user 
	 * @param capacity, an integer, length of object array. */
	public ArrayQueue(int capacity){
		N = capacity;
		Q = new Object[N];
	} // end constructor
	
	
	
	/** Return the number of elements in the queue
	* @return an integer, the number of elements in the queue */
	public int size() {
		
		return size ;
		
	}
	
	
	/** Return whether the queue is empty or not 
	 *@return true if empty, false if not */
	public boolean isEmpty() {
		
		return size==0;
		
	}
	
	
	/** * Inspect the element at the front of queue.
	* @return front element in the queue.
	* @exception EmptyQueueException if queue is empty. */
	public Object front() throws EmptyQueueException{
		return Q[f];
	}
	
	
	
	/** * Insert an element at the rear
	of the queue.
	* @param element, o, to be inserted. */	
	public void enqueue(Object o) {
		
		Q[r]=o;
		size = size+1;
		r = (r+1)%N;
		
	}
	
	public int getN()
	{return N;}
	
	public int getR()
	{return r;}
	
	public int getF()
	{return f;}
	
	
	
	
	/** * Remove the front element from
	the queue.
	* @return element removed (the top object).
	* @exception EmptyQueueException if queue is empty. */
	public Object dequeue() throws EmptyQueueException{
		
		Object tmp = Q[f]; // temporary variable for front element
		Q[f]= null; 
		f=(f+1) % N; // increment front
		size = size -1;
		return tmp;
		
	}
	
	
	
	
	/** * String representation of elements stored in queue, 
	 * , and number of elements in queue
	* @return string that represents queue */
	public String toString() {
		String output;
		int size = size();
		output = "";
		
		if (f <= r) {
			for (int i=f; i<=r-1; i++) {output+= " " + Q[i];}
			}
		
		else {
			
			
			for (int i=f; i<=N-1; i++) {output+= " " + Q[i];}
			for (int j=0; j<=r-1; j++) {output+= " " + Q[j];}
			
		}
		
		
		
		return output;
	}
	
	
	// main method to test implementation of class
		public static void main(String[] args) {
			ArrayQueue q = new ArrayQueue(8);
			
			System.out.println("r is:" + q.getR());
			System.out.println("f is:" + q.getF());
			
			System.out.println("N " + q.getN());
			System.out.println("Inital - is empty? " + q.isEmpty());
			System.out.println(q);
			q.enqueue("A");
			System.out.println("to string after enqueue a:" + q);
			System.out.println("r is:" + q.getR());
			System.out.println("f is:" + q.getF());
			q.enqueue("B");
			System.out.println("to string after enqueue a and b:" + q);
			q.dequeue();
			q.dequeue();
			System.out.println("r is:" + q.getR());
			System.out.println("f is:" + q.getF());
			System.out.println("to string after 2 dequeues:" + q);
			System.out.println(" q size " + q.size());
			q.enqueue("c");
			System.out.println("to string after enqueue c:" + q);
			System.out.println(" q size " + q.size());
			q.enqueue("D");
			System.out.println("to string after enqueue c and d:" + q);
			System.out.println(" q size " + q.size());
			System.out.println("front: " + q.front());
			System.out.println("is empty  " + q.isEmpty());
					
			} // end main
	
	
	
	
	
	
	
	
	
	
	
} // end ArrayQueue class
