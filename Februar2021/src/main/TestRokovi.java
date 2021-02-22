package main;

import labis.exception.LabisException;
import labis.test.ListGenerator;

public class TestRokovi {

	public static void main(String[] args) throws LabisException {

		// JSRokovi listac = new JSRokovi();
		JSRokovi lista = new JSRokovi();
		int[] niz = new int[] { 1,2,3,4,5,6,7 };
		ListGenerator.napraviJSListuCommon(lista, niz, false);

		//JSRokovi lista1 = new JSRokovi();
		//JSRokovi lista2 = new JSRokovi();

		//int[] niz1 = new int[] { 1, 2, 3, 4 };
		//int[] niz2 = new int[] { 1, 5, 8, 30 };
		// ListGenerator.napraviJSListuCommon(listac, niz, true);
		//ListGenerator.napraviJSListuCommon(lista1, niz1, false);
		//ListGenerator.napraviJSListuCommon(lista2, niz2, false);
		
		try {
			// System.out.println(listac.zbirCiklicne());
			// ListGenerator.ispisiJSListu(listac.prvi);
			// System.out.println(lista.proizvodPrvihK(3));
			//System.out.println(lista.temp(lista1, lista2));
			//lista.ubaciPosleManjeg(1);
			//lista.izbaciPrethodni(7);
			//lista.izbaciSveManje(6);

			ListGenerator.ispisiJSListu(lista.prvi);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
