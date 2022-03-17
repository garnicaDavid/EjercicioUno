/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _08_poo;

import _08_poo.newpackage.Cadena;
import java.util.Scanner;

/**
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 * @author David
 */
public class _08_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        Cadena m1 = new Cadena(leer.next(), 0);
        m1.mostrarVocales();
        m1.invertirFrase();
        System.out.println("Ingrese el caracter a buscar:");
        m1.vecesRepetido(leer.next());
        System.out.println("Ingrese una frase a comparar!");
        m1.compararLongitud(leer.next());
        System.out.println("Ingresar frase a concatenar");
        m1.unirClases(leer.next());
        System.out.println("Reemplazar el caracter 'a' con...");
        m1.reemplazar(leer.next());
        System.out.println("Ingrese una letra y buscar si está en la frase");
        if(m1.contiene(leer.next())){
            System.out.println("La letra se encuentra en la frase!!");
        } else{
            System.out.println("La letra no se encuentra en la frase :(");
        }
    }
    
}
