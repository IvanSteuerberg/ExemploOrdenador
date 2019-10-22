package exemploordenador;

//@author irodriguezsteuerberg
import java.util.Scanner;

public class ExemploOrdenador {

    public static void main(String[] args) {
        Ordenador pc = new Ordenador();
        pc.amosar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o tipo de rato:");
        String tipo = sc.next();
        System.out.println("Introduce a marca da pantalla:");
        String marca = sc.next();
        System.out.println("Introduce as pulgadas:");
        float pulgadas = sc.nextFloat();
        System.out.println("Introduce a velocidade do procesador (en MHz):");
        int velocidade = sc.nextInt();
        System.out.println("Introduce a memoria do procesador (en GB):");
        int memoria = sc.nextInt();
        Rato rato=new Rato (tipo);
        Pantalla pantalla=new Pantalla(marca,pulgadas);
        Cpu cpu=new Cpu(velocidade,memoria);
        Ordenador pc2=new Ordenador(rato,cpu,pantalla);
        pc2.amosar();
    }

}
