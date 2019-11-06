package exemploordenador;
//@author irodriguezsteuerberg

/**
 * class Cpu used to create objects(cpus) used to create a computer
 *
 * @author irodriguezsteuerberg
 */
public class Cpu {

    private int speed;
    private int memory;

    /**
     * Constructor predetermined for the objects of the class Cpu
     */
    public Cpu() {
    }

    /**
     * Constructor with parameters for the objects of the class Cpu
     *
     * @param speed of the cpu
     * @param memory size of the memory available
     */
    public Cpu(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * Method used to set the value of speed
     *
     * @param speed of the cpu
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Method used to get the value of speed
     *
     * @return speed of the cpu
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Method used to set the value of memory
     *
     * @param memory of the cpu
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Method used to get the value of memory
     *
     * @return memory of the cpu
     */
    public int getMemory() {
        return memory;
    }

}
