package show;

import person.Director;
import person.Person;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int durationInMinutes, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, durationInMinutes, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return this.choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}