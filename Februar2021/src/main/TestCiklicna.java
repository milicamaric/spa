package main;

import labis.exception.LabisException;
import labis.test.ListGenerator;

public class TestCiklicna {

	public static void main(String[] args) throws LabisException {

		JSListaCiklicna lista = new JSListaCiklicna();
		int[] niz = new int[] { 1, 2, 3, 4, 5 };
		ListGenerator.napraviJSListuCommon(lista, niz, true);

		try {
			//lista.ubaciNaPocetak(8);
			//lista.ubaciNaKraj(10);
			ListGenerator.ispisiJSListu(lista.prvi);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// lista.printLista();

	}
}
