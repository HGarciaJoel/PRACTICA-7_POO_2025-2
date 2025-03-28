package animales;

import color.Color;
/**
 * @author GHormigaJoel
 */

/**
 * Clase que hereda de la clase Animal , recrea un animal acuatico
 */
public class AnimalAcuatico extends Animal {
    protected int numAletas;
    /**
     * Atributos
     * numAletas -> entero que contiene en numero de aletas
     */

    /**
     * constructor vacio
     */
    public AnimalAcuatico(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numAletas -> entero que contiene en numero de aletas
     */
    public AnimalAcuatico(String nombre, String lugarDeOrigen, Color color, String sonido, int numAletas) {
        super(nombre, lugarDeOrigen, color, sonido);
        this.numAletas = Math.abs(numAletas);
    }

    /**
     * Obtiene el nuemro de aletas
     * @return un numero entero, aunq deberia ser short
     */

    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Setea el numero de aletas
     * @param numAletas -> entero no negativo
     */

    public void setNumAletas(int numAletas) {
        this.numAletas = Math.abs(numAletas);
    }

    /**
     * Metodo abstracto
     */
    public void nadar(){}

    /**
     * Metodo abstracto
     */
    public void comer(){}
}
