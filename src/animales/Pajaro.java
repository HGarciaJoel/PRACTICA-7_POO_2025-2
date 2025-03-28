package animales;

import color.Color;

/**
 * @author GHormigaJoel
 */

/**
 * Clase que recrea una ballena, hereda de AnimalAcuatico
 */
public class Pajaro extends AnimalAereo {
    /**
     * Atributos:
     * @param tipoPico -> cadena que contiene el nombre de un material
     */
    private String tipoPico;

    /**
     * Contructor vacio
     */
    public Pajaro(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numAlas -> entero que contiene en numero de alas
     * @param tipoPico -> cadena que contiene el nombre de un material
     */
    public Pajaro(String nombre, String lugarDeOrigen, Color color, String sonido, int numAlas, String tipoPico) {
        super(nombre, lugarDeOrigen, color, sonido, numAlas);
        this.tipoPico = tipoPico;
    }

    /**
     * Ontiene el tipoPico
     * @return una cadena con el nombre del material de pico
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * setea el tipo pico
     * @param tipoPico -> cadena que contiene el nombre de un material
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /**
     * Metodo abstracto
     */
    public void recolectarRamas(){}
}
