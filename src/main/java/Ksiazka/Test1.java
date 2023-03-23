package Ksiazka;

import org.junit.Test;

import java.util.Objects;


public class Test1 {
    @Test
    public void listaKsiazek() {
        Ksiazka wydrukowana = new Ksiazka.Ksiazka1Builder().autor("Autor1").nrISBN("nrISBN")
                .rokWydania("Rok").wydawnictwo("Wyd").tytul("Tytył1").build();
        Ksiazka ebook = new Ksiazka.Ksiazka1Builder().autor("Autor2").tytul("Tytył2").build();
        System.out.println(wydrukowana);
        System.out.println("ebook: " + ebook);
    }

}
