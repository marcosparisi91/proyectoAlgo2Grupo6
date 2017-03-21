package proyectopokemon;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.geodds.Point;
import proyectopokemon.Especie;

@Accessors
@SuppressWarnings("all")
public class Pokemon {
  private int experiencia = 0;
  
  private final Especie especie;
  
  private Point dondeEsta;
  
  public Pokemon(final Especie _especie) {
    this.especie = _especie;
  }
  
  public double getNivel() {
    double _sqrt = Math.sqrt(((100 * ((2 * this.experiencia) + 25)) + 50));
    return (_sqrt / 100);
  }
  
  public double puntosAtaque() {
    int _ataqueBase = this.especie.getAtaqueBase();
    double _nivel = this.getNivel();
    return (_ataqueBase * _nivel);
  }
  
  public double puntosSalud() {
    int _saludBase = this.especie.getSaludBase();
    double _nivel = this.getNivel();
    return (_saludBase * _nivel);
  }
  
  public Point setpunto(final double X, final double Y) {
    Point _point = new Point(X, Y);
    return this.dondeEsta = _point;
  }
  
  public double distanciaHasta(final Point punto) {
    return this.dondeEsta.distance(punto);
  }
  
  @Pure
  public int getExperiencia() {
    return this.experiencia;
  }
  
  public void setExperiencia(final int experiencia) {
    this.experiencia = experiencia;
  }
  
  @Pure
  public Especie getEspecie() {
    return this.especie;
  }
  
  @Pure
  public Point getDondeEsta() {
    return this.dondeEsta;
  }
  
  public void setDondeEsta(final Point dondeEsta) {
    this.dondeEsta = dondeEsta;
  }
}
