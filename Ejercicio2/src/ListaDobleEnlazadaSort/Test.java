package ListaDobleEnlazadaSort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		DoubleLinkedList dll = new DoubleLinkedList();
		Scanner sc = new Scanner (System.in);
	    System.out.print( "Introduzca el tamaño máximo del última Lista Enlazada Doble: " );
		int tamano = sc.nextInt();
		
		ArrayList<int[]> casos = new ArrayList<int[]>();
	    String archivoInsercion = "insercion.txt";
	    PrintWriter oS = new PrintWriter(archivoInsercion); 
		
	    //lenar arraylist con arreglos
		for(int n=1; n<=tamano; n++) {
	    	casos.add(generarPeorCaso(n));
	    } 
		
		int [] arr = {12,7,11,9,10};
		DoubleLinkedList list = new DoubleLinkedList();
		
		for (int i = 0; i < arr.length; i++) {
			list.insert(arr[i]);
		}
		int contador=0;
		
		while (contador!= tamano) {
			DoubleLinkedList lista= new DoubleLinkedList();
			int[] arreglo= new int [0];
			for (int i = 0; i < casos.size(); i++) {
				arreglo = new int [i];
				arreglo= casos.get(i);
				mostrarArreglo(arreglo);
			}
			llenar(arreglo, lista);			
			lista.display();
			contador++;
			
		}
		
		
		list.display();
		list.insertionSort();
		list.display();
		
		//lenar listas dobles
		
		for (int i = 0; i < tamano-1; i++) {
			DoubleLinkedList lista = new DoubleLinkedList();
			//lista.insert();
		}
		
		
		
	    Iterator<int[]> puntero = casos.iterator();
	    while(puntero.hasNext()){        	
	    	oS.println( String.valueOf((puntero.next()) ) );        	
	    }        
	    oS.close(); 
		
	}
	public static int[] generarPeorCaso(int t) {
		int[] lista= new int[t];
		for (int i=0; i<t; i++) {
			lista[i] = t-i;		
		}
		return lista;		
	}
	
	//Llenar una listaDoble
	public static void   llenar (int [] datos, DoubleLinkedList list) {
		
		for (int i = 0; i < datos.length; i++) {
			list.insert(datos[i]);
		}
		return ;
	}
	
	//Mostrar arreglo
	public static void mostrarArreglo(int [] arreglo) {
		for (int iterable_element : arreglo) {
			System.out.print(iterable_element + "-");
			System.out.println("");
		}
	}
	
	
}
