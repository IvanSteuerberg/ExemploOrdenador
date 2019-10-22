package exemploordenador;
//@author irodriguezsteuerberg
 
public class Cpu {
private int velocidade;
private int memoria;
public Cpu(){    
}
public Cpu(int velocidade, int memoria){
this.velocidade=velocidade;
this.memoria=memoria;
}
public void setVelocidade(int velocidade){
this.velocidade=velocidade;    
}
public int getVelocidade(){
return velocidade;    
}
public void setMemoria(int memoria){
this.memoria=memoria;    
}
public int getMemoria(){
return memoria;    
}


}
