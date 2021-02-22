package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSListaCiklicna extends AJSLista {

	public void printLista() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		CvorJSListe pom = prvi;
		do {
			System.out.println(pom.podatak + " ");
			pom = pom.sledeci;
		} while (pom != prvi);
	}

	public void ubaciNaPocetak(int broj) {
		if (prvi == null) {
			CvorJSListe novi = new CvorJSListe(broj, prvi);
			prvi = novi;
			return;
		}
		CvorJSListe novi = new CvorJSListe(broj, prvi);

		CvorJSListe pom = prvi;
		do {
			pom = pom.sledeci;
		} while (pom.sledeci != prvi);

		pom.sledeci = novi;
		prvi = novi;
	}

	public void ubaciNaKraj(int broj) {
		if (prvi == null) {
			CvorJSListe novi = new CvorJSListe(broj, prvi);
			prvi = novi;
			return;
		}

		CvorJSListe pom = prvi;

		do {
			pom = pom.sledeci;
		} while (pom.sledeci != prvi);
		CvorJSListe novi = new CvorJSListe(broj, prvi);
		pom.sledeci = novi;
	}

}
