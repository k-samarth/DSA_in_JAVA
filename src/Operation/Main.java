package Operation;

public class Main {

	public static void main(String[] args)
	{
		Node<Integer> intNode1 = new Node<>(100);
		System.out.println("Integer node 1:" + intNode1);
			
		Node<String> stringNode1 = new Node<>("Java");
		System.out.println("Integer node 1:" + stringNode1);
		
		Node<Integer> intNode2 = new Node<>(200);
		Node<String> stringNode2 = new Node<>("Java");
		
		intNode1.setNext(intNode2);
		stringNode1.setNext(stringNode2);
		
		System.out.println("\nInteger node 1 (two linked nodes):" + intNode1);
		System.out.println("String node 1 (two linked nodes):" + stringNode1);
		
		Node<Integer> intNode3 = new Node<>(300);
		Node<String> stringNode3 = new Node<>("JavaScript");
		
		intNode2.setNext(intNode3);
		stringNode2.setNext(stringNode3);
		
		System.out.println("\nInteger node 1 (two linked nodes):" + intNode1);
		System.out.println("String node 1 (two linked nodes):" + stringNode1);
	}
}
