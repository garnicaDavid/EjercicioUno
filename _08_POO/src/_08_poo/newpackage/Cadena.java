/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _08_poo.newpackage;

/**
 *
 * @author David
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return frase.length();
    }
    
//-------------------------------------------
//------------M E T O D O S------------------
    
    public void mostrarVocales(){
    int contar = 0;
    String vocal;
    for(int i=0;i<longitud;i++){
    vocal = frase.substring(i,i+1);
        switch(vocal){
            case "a":
            case "A": contar +=1;
            continue;
            case "e":
            case "E": contar +=1;
            continue;
            case "i":
            case "I": contar +=1;
            continue;
            case "o":
            case "O": contar +=1;
            continue;
            case "u":
            case "U": contar +=1;
        }
    }
        System.out.println("Hay "+contar+" vocales");
    }
    
    public void invertirFrase(){
    String text ="";
    for(int i=longitud; i>0;i--){
        text += frase.substring(i-1,i);
    }
        System.out.println(text);
    }
    
    public void vecesRepetido(String letra){
    String caracter;
    int contador=0;
    for(int i=0; i<longitud;i++){
        caracter= frase.substring(i,i+1);
        if (letra.equals(caracter)){
        contador +=1;
        }
    }
        System.out.println("El caracter '"+letra+"' se repite "+contador+" veces.");
    }
    
    public void compararLongitud(String frase1){
        System.out.println("Longitud de "+frase1+" = "+(frase1.length()));
        System.out.println("Londitud de "+frase+" = "+ longitud);
    }
    
    public void unirClases(String frase2){
        System.out.println(frase + frase2);
    }
    
    public void reemplazar(String letra1){
    System.out.println(frase.replace("a", letra1));
    
    }
    
    public boolean contiene(String letra2){
    boolean log= frase.contains(letra2); 
    return log;
    }
    
}
