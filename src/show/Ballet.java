package show;

import person.Director;
import person.Person;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int durationInMinutes, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, durationInMinutes, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return this.choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}