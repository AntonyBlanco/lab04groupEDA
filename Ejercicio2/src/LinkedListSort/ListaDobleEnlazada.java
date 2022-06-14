package LinkedListSort;

public class ListaDobleEnlazada <T>{
	Node<T>primero;
	Node<T>ultimo;
	
	public ListaDobleEnlazada() {
		this.primero= null;
		this.ultimo=null;
	}
		
	//Agregar Elementos a la lista
	public void add(T dato ) {
		Node<T> nuevo = new Node<T>();
		nuevo.setData(dato);
		if (this.primero==null) {
			this.primero= nuevo;
			//primero.setNextNode(null);
			primero.setNextNode(null);
			primero.setPreviousNode(null);
			this.ultimo=primero;
		}else {
			ultimo.setNextNode(nuevo);
			nuevo.setPreviousNode(ultimo);
			nuevo.setNextNode(null);
			ultimo=nuevo;
		}
	}
	
	//Mostrar elemetos de lista doble
	public void desplegarLista() {
		Node <T> actual = new Node<>();
		actual = primero;
		while (actual!=null) {
			System.out.println(actual.getData());
			actual = actual.getNextNode();
		}
	}
	
	//Algoritmo Sort para Lista Doble
	public void insertsort(ListaDobleEnlazada<T> ListaDoble) {
		int key;
		
		
	}
}
