package animales;

import color.Color;

/**
 * @author GHormigaJoel
 */

/**
 * Clase que hereda de la clase Animal , recrea un animal acuatico
 */
public class AnimalTerrestre extends Animal {
    /**
     * Atributos:
     * @param numPatas entero no negativo que contiene el numero de patas, deberia de ser short
     */
    protected int numPatas;

    /**
     * Contructor vacio
     */
    public AnimalTerrestre(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numPatas -> entero que contiene en numero de patas
     */
    public AnimalTerrestre(String nombre, String lugarDeOrigen, Color color, String sonido, int numPatas) {
        super(nombre, lugarDeOrigen, color, sonido);
        this.numPatas = Math.abs(numPatas);
    }

    /**
     * Obtiene el numero de patas del animal terrestre
     * @return numero entero no negativo
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * Setea el numero de patas
     * @param numPatas -> entero no negativo que contiene el numero de patas
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * Metodo abstracto
     */
    public void comer(){}

    /**
     * Metodo abstracto
     */
    public void correr(){}
}
