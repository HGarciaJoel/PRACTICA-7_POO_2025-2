package animales;

import color.Color;

/**
 * @author GHormigaJoel
 */

/**
 * Clase que recrea una ballena, hereda de AnimalAcuatico
 */

public class Ballena extends AnimalAcuatico {
    /**
     * Atributos:
     * @param largo -> entero no negativo de medita, en m, desde la nariz hasta la cola
     */
    private int largo;

    /**
     * Contructor vacio
     */
    public Ballena(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numAletas -> entero que contiene en numero de patas
     * @param largo -> entero no negativo de medita, en m, desde la nariz hasta la cola
     */
    public Ballena(String nombre, String lugarDeOrigen, Color color, String sonido, int numAletas,int largo) {
        super(nombre, lugarDeOrigen, color, sonido, numAletas);
        this.largo = largo;
    }

    /**
     * Obtiene el largo del animal
     * @return un numero entero, simoliza metros
     */

    public int getLargo() {
        return largo;
    }

    /**
     * Setea el largo de la ballena
     * @param largo -> entero no negativo de medita, en m, desde la nariz hasta la cola
     */
    public void setLargo(int largo) {
        this.largo = Math.abs(largo);
    }

    /**
     * Metodo abstracto
     */
    public void pelearConPinocho(){}
}
