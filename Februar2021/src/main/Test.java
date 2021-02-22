package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class Test {

	public static void main(String[] args) throws LabisException {

		JSLista lista = new JSLista();
		

		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(4);
		lista.ubaciNaPocetak(3);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(9);
		lista.ubaciNaPocetak(1);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaPocetak(2);
		lista.ubaciNaKraj(5);
		lista.ubaciNaKraj(6);
		lista.ubaciNaPocetak(2);
		lista.printLista();

		// System.out.println("Izbacen je broj: " +
		// lista.izbaciSaPocetka());
		// System.out.println("Izbacen je broj: " +
		// lista.izbaciSaPocetka());

		// System.out.println("Izbacen poslednji el: " +
		// lista.izbaciSaKraja());

		// System.out.println("Lista ima ovaj broj el: " +
		// lista.brojElemenata());
		// lista.printLista();

		// System.out.println("Trazeni el. je: " + lista.get(3));
		// lista.set(3, 10);
		// System.out.println("Da li br postoji: " + lista.contains(5));
		// lista.ubaciNaIndex(0 10);
		// System.out.println("Izbacen je cvor sa vrednoscu: " +
		// lista.izbaciSaIndexa(2));

		//lista.selectionSort();

		//lista.ubaciSortirano(2);
		//lista.ubaciSortirano(10);
		//lista.ubaciSortirano(20);
		
		//lista.izbaci(2);
		//lista.printLista();
	}

}
