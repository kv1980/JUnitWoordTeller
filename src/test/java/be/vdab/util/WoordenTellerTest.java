package be.vdab.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoordenTellerTest {
	private WoordenTeller woordenTeller;
	
	@Before
	public void before() {
		woordenTeller = new WoordenTeller();
	}

	@Test
	public void nul_bij_zin_met_enkel_spaties() {
		assertEquals(0,woordenTeller.getAantalWoorden(" "));
		assertEquals(0,woordenTeller.getAantalWoorden("  "));
	}
	
	@Test
	public void nul_bij_zin_met_enkel_kommas() {
		assertEquals(0,woordenTeller.getAantalWoorden(","));
		assertEquals(0,woordenTeller.getAantalWoorden(",,"));
	}
	
	@Test
	public void nul_bij_zin_met_enkel_kommas_en_spaties() {
		assertEquals(0,woordenTeller.getAantalWoorden(", "));
		assertEquals(0,woordenTeller.getAantalWoorden(" ,"));
		assertEquals(0,woordenTeller.getAantalWoorden(",  "));
		assertEquals(0,woordenTeller.getAantalWoorden(" , "));
		assertEquals(0,woordenTeller.getAantalWoorden("  ,"));
		assertEquals(0,woordenTeller.getAantalWoorden(" ,,"));
		assertEquals(0,woordenTeller.getAantalWoorden(", ,"));
		assertEquals(0,woordenTeller.getAantalWoorden(",, "));
		assertEquals(0,woordenTeller.getAantalWoorden(",,  "));
		assertEquals(0,woordenTeller.getAantalWoorden(", , "));
		assertEquals(0,woordenTeller.getAantalWoorden(",  ,"));
		assertEquals(0,woordenTeller.getAantalWoorden(" , ,"));
		assertEquals(0,woordenTeller.getAantalWoorden("  ,,"));
	}
	
	@Test
	public void één_bij_zin_met_één_woord() {
		//assertEquals(1,woordenTeller.getAantalWoorden("woord"));
		//   assertEquals(1,woordenTeller.getAantalWoorden(" woord"));
		//assertEquals(1,woordenTeller.getAantalWoorden("woord "));
		//   assertEquals(1,woordenTeller.getAantalWoorden(",woord"));
		//assertEquals(1,woordenTeller.getAantalWoorden("woord,"));
		//   assertEquals(1,woordenTeller.getAantalWoorden(" woord "));
		//assertEquals(1,woordenTeller.getAantalWoorden(" woord,"));
		//assertEquals(1,woordenTeller.getAantalWoorden(",woord "));
		//assertEquals(1,woordenTeller.getAantalWoorden(",woord,"));
	}
	
	@Test
	public void twee_bij_zin_met_twee_woord_gescheiden_door_een_spatie() {
		assertEquals(2,woordenTeller.getAantalWoorden("woord1 woord2"));
	}
	
	@Test
	public void twee_bij_zin_met_twee_woord_gescheiden_door_een_komma() {
		assertEquals(2,woordenTeller.getAantalWoorden("woord1,woord2"));
	}
	
	@Test
	public void twee_bij_zin_met_twee_woord_gescheiden_door_een_komma_en_een_spatie() {
		assertEquals(2,woordenTeller.getAantalWoorden("woord1, woord2"));
		assertEquals(2,woordenTeller.getAantalWoorden("woord1 ,woord2"));
	}
}
