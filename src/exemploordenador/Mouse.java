package exemploordenador;
//@author irodriguezsteuerberg

/**
 * class Mouse used to create objects(mouses) used to create a computer
 *
 * @author irodriguezsteuerberg
 */
public class Mouse {

    private String type;

    /**
     * Constructor predetermined for the objects of the class Mouse
     */
    public Mouse() {
    }

    /**
     * Constructor with parameters for the objects of the class Mouse
     * @param type of the mouse
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * Method used to set the value of type
     * @param type sort of mouse
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *Method used to get the value of type
     * @return type of the mouse
     */
    public String getType() {
        return type;
    }

}
