package exemploordenador;
// @author irodriguezsteuerberg

/**
 * class Computer used to create objects(computers) made out of other objects
 *
 * @author irodriguezsteuerberg
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Cpu cpu = new Cpu();
    private Screen screen = new Screen();

    /**
     * Constructor predetermined for the objects of the class Computer
     */
    public Computer() {
    }

    /**
     * Constructor with parameters for the objects of the class Computer
     *
     * @param mouse of the computer
     * @param cpu of the computer
     * @param screen of the computer
     */
    public Computer(Mouse mouse, Cpu cpu, Screen screen) {
        this.mouse = mouse;
        this.cpu = cpu;
        this.screen = screen;
    }

    /**
     * Method used to set the value of mouse
     * @param mouse of the computer
     */
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Method used to get the value of mouse 
     * @return mouse of the computer
     */
    public Mouse getMouse() {
        return mouse;
    }

    /**
     * Method used to set the value of cpu
     * @param cpu of the computer
     */
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Method used to get the value of cpu
     * @return cpu of the computer
     */
    public Cpu getCpu() {
        return cpu;
    }

    /**
     * Method used to set the value of screen
     * @param screen of the computer
     */
    public void setScreen(Screen screen) {
    }

    /**
     * Method used to get the value of screen
     * @return screen of the computer
     */
    public Screen getScreen() {
        return screen;
    }

    /** 
     * Method used to print on screen all the information of the computer
     */
    public void see() {
        System.out.println("O rato é: " + mouse.getType() + "\n A pantalla é " + screen.getBrand()
                + " e ten " + screen.getInches() + " pulgadas"
                + "\n O cpu ten unha velocidade de " + cpu.getSpeed() + " MHz"
                + " e unha memoria de " + cpu.getMemory() + " GB");
    }

}
