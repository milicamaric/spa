package main;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista extends ADSLista {

	public void ubaciNaPocetak(int broj) {
		if (prvi == null) {
			CvorDSListe novi = new CvorDSListe(broj, null, null);
			prvi = novi;
			return;
		}

		CvorDSListe novi = new CvorDSListe(broj, null, prvi);
		prvi.prethodni = novi;

		prvi = novi;
	}

	public void ubaciNaKraj(int broj) {
		if (prvi == null) {
			CvorDSListe novi = new CvorDSListe(broj, null, null);
			prvi = novi;
			return;
		}
		CvorDSListe pom = prvi;
		while (pom.sledeci != null) {
			pom = pom.sledeci;
		}
		CvorDSListe novi = new CvorDSListe(broj, pom, null);
		pom.sledeci = novi;
		novi.prethodni = pom;
	}

	public void izbaci(int broj) throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}

		while (prvi.podatak == broj) {
			prvi = prvi.sledeci;
			if (prvi != null) {
				prvi.prethodni = null;
			}
			if (prvi == null) {
				return;
			}
		}

		CvorDSListe pom = prvi;

		while (pom.sledeci != null) {

			if (pom.sledeci.podatak == broj) {
				pom.sledeci = pom.sledeci.sledeci;
				if (pom.sledeci != null) {
					pom.sledeci.prethodni = pom;
				}
			} else {
				pom = pom.sledeci;
			}
		}
	}

	public int zbirParnihNaNeparnim() throws LabisException {
		if (prvi == null) {
			throw new LabisException();
		}

		if (prvi.sledeci == null) {
			return prvi.podatak;
		}

		int zbir = 0;
		CvorDSListe pom = prvi;
		while (pom != null) {
			if (pom.podatak % 2 == 0) {
				zbir += pom.podatak;
			}
			if (pom.sledeci == null) {
				break;
			}
			pom = pom.sledeci.sledeci;
		}
		return zbir;
	}

	public void ubaciNaDrugo(int broj) {

		if (prvi == null) {
			CvorDSListe novi = new CvorDSListe(broj, null, null);
			prvi = novi;
			return;
		}

		CvorDSListe novi = new CvorDSListe(broj, prvi, prvi.sledeci);
		prvi.sledeci = novi;
		novi.prethodni = prvi;
	}

	public void levoDesno(CvorDSListe p) {
		int zbir1 = 0;
		int zbir2 = 0;
		
		CvorDSListe pom = prvi;
		
		while (pom != p) {
			zbir1 += pom.podatak;
			pom = pom.sledeci;
		}
		pom = p.sledeci;
		while (p != null) {
			zbir2 += p.podatak;
			p = p.sledeci;
		}

		System.out.println(zbir1);
		System.out.println(zbir2);
		System.out.println("\n");

		if (zbir1 > zbir2) {
			while (pom != p) {
				System.out.print(pom.podatak + " ");
				pom = pom.sledeci;
			}
		}
		if (zbir2 > zbir1) {
			pom = p;
			while (pom != null) {
				System.out.print(pom.podatak + " ");
				pom = pom.sledeci;
			}
		}
	}
	
	public int brojPoz() throws LabisException {
		if(prvi == null) {
			throw new LabisException();
		}
		
		int brPoz = 0;
		CvorDSListe pom = prvi;
		while(pom != null) {
			if(pom.podatak % 2 == 0 && pom.podatak != 0) {
				brPoz++;
			}
			pom = pom.sledeci;
		}
		return brPoz;
	}
	
	public int prosekPozitivnih() throws LabisException {
		if(prvi == null) {
			throw new LabisException();
		}
		int ZbirPoz = 0;

		CvorDSListe pom = prvi;
		
		while(pom != null) {
			if(pom.podatak % 2 == 0 && pom.podatak != 0) {
				ZbirPoz += pom.podatak;
			}
			pom = pom.sledeci;
		}
		
		return ZbirPoz / brojPoz();
	}
	
	
	
	
}
