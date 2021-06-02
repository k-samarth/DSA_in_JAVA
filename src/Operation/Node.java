package Operation;

//<T extends Comparable<T>> allows us to compare nodes of the linked list
public class Node<T extends Comparable<T>> {
	//This is a class to set up linked list
	private T data;        //Data Element
	private Node<T> next;  //Link Element 
	
	//Constructor to instantiate the Node
	public Node(T data)
	{
		this.data = data;
		
		setNext(null);
	}
	
	//Method to get link of next element of linked list
	public Node<T> getNext()
	{
		return next;
	}
	
	//Method to change link of the next element of Linked list
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	//Method to get data from the linked list element (node)
	public T getData()
	{
		return data;
	}
	
	//Method to Display the node
	@Override
	public String toString()
	{
		return String.valueOf(data) + "->" + (next == null ? "null" : next.toString());
	}
}
