package Ksiazka;

import com.google.gson.Gson;

public class Ksiazka {

    public final String tytul;
    public final String autor;
    public final String rokWydania;
    public final String wydawnictwo;
    public final String nrISBN;

    public Ksiazka(String tytul, String autor, String rokWydania, String wydawnictwo, String nrISBN) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
        this.nrISBN = nrISBN;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    static class Ksiazka1Builder {

        private String tytul;
        private String autor;
        private String rokWydania;
        private String wydawnictwo;
        private String nrISBN;


        public Ksiazka1Builder tytul(String tytul) {
            this.tytul = tytul;
            return this;
        }

        public Ksiazka1Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Ksiazka1Builder rokWydania(String rokWydania) {
            this.rokWydania = rokWydania;
            return this;
        }

        public Ksiazka1Builder wydawnictwo(String wydawnictwo) {
            this.wydawnictwo = wydawnictwo;
            return this;
        }
        public Ksiazka1Builder nrISBN(String nrISBN) {
            this.nrISBN = nrISBN;
            return this;
        }

        public Ksiazka build() {
            return new Ksiazka(tytul, autor, rokWydania, wydawnictwo, nrISBN);
        }
    }
}
