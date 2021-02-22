package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSRokovi extends AJSLista {

	public int zbirCiklicne() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		CvorJSListe pom = prvi;
		int zbir = prvi.podatak;

		do {
			pom = pom.sledeci;
			zbir += pom.podatak;
		} while (pom.sledeci != prvi);
		return zbir;
	}

	public int brojElemenata() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		int brEl = 0;
		CvorJSListe pom = prvi;
		while (pom != null) {
			brEl++;
			pom = pom.sledeci;
		}
		return brEl;
	}

	public int proizvodPrvihK(int k) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		if (k == 0 || k > brojElemenata()) {
			throw new LabisException("GRESKA");
		}
		CvorJSListe pom = prvi;
		int p = 1;

		for (int i = 0; i <= k - 1; i++) {
			p *= pom.podatak;
			pom = pom.sledeci;
		}
		return p;
	}

	public int temp(JSRokovi lista1, JSRokovi lista2) throws LabisException {
		if (lista1.prvi == null || lista2.prvi == null) {
			throw new LabisException();
		}

		int zbir = 0;
		int Maxzbir = 0;

		CvorJSListe pom1 = lista1.prvi;
		CvorJSListe pom2 = lista2.prvi;

		while (pom1 != null && pom2 != null) {
			zbir = pom1.podatak + pom2.podatak;

			if (zbir > Maxzbir) {
				Maxzbir = zbir;
			}
			pom1 = pom1.sledeci;
			pom2 = pom2.sledeci;
		}
		return Maxzbir;
	}

	public void ubaciPosleManjeg(int broj) throws LabisException {

		CvorJSListe novi = new CvorJSListe(broj, null);

		if (prvi == null) {
			prvi = novi;
			return;
		}

		CvorJSListe levi = prvi;
		CvorJSListe desni = prvi.sledeci;

		while (desni != null) {
			if (levi.podatak <= broj) {

				levi.sledeci = novi;
				novi.sledeci = desni;

				return;
			}
			levi = levi.sledeci;
			desni = desni.sledeci;
		}
		levi.sledeci = novi;
	}

	public void izbaciPrethodni(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		if (prvi.sledeci.podatak == broj) {
			prvi = prvi.sledeci;
			return;
		}

		CvorJSListe pom = prvi;

		if (pom.sledeci == null) {
			pom = null;
		}
		while (pom.sledeci.sledeci != null) {
			if (pom.sledeci.sledeci.podatak == broj) {
				pom.sledeci = pom.sledeci.sledeci;
				return;
			}
			pom = pom.sledeci;
		}

	}

	public void izbaciSveManje(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}

		while (prvi.podatak < broj) {
			prvi = prvi.sledeci;
			if (prvi == null) {
				throw new LabisException();
			}
		}

		CvorJSListe pom = prvi;

		while (pom.sledeci != null) {
			if (pom.sledeci.podatak < broj) {
				pom.sledeci = pom.sledeci.sledeci;
			} else {
				pom = pom.sledeci;
			}
		}
	}

	
	
	
}
