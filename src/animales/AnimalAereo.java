package animales;

import color.Color;
/**
 * @author GHormigaJoel
 */

/**
 * Clase que hereda de la clase Animal , recrea un Animal Areo
 */
public class AnimalAereo extends Animal {
    protected int numAlas;
    /**
     * Atributos
     * numAlas -> entero no negativo que deberia ser corto
     */

    /**
     * Contructor vacio
     */
    public AnimalAereo(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numAlas -> entero que contiene en numero de aletas
     */
    public AnimalAereo(String nombre, String lugarDeOrigen, Color color, String sonido, int numAlas) {
        super(nombre, lugarDeOrigen, color, sonido);
        this.numAlas = Math.abs(numAlas);
    }

    /**
     * Obtiene el nuemro de alas
     * @return un numero entero, aunque deberia ser short
     */
    public int getNumAlas() {
        return numAlas;
    }

    /**
     * Setea el numero de aletas
     * @param numAlas -> entero no negativo
     */

    public void setNumAlas(int numAlas) {
        this.numAlas = Math.abs(numAlas);
    }

    /**
     * Metodo abstracto
     */
    public void volar(){}

    /**
     * Metodo abstracto
     */
    public void comer(){}
}
