package animales;

import color.Color;
/**
 * @author GHormigaJoel
 */

/**
 * Clase que recrea la base de un animal
 */

public class Animal {
    protected String nombre;
    protected String lugarDeOrigen;
    protected Color color;
    protected String sonido;
    /**
     * Atributos
     * @param nombre -> Cadena que se refiere al nombre del animal
     * @param lugarDeOrigen -> cadena de lugar de origen en formato: provincia/ciudad/pais
     * @param color -> cadena de lugar de origen en formato: provincia/ciudad/pais
     */

    /**
     * Contructor vacio
     */

    public Animal(){}

    /**
     * Constructor total
     * @param nombre -> nombre del animal
     * @param lugarDeOrigen -> lugar de origen en formato: provincia/ciudad/pais
     * @param color -> Clase que contiene el nombre del color o codigo hexadecimal
     * @param sonido -> Cadena abstracta
     */
    public Animal(String nombre, String lugarDeOrigen, Color color, String sonido) {
        this.setNombre(nombre);
        this.setLugarDeOrigen(lugarDeOrigen);
        this.setColor(color);
        this.setSonido(sonido);
    }

    /**
     * Obtienen el nombre del lugar
     * @return regresa una cadena que contiene el nombre del animal
     */

    private String getNombre() {
        return nombre;
    }

    /**
     * setea el nombre del animal
     * @param nombre -> nombre del animal
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *  Obtiene una cadena que descirbe el lugar de origen
     * @return -> cadena de lugar de origen en formato: provincia/ciudad/pais
     */
    private String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    /**
     * Setea el lugar de origen
     * @param lugarDeOrigen -> cadena
     */

    private void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    /**
     * Obtiene un objeto de la clase color
     * @return -> Clase que contiene el nombre del color o codigo hexadecimal
     */
    private Color getColor() {
        return color;
    }

    /**
     * setea un objeto como color
     * @param color -> cadena que contiene el nombre de color o un codigo hexadedcimal
     */
    private void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtiene una cadena
     * @return sonido -> cadena abstracta
     */
    private String getSonido() {
        return sonido;
    }

    /**
     * setea un sonido
     * @param sonido cadena que simboliza un sonido
     */

    private void setSonido(String sonido) {
        this.sonido = sonido;
    }

    /**
     * imprime el sonido del animal
     */

    public void hacerSonido(){
        System.out.println(sonido);
    }

    /**
     * imprime un mensaje de comer junto al nombre del animal
     */
    public void comer(){
        System.out.println(getNombre() + " esta alimentandose...");
    }
}
