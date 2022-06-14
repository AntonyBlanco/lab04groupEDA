package ListaDobleEnlazadaSort;

public class DoubleLinkedList {
	
	public Node head;
	public Node tail;
	
	public DoubleLinkedList()
	{
		// Set head and tail value
		this.head = null;
		this.tail = null;
	}
	// Insert new node at end position
	public void insert(int value)
	{
		// Create a node
		Node node = new Node(value);
		if (this.head == null)
		{
			// Add first node
			this.head = node;
			this.tail = node;
			return;
		}
		// Add node at last position
		this.tail.next = node;
		node.prev = this.tail;
		this.tail = node;
	}
	// Display node element of doubly linked list
	public void display()
	
	
	{
		if (this.head == null)
		{
			System.out.println("Empty Linked List");
		}
		else
		{
			System.out.print("\nLinked List :");
			// Get first node of linked list
			Node temp = this.head;
			// iterate linked list 
			while (temp != null)
			{
				// Display node value
				System.out.print("  " + temp.data);
				// Visit to next node
				temp = temp.next;
			}
			//System.out.print("\nLinked List del final al inicio:");
			// Get last node of linked list
			//temp = this.tail;
			// iterate linked list 
			while (temp != null)
			{
				// Display node value
				System.out.print("  " + temp.data);
				// Visit to prev node
				temp = temp.prev;
			}
			System.out.print("\n");
		}
	}
	// Swap value of given node
	public void swapData(Node first, Node second)
	{
		int value = first.data;
		first.data = second.data;
		second.data = value;
	}
	// Sort elements using insertion sort
	public void insertionSort()
	{
      	// Get first node
		Node front = this.head;
		Node back = null;
		while (front != null)
		{
          	// Get next node
			back = front.next;
          	// Update node value when consecutive nodes are not sort
			while (back != null && back.prev != null && 
                  back.data < back.prev.data)
			{
				
					// Modified node data
					swapData(back, back.prev);
                    // Visit to previous node
					back = back.prev;
				
			}
            // Visit to next node
			front = front.next;
		}
	}
	
	// Sort elements using insertion sort
		public long  insertionSort2(DoubleLinkedList lista)
		{
			long nano_startTime = System.nanoTime(); 
			// Get first node
			Node front = this.head;
			Node back = null;
			while (front != null)
			{
	          	// Get next node
				back = front.next;
	          	// Update node value when consecutive nodes are not sort
				while (back != null && back.prev != null && 
	                  back.data < back.prev.data)
				{
					
						// Modified node data
						swapData(back, back.prev);
	                    // Visit to previous node
						back = back.prev;
					
				}
	            // Visit to next node
				front = front.next;
			}
			long nano_endTime = System.nanoTime();		
			return nano_endTime - nano_startTime;
		}
}
