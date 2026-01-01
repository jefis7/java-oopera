package person;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return this.numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public String toString() {
        String var10000 = this.name;
        return "Director{name='" + var10000 + "', surname='" + this.surname + "', gender=" + String.valueOf(this.gender) + "', numberOfShows=" + this.numberOfShows + "}";
    }
}
