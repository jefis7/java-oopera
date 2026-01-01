package show;

import person.Director;
import person.Person;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int durationInMinutes, Director director, Person musicAuthor, String librettoText) {
        super(title, durationInMinutes, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return this.musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return this.librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.printf("Текст либретто представления '%s':\n", this.title);
        System.out.println(this.librettoText);
    }
}