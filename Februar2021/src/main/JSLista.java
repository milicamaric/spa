package main;

import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class JSLista extends AJSLista {

	public void printLista() {

		if (prvi == null) {
			System.out.println("Lista je prazna!");
			return;
		}

		CvorJSListe pom = prvi;

		System.out.println("Lista je: ");
		while (pom != null) {
			System.out.println(pom.podatak + " ");
			pom = pom.sledeci;
		}
	}

	public void ubaciNaPocetak(int p) {
		CvorJSListe novi = new CvorJSListe(p, prvi);
		prvi = novi;
	}

	public void ubaciNaKraj(int p) {

		CvorJSListe novi = new CvorJSListe(p, null);

		if (prvi == null) {
			prvi = novi;
		}

		CvorJSListe pom = prvi;

		while (pom.sledeci != null) {
			pom = pom.sledeci;
		}
		pom.sledeci = novi;
	}

	public int izbaciSaPocetka() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}

		int p = prvi.podatak;
		prvi = prvi.sledeci;
		return p;

	}

	public int izbaciSaKraja() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		if (prvi.sledeci == null) {
			int p = prvi.podatak;
			prvi = null;
			return p;
		}

		CvorJSListe pom = prvi;
		while (pom.sledeci.sledeci != null) {
			pom = pom.sledeci;
		}
		int p = pom.sledeci.podatak;
		pom.sledeci = null;
		return p;
	}

	public int brojElemenata() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		CvorJSListe pom = prvi;
		int brojac = 0;
		while (pom != null) {
			brojac++;
			pom = pom.sledeci;
		}
		return brojac;
	}

	public int get(int index) throws LabisException {

		if (index < 0 || index >= brojElemenata()) {
			throw new LabisException();
		}

		if (prvi == null) {
			throw new LabisException();
		}
		CvorJSListe pom = prvi;

		for (int i = 0; i < index; i++) {
			pom = pom.sledeci;
		}
		int p = pom.podatak;
		return p;
	}

	public void set(int index, int podatak) throws LabisException {

		if (index < 0 || index >= brojElemenata()) {
			throw new LabisException();
		}

		if (prvi == null) {
			throw new LabisException();
		}

		CvorJSListe pom = prvi;

		for (int i = 0; i < index; i++) {
			pom = pom.sledeci;
		}
		pom.podatak = podatak;
	}

	public boolean contains(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		CvorJSListe pom = prvi;

		while (pom != null) {

			if (pom.podatak == broj) {
				return true;
			}
			pom = pom.sledeci;
		}
		return false;
	}

	public void ubaciNaIndex(int index, int broj) throws LabisException {
		if (index < 0 || index > brojElemenata()) {
			throw new LabisException();
		}

		if (index == 0) {
			CvorJSListe novi1 = new CvorJSListe(broj, prvi);
			prvi = novi1;
			return;
		}

		CvorJSListe pom = prvi;

		for (int i = 0; i < index - 1; i++) {
			pom = pom.sledeci;
		}
		CvorJSListe novi = new CvorJSListe(broj, pom.sledeci);
		pom.sledeci = novi;

	}

	public int izbaciSaIndexa(int index) throws LabisException {
		if (index < 0 || index > brojElemenata()) {
			throw new LabisException();
		}

		if (index == 0) {
			int p = prvi.podatak;
			prvi = prvi.sledeci;
			return p;
		}

		CvorJSListe pom = prvi;

		for (int i = 0; i < index - 1; i++) {
			pom = pom.sledeci;
		}
		int k = pom.sledeci.podatak;
		pom.sledeci = pom.sledeci.sledeci;
		return k;
	}

	public void selectionSort() {
		CvorJSListe spori = prvi;
		CvorJSListe brzi = prvi.sledeci;

		while (spori.sledeci != null) {
			while (brzi != null) {
				if (spori.podatak > brzi.podatak) {
					int c = spori.podatak;
					spori.podatak = brzi.podatak;
					brzi.podatak = c;
				}
				brzi = brzi.sledeci;
			}
			spori = spori.sledeci;
			brzi = spori.sledeci;
		}
	}

	public void ubaciSortirano(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		if (broj <= prvi.podatak) {
			CvorJSListe novi = new CvorJSListe(broj, prvi);
			prvi = novi;
			return;
		}

		CvorJSListe manji = prvi;
		CvorJSListe veci = prvi.sledeci;

		while (veci != null) {

			if (broj < veci.podatak) {
				CvorJSListe novi = new CvorJSListe(broj, veci);
				manji.sledeci = novi;
				novi.sledeci = veci;
				return;
			}
			manji = manji.sledeci;
			veci = veci.sledeci;
		}

		if (veci == null) {
			CvorJSListe novi = new CvorJSListe(broj, null);
			manji.sledeci = novi;
		}
	}

	public void izbaci(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}
		while (prvi.podatak == broj) {
			prvi = prvi.sledeci;
			if (prvi == null) {
				throw new LabisException();
			}
		}

		CvorJSListe pom = prvi;

		while (pom.sledeci != null) {

			if (pom.sledeci.podatak == broj) {
				pom.sledeci = pom.sledeci.sledeci;
			} else {
				pom = pom.sledeci;
			}
		}
	}

}
