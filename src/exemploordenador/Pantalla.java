/**
 * Clase Pantalla utilizada para crear objetos(pantallas) que forman
 * parte de un ordenador
 */
package exemploordenador;
// @author irodriguezsteuerberg

public class Pantalla {
private String marca;
private float pulgadas;
public Pantalla(){
}
public Pantalla(String marca, float pulgadas){
this.marca=marca;
this.pulgadas=pulgadas;
}
/**
 * Metedo para darle valor a marca
 * @param marca 
 */
public void setMarca(String marca){
this.marca=marca;    
}
/**
 * Metodo para obtener el valor de marca
 * @return 
 */
public String getMarca(){
return marca;    
}
/**
 * Metodo para darle valor a pulgadas
 * @param pulgadas 
 */
public void setPulgadas(float pulgadas){
this.pulgadas=pulgadas;    
}
/**
 * Metodo para obtener el valor de pulgadas
 * @return 
 */
public float getPulgadas(){
return pulgadas;    
}


}
