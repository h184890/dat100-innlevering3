package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;

import no.hvl.dat100.oppgave1.Innlegg;


public class Blogg {
	
	private Innlegg[] innleggtabell;
	private int nesteledig;


	// TODO: objektvariable 

	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		
		return nesteledig;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}

		return -1;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		return finnInnlegg(innlegg) !=-1;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		return nesteledig < innleggtabell.length;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;

		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		result.append(nesteledig).append("\n");
		
		for (int i = 0; i < nesteledig; i++) {
			result.append(innleggtabell[i].toString());
		}
		
		return result.toString();
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
//	public void utvid() {
//		throw new UnsupportedOperationException(TODO.method());
//	}
//	
//	public boolean leggTilUtvid(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//		
//	}
//	
//	public boolean slett(Innlegg innlegg) {
//		
//		throw new UnsupportedOperationException(TODO.method());
//	}
//	
//	public int[] search(String keyword) {
//		
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
}