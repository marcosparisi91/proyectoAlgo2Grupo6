package proyectopokemon

import org.junit.Before
import org.junit.Test
import org.junit.Assert
import org.uqbar.geodds.Point

class TestPokemon {

	var pichachu = new Especie(100, 200)
	var poka = new Pokemon(pichachu)

	@Before
	def inicializar() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 2

	}

	@Test
	def ConExperiencia2elNivelEs0coma54() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 2
		Assert.assertEquals(poka.getNivel, 0.54, 0.01)
	}

	@Test
	def PuntosDeAtaqueConExperiencia2Es54() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 2
		Assert.assertEquals(poka.puntosAtaque(), 54, 1)
	}

	@Test
	def PuntosDeSaludConExperiencia2Es108() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 2
		Assert.assertEquals(poka.puntosSalud(), 108, 1)
	}
	
		@Test
	def SetearDondeEstaPokemonX2Y4SetearPuntoX1Y2AssertNotEquals() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.setpunto(2,4)
		var  Point punto
		punto =  new Point(1,2)
		Assert.assertNotEquals(poka.distanciaHasta(punto), 108, 1)
	}
	
}
