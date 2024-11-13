package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String filbane = mappe + "\n" + filnavn;
		
		try (FileWriter writer = new FileWriter(filbane)) {
			writer.write(samling.toString());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}
}
