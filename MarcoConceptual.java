import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import com.panayotis.gnuplot.JavaPlot;

public class MarcoConceptual {
	public static void main(String[] args) {
		int tamano;        
		Scanner teclado = new Scanner( System.in );
	    System.out.print( "Introduzca el tamaño máximo del último arreglo: " );
	    tamano = teclado.nextInt();
	    
	    ArrayList<int[]> casos = new ArrayList<int[]>();        
	    String archivoInsercion = "insercion.txt";
	    PrintWriter oS;
		try {
			oS = new PrintWriter(archivoInsercion);
			
		    for(int n=1; n<=tamano; n++) {
		    	casos.add(generarPeorCaso(n));
		    }
		    Iterator<int[]> puntero = casos.iterator();
		    while(puntero.hasNext()){
		    	oS.println( String.valueOf( insertionSort(puntero.next()) ) );        	
		    }
		    oS.close();        
		    
		    JavaPlot p = new JavaPlot("C:/Program Files/gnuplot/bin/wgnuplot.exe");
			p.addPlot("\"./insercion.txt\" with lines");
			p.plot();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void imprimirArreglo(int[] lista){
		System.out.println("");
		for (int x = 0; x < lista.length; x++) {
			System.out.print(lista[x] + " ");
		}
	}
	public static long insertionSort(int[] A) {
		int key;
		int i;
		long nano_startTime = System.nanoTime(); 
		for(int j=1; j<A.length; j=j+1) {
			key = A[j];
			//Insertar A[j] en la secuencia ordenada A[1..j-1]
			i = j-1;
			while(i>-1 && A[i]>key) {
				A[i+1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
			//imprimirArreglo(A);
		}
		long nano_endTime = System.nanoTime();		
		return nano_endTime - nano_startTime;
	}
	public static int[] generarPeorCaso(int t) {
		int[] lista = new int[t];
		for (int i = 0; i < t; i++) {
			lista[i] = t - i;		
		}
		return lista;		
	}
}

