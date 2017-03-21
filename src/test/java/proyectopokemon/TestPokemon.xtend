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
	def ConExperiencia50elNivelEs1() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 50
		println(poka.getNivel)
		Assert.assertEquals(poka.getNivel, 1, 0.01)
	}

	@Test
	def PuntosDeAtaqueConExperiencia50Es100() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 50
		Assert.assertEquals(poka.puntosAtaque(), 100, 1)
	}

	@Test
	def PuntosDeSaludConExperiencia50Es200() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.experiencia = 50
		Assert.assertEquals(poka.puntosSalud(), 200, 1)
	}

	@Test
	def SetearDondeEstaPokemonX2Y4SetearPuntoX1Y2AssertNotEquals() {
		pichachu = new Especie(100, 200)
		poka = new Pokemon(pichachu)
		poka.setpunto(2, 4)
		var Point punto
		punto = new Point(1, 2)
		Assert.assertNotEquals(poka.distanciaHasta(punto), 108, 1)
	}

}
