package animales;

import color.Color;

/**
 * @author GHormigaJoel
 */

/**
 * Clase que hereda de la clase Animal , recrea un animal acuatico
 */
public class Perro extends AnimalTerrestre {
    /**
     * Atributos:
     * @param colorDeCorrea ->  Objeto de la calse Color que contiene el nombre de un color o un codig hexadecimal
     */
    private Color colorDeCorrea;

    /**
     * constructor vacio
     */
    public Perro() {}

    /**
     * Atributos:
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     * @param numPatas -> entero que contiene en numero de patas
     * @param colorDeCorrea  -> Clase que contiene el nombre del color o codigo hexadecimal
     */
    public Perro(String nombre, String lugarDeOrigen, Color color, String sonido, int numPatas, Color colorDeCorrea) {
        super(nombre, lugarDeOrigen, color, sonido, numPatas);
        this.colorDeCorrea = colorDeCorrea;
    }

    /**
     * Obtiene un Objeto de la clase Color
     * @return regresa un objeto de la clase color
     */

    public Color getColorDeCorrea() {
        return colorDeCorrea;
    }

    /**
     * Setea el color de correa
     * @param colorDeCorrea -> objeto que guarda el nombre del color o  un codigo hexadecimal en formato de ecadena
     */
    public void setColorDeCorrea(Color colorDeCorrea) {
        this.colorDeCorrea = colorDeCorrea;
    }

    /**
     * Metodo abstracto
     */
    public void hacerTarea(){}
}
