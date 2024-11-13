package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	// TODO - deklarering av objektvariable
	
//	public Innlegg() {
//			
//	}
	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id; 
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;

		// TODO 
		// throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		

		// TODO - START
		
		 //throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		
		return bruker;
		
		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
		
		// throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		
		return dato;
		
		// throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
		
		// throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		
		return id;
		
		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setId(int id) {
		
		this.id = id;
		
	}
	
	
	
	public int getLikes() {
		
		return likes;
		
		// throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike() {
		
		this.likes++;
		
		// throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		return this.id == innlegg.getId();
		
		// throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		// throw new UnsupportedOperationException(TODO.method());
				
	}
	
	
//	// Metoden nedenfor er kun for valgfri oppgave 6
//	public String toHTML() {
//		
//		throw new UnsupportedOperationException(TODO.method());
//				
//	}
	
	
}
