package proyectopokemon;

import org.eclipse.xtext.xbase.lib.InputOutput;
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
  public void ConExperiencia50elNivelEs1() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(50);
    int _nivel = this.poka.getNivel();
    InputOutput.<Integer>println(Integer.valueOf(_nivel));
    int _nivel_1 = this.poka.getNivel();
    Assert.assertEquals(_nivel_1, 1, 0.01);
  }
  
  @Test
  public void PuntosDeAtaqueConExperiencia50Es100() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(50);
    int _puntosAtaque = this.poka.puntosAtaque();
    Assert.assertEquals(_puntosAtaque, 100, 1);
  }
  
  @Test
  public void PuntosDeSaludConExperiencia50Es200() {
    Especie _especie = new Especie(100, 200);
    this.pichachu = _especie;
    Pokemon _pokemon = new Pokemon(this.pichachu);
    this.poka = _pokemon;
    this.poka.setExperiencia(50);
    int _puntosSalud = this.poka.puntosSalud();
    Assert.assertEquals(_puntosSalud, 200, 1);
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
