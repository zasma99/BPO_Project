package projetBPO.jeux;

import java.util.Iterator;
import java.util.*;
import java.io.*;

public class Dictionnaire implements Iterable<String>{

    private ArrayList<String> als ;

    public Dictionnaire(){
      this.als = new ArrayList<>();

    }


    public void setMots(String ... mots ){
        for(int i = 0 ; i < mots.length ; i++){
            als.add(mots[i].toLowerCase());
        }
    }

    public void setMots(String nomFichier){
        FileReader flot ;
        BufferedReader flotFiltre ;

        try {
            flot = new FileReader(nomFichier) ;
            flotFiltre = new BufferedReader(flot) ;
            String ligne = flotFiltre.readLine();
            while (ligne != null) {
                ligne = flotFiltre.readLine() ;
                als.add(ligne.toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Données entrées incorrectes");
        }


    }

    public boolean contient(String mot){
        //System.out.println(als.contains(mot));
        System.out.println(mot + " " + als.contains(mot.toLowerCase()));
        return (als.contains(mot.toLowerCase())) ;

    }

    public int nbMots (){
        return als.size();
    }

    public Iterator<String> iterator(){
        Iterator<String> it = als.iterator();
        return it;
    }

    public String toString(){
        StringBuilder retour = new StringBuilder() ;

        for( String s : als ){
            System.out.println(s);
            retour.append(s);
            retour.append(",");
        }
        return retour.toString() ;
    }

    public String wordAt( int index ){
        return (als.get(index));
    }

    public static void main(String[] args){
        Dictionnaire dico = new Dictionnaire();
        String[] words = {"avion" , "chat" , "maison"};
        dico.setMots(words);
    }
}
