package projetBPO.jeux;

import java.util.ArrayList;
import java.util.Iterator;

public class JeuDeMots extends EtatAvecEtatFinalPredefini {
    static Dictionnaire dico;
    private String word ;

    public JeuDeMots(String mot){
        this.word = mot;
    }


    public static void setDico(Dictionnaire dico) {
        JeuDeMots.dico = dico;
    }

    public Iterator<IEtat> iterator(){

        ArrayList<IEtat> succ = new ArrayList<>();

        //String s ; int compteur = 0;


        StringBuilder mot = new StringBuilder(this.word);
        JeuDeMots possible ;
        StringBuilder apn = new StringBuilder(this.word);
        for (int nol = 0; nol < apn.length(); nol++) {
            for (char lettre = 'a'; lettre <= 'z'; lettre++){
                if(apn.charAt(nol) != lettre){
                    mot.setCharAt(nol , lettre);
                    System.out.println("Mot testé "+ mot);

                    if(dico.contient(mot.toString())) {
                        possible = new JeuDeMots(mot.toString());
                        succ.add(possible);
                    }

                }

            }
        }

       /* for(int i = 0 ; i< dico.nbMots() ; i++){
            s = dico.wordAt(i);
            if (s.length() == word.length()) {
                for (int j = 0 ; j < word.length() ; j++) {
                    if (s.toLowerCase().charAt(j) != word.toLowerCase().charAt(j)){
                        compteur++;
                    }
                    if (compteur > 1){
                        j = word.length();
                    }else{
                       //potential.add(s);
                    }


                }
            }
        }*/

        return succ.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JeuDeMots iEtats = (JeuDeMots) o;

        return word.equals(iEtats.word);
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }


    @Override
    public String toString() {
        return "JeuDeMots{" + "word='" + word + '\'' + '}';
    }
}
