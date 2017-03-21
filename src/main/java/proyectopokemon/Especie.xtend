package proyectopokemon

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Especie {
	var int ataqueBase
	var int saludBase
	
	new (int ataque, int salud){
		ataqueBase = ataque
		saludBase = salud
	}
	
}