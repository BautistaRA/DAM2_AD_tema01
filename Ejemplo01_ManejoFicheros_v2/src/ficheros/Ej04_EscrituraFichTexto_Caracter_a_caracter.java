package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej04_EscrituraFichTexto_Caracter_a_caracter {

    public static void main(String[] args) throws IOException {
        File fichero = new File(".\\Prueba\\FichTexto.txt"); //declaración del fichero y ruta donde se guarda        
        FileWriter fic = new FileWriter(fichero);             //flujo de salida       
        String cadena = "En resolución, él se enfrascó tanto en su lectura, que se le pasaban las noches leyendo de claro en claro, y los días de turbio en turbio, y así, del poco dormir y del mucho leer, se le secó el cerebro, de manera que vino a perder el juicio. Llenósele la fantasía de todo aquello que leía en los libros, así de encantamientos como de pendencias, batallas, desafíos, heridas, requiebros, amores, tormentas y disparates imposibles; y asentósele de tal modo en la imaginación que era verdad toda aquella máquina de aquellas sonadas soñadas invenciones que leía.";
        char[] cad = cadena.toCharArray(); //convierte la cadena en array de caracteres
        for (int i = 0; i < cad.length; i++) {
            fic.write(cad[i]);         //se va escribiendo un carácter
        }
        fic.append('.');           //añado al final un .
        fic.close();               //cerrar fichero 
    }
}
