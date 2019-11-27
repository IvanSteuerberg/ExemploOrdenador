package exemploordenador;

import java.util.Scanner;

/**
 * Main class ExampleComputer
 *
 * @author irodriguezsteuerberg
 */
public class ExampleComputer {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.see();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o tipo de rato:");
        String type = sc.next();
        System.out.println("Introduce a marca da pantalla:");
        String brand = sc.next();
        System.out.println("Introduce as pulgadas:");
        float inches = sc.nextFloat();
        System.out.println("Introduce a velocidade do procesador (en MHz):");
        int speed = sc.nextInt();
        System.out.println("Introduce a memoria do procesador (en GB):");
        int memory = sc.nextInt();
        Mouse mouse = new Mouse(type);
        Screen screen = new Screen(brand, inches);
        Cpu cpu = new Cpu(speed, memory);
        Computer pc2 = new Computer(mouse, cpu, screen);
        pc2.see();
    }

}
