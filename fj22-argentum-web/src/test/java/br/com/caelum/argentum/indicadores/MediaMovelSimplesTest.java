package br.com.caelum.argentum.indicadores;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.caelum.argentum.modelo.GeradorDeSerie;
import br.com.caelum.argentum.modelo.SerieTemporal;

public class MediaMovelSimplesTest {

	@Test
	public void sequenciaSimplesDeCandles() throws Exception {
		SerieTemporal serie = GeradorDeSerie.criaSerie(1, 2, 3, 4, 3, 4, 5, 4, 3);
		Indicador mms = new MediaMovelSimples(new IndicadorFechamento()); //Indicador mms = new MediaMovelSimples(3);

		assertEquals(2.0, mms.calcula(2, serie), 0.00001);
		assertEquals(3.0, mms.calcula(3, serie), 0.00001);
		assertEquals(10.0 / 3, mms.calcula(4, serie), 0.00001);
		assertEquals(11.0 / 3, mms.calcula(5, serie), 0.00001);
		assertEquals(4.0, mms.calcula(6, serie), 0.00001);
		assertEquals(13.0 / 3, mms.calcula(7, serie), 0.00001);
		assertEquals(4.0, mms.calcula(8, serie), 0.00001);
	}
	/*
	@Test(expected = IllegalArgumentException.class)
	public void negativo() {
		new MediaMovelSimples(-2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void zerado() {
		new MediaMovelSimples(0);
	}*/

}
