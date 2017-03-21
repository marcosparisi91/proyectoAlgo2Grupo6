package proyectopokemon;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Especie {
  private int ataqueBase;
  
  private int saludBase;
  
  public Especie(final int ataque, final int salud) {
    this.ataqueBase = ataque;
    this.saludBase = salud;
  }
  
  @Pure
  public int getAtaqueBase() {
    return this.ataqueBase;
  }
  
  public void setAtaqueBase(final int ataqueBase) {
    this.ataqueBase = ataqueBase;
  }
  
  @Pure
  public int getSaludBase() {
    return this.saludBase;
  }
  
  public void setSaludBase(final int saludBase) {
    this.saludBase = saludBase;
  }
}
