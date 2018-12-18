package projetBPO.jeux.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projetBPO.jeux.Dictionnaire;
import projetBPO.jeux.IEtat;
import projetBPO.jeux.JeuDeMots;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static projetBPO.jeux.JeuDeMots.setDico;

class JeuDeMotsTest {
    private Dictionnaire dico ;
    private JeuDeMots jeu , jeu0 , jeu1;
    private String[] word;
    private String var;
    private Iterator<IEtat> it ;
    private IEtat elm , elm1;

    @BeforeEach
    void setUp(){
        word = new String[]{"rage","is","the","real","zzzs"};
        dico = new Dictionnaire();

        var = "Gare";

        jeu = new JeuDeMots("Gare");
        jeu0 = new JeuDeMots("zzzs");
        jeu1 = new JeuDeMots("gras");


    }


    @Test
    void iterator() {
        dico.setMots(word);
        setDico(dico);

        it = jeu.iterator();
        elm = it.next();
        assertTrue(jeu0.equals(elm));
        /*elm1 = it.next();
        assertEquals(elm1 , jeu1);

        assertFalse(it.hasNext());*/
    }


}