package proyectopokemon

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.geodds.Point


@Accessors
class Pokemon {
	
	// Como el nivel es calculado segun la experiencia no se agrego como variable. Evitamos que se pueda setear
	//Pasa lo mismo con puntos de ataque y salud
	var int experiencia =0 
	val Especie especie
	
	var Point dondeEsta
	
	new (Especie _especie){
		especie = _especie
	}
	
	def getNivel(){
		Math.sqrt(100*(2*this.experiencia+25)+50)/100
	}
	def puntosAtaque(){
		this.especie.ataqueBase * this.getNivel
	}
	def puntosSalud(){
		this.especie.saludBase * this.getNivel
	}
	
	def setpunto (double X, double Y ){
		dondeEsta=new Point(X,Y)
	}
	
	def distanciaHasta (Point punto){
		this.dondeEsta.distance(punto)
	}
	
	
}