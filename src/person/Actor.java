package person;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String var10000 = this.name;
        return "Actor{name='" + var10000 + "', surname='" + this.surname + "', gender=" + String.valueOf(this.gender) + "', height=" + this.height + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Actor actor = (Actor)o;
            return Objects.equals(super.name, actor.name) && Objects.equals(super.surname, actor.surname) && Objects.equals(super.gender, actor.gender) && this.height == actor.height;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash += super.name != null ? super.name.hashCode() : 0;
        hash = 31 * hash + (super.surname != null ? super.surname.hashCode() : 0);
        hash = 31 * hash + (super.gender != null ? super.gender.hashCode() : 0);
        hash = 31 * hash + this.height;
        return hash;
    }
}