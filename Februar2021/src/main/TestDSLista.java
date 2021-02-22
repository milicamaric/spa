package main;

import labis.test.ListGenerator;

public class TestDSLista {

	public static void main(String[] args) {
		DSLista lista = new DSLista();
		int[] niz = new int[] {-2,2,3,-2,-8,2,2};
		ListGenerator.napraviDSListuCommon(lista, niz, false);

		try {

			// lista.ubaciNaPocetak(5);
			// lista.ubaciNaKraj(10);
			//lista.izbaci(3);
			//System.out.println(lista.zbirParnihNaNeparnim());
			//lista.ubaciNaDrugo(10);
			//lista.levoDesno(lista.prvi.sledeci.sledeci.sledeci.sledeci);
			
			//System.out.println(lista.brojPoz());
			
			//System.out.println(lista.prosekPozitivnih());
			//lista.ubaciIzmedjuNeg(10);
			
			ListGenerator.ispisiDSListu(lista.prvi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
