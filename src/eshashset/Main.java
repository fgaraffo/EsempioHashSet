package eshashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Esempio Modulo
		// algoritmo compressione
//		int range = 10;
//		System.out.println(23%10);
		
		Set <Impiegato> impiegati = new HashSet <Impiegato> ();

		Impiegato i1 = new Impiegato(27, "Andrea", "Marcelli");
		Impiegato i2 = new Impiegato(45, "Fulvio", "Corno");
		Impiegato i3 = new Impiegato(45, "Givanni", "Squillero");
		
		impiegati.add(i1);
		impiegati.add(i2);
		impiegati.add(i3);

		Iterator <Impiegato> it = impiegati.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		List <String> arrayList = new ArrayList<String>();
		List <String> linkedList = new LinkedList<String>();
		HashSet <String> set = new HashSet <String>();
		
		// ADD
		Long t1 = System.nanoTime();
		for (int i=0;i<100000;i++)
		{
			arrayList.add("tag_"+i);
		}
		Long t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0;i<100000;i++)
		{
			linkedList.add("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=0;i<100000;i++)
		{
			set.add("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		// REMOVE
		t1 = System.nanoTime();
		for (int i=9999;i>=0;i--)
		{
			arrayList.remove("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=9999;i>=0;i--)
		{
			linkedList.remove("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
		
		t1 = System.nanoTime();
		for (int i=9999;i>=0;i--)
		{
			set.remove("tag_"+i);
		}
		t2 = System.nanoTime();
		System.out.println((t2-t1)/1e9);
	}

}
