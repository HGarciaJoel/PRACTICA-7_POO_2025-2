package color;

/**
 * @author GHormigaJoel
 */

/**
 * Clase que hereda de la clase Animal , recrea un animal acuatico
 */
public class Color {
    /**
     * Atributos:
     * @param colorName -> cadena que se refiere al nombre del color
     * @param code -> cadena qque se refiere a un codigo hexadecimal: inicia con un # degido de 6 caracteres desde A hasta F
     */
    private String colorName;
    private String code;

    /**
     * Contructor vacio
     */
    public Color(){}

    /**
     * Contructor total
     * @param colorName -> cadena que contiene un nombre
     * @param code -> cadena hexadecimal
     */
    public Color(String colorName, String code){
        this.colorName = colorName;
        this.code = code;
    }

    /**
     * Obtiene el nombre del color
     * @return una cadena con un nombre
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * setea el nombre
     * @param colorName -> cadena que se refiere al nombre del color
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * obtiene un codigo hexadecimal
     * @return cadena con un codigo hexadecimal
     */
    public String getCode() {
        return code;
    }

    /**
     * setea un codigo
     * @param code -> cadena qque se refiere a un codigo hexadecimal: inicia con un # degido de 6 caracteres desde A hasta F
     */
    public void setCode(String code) {
        this.code = code;
    }
}
