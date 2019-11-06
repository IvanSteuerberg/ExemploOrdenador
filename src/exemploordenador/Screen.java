package exemploordenador;

/**
 * class Screen used to create objects(screens) used to create a computer
 *
 * @author irodriguezsteuerberg
 */
public class Screen {

    private String brand;
    private float inches;

    /**
     * Interface predetermined for the objects of the class Screen
     */
    public Screen() {
    }

    /**
     * Interface with parameters for the objects of the class Screen
     *
     * @param brand manufacturer of the screen
     * @param inches size of the screen
     */
    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     * Method used to set the value of brand
     *
     * @param brand manufacturer of the screen
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Method used to get the value of brand
     *
     * @return brand of the screen
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Method used to set the value of inches
     *
     * @param inches size of the screen
     */
    public void setInches(float inches) {
        this.inches = inches;
    }

    /**
     * Method used to get the value of inches
     *
     * @return inches of the screen
     */
    public float getInches() {
        return inches;
    }

}
