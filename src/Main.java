import animales.Perro;
import color.Color;

/**
 * @author HGarcia Joel
 */

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("firu","calle",new Color("Negro","#00000"), "guau", 4,
                new Color("","#FFFFFF"));

        p1.hacerSonido();
    }
}