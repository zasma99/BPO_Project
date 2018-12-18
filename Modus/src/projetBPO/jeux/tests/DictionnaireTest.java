package projetBPO.jeux.tests;

import org.junit.jupiter.api.BeforeEach;
import projetBPO.jeux.Dictionnaire;

import static org.junit.jupiter.api.Assertions.*;

class DictionnaireTest {

    private Dictionnaire dico ;
    protected String[] words;
    private String mot , mot1;


    @BeforeEach
    void setUp(){
        dico = new Dictionnaire();
        words = new String[]{"Avion" , "Chien", "Vache"};
        //System.out.println(words[0]);
        mot = "Avion";
        mot1 = "Game";
    }

    @org.junit.jupiter.api.Test
    void setMots() {
        dico.setMots(words);
        assertEquals(words.length ,dico.nbMots());
    }

    @org.junit.jupiter.api.Test
    void setMots1() {
    }

    @org.junit.jupiter.api.Test
    void contient() {
        dico.setMots(words);
        assertTrue(dico.contient(mot));
        assertFalse(dico.contient(mot1));
    }

    @org.junit.jupiter.api.Test
    void toStringTest(){
        for(String mot : words) {
            assertEquals(mot, mot.toString());
        }
        for(String word : words) {
            assertNotSame(mot, mot1.toString());
        }
    }

    @org.junit.jupiter.api.Test
    void iterator(){
        //dico.setMots(words);
    }
}