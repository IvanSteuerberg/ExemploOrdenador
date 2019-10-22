package exemploordenador;
// @author irodriguezsteuerberg

public class Ordenador {
private Rato rato=new Rato();
private Cpu cpu=new Cpu();
private Pantalla pantalla=new Pantalla();
public Ordenador(){    
}
public Ordenador(Rato rato, Cpu cpu, Pantalla pantalla){
this.rato=rato;
this.cpu=cpu;
this.pantalla=pantalla;
}
public void setRato(Rato rato){
this.rato=rato;    
}
public Rato getRato(){
return rato;    
}
public void setCpu(Cpu cpu){
this.cpu=cpu;    
}
public Cpu getCpu (){
return cpu;    
}
public void setPantalla(Pantalla pantalla){    
}
public Pantalla getPantalla(){
return pantalla;    
}
public void amosar(){
System.out.println("O rato é: "+rato.getTipo()+"\n A pantalla é "+pantalla.getMarca()
+" e ten "+pantalla.getPulgadas()+" pulgadas"
+"\n O cpu ten unha velocidade de "+cpu.getVelocidade()+" MHz"
+" e unha memoria de "+cpu.getMemoria()+" GB");
}






}
