package LinkedListSort;
import java.util.Scanner;

import com.panayotis.gnuplot.*;
public class Test {
	public static void main(String[] args) {
		//ListaDobleEnlazada<Integer> lista =new ListaDobleEnlazada<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese El tamaño Maximo de la ultima listaDoble: ");
		int tamaño = sc.nextInt();
				
		//lista.desplegarLista();
	}
	
	//Metodo para llenar lista doble
	public void llenarListaDoble(ListaDobleEnlazada<Integer> listaDoble, int numElementos) {
		for (int i = 0; i < numElementos; i++) {
			//listaDoble.add();
		}
	}
	
	//Metodo para generar peor caso
	public static int[] generarPeorCaso(int t) {
		int[] lista= new int[t];
		for (int i=0; i<t; i++) {
			lista[i] = t-i;		
		}
		return lista;		
	}
}
