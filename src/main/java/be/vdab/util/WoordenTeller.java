package be.vdab.util;

import java.util.regex.Pattern;

public class WoordenTeller {
	private static final String REG_EXP = "[\\s|,]+";
	
	public int getAantalWoorden(String zin) {
		int aantalWoorden = 0;
		String[] delenZin = zin.split(REG_EXP);
		for (int i = 0 ; i < delenZin.length ; i++) {
			if (delenZin[i]!="") {
				aantalWoorden++;
			}
		}
		return aantalWoorden;
	}
}
