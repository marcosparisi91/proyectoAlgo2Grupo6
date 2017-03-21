package proyectopokemon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.uqbar.geodds.Point;
import proyectopokemon.Especie;
import proyectopokemon.Pokemon;

@SuppressWarnings("all")
public class TestPokemon {
  private Especie pichachu = new Especie(100, 200);
  
  private Pokemon poka = new Pokemon(this.pichachu);
  
  @Before
  public void inicializar() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(2);
  }
  
  @Test
  public void ConExperiencia2elNivelEs0coma54() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(2);
    double _nivel = this.poka.getNivel();
    Assert.assertEquals(_nivel, 0.54, 0.01);
  }
  
  @Test
  public void PuntosDeAtaqueConExperiencia2Es54() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(2);
    double _puntosAtaque = this.poka.puntosAtaque();
    Assert.assertEquals(_puntosAtaque, 54, 1);
  }
  
  @Test
  public void PuntosDeSaludConExperiencia2Es108() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(2);
    double _puntosSalud = this.poka.puntosSalud();
    Assert.assertEquals(_puntosSalud, 108, 1);
  }
  
  @Test
  public void SetearDondeEstaPokemonX2Y4SetearPuntoX1Y2AssertNotEquals() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setpunto(2, 4);
    Point punto = null;
    Point _point = new Point(1, 2);
    punto = _point;
    double _distanciaHasta = this.poka.distanciaHasta(punto);
    Assert.assertNotEquals(_distanciaHasta, 108, 1);
  }
}
