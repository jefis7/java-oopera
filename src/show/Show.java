package show;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import person.Actor;
import person.Director;

public class Show {
    protected String title;
    protected int durationInMinutes;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    protected Scanner scanner;

    public Show(String title, int durationInMinutes, Director director) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.director = director;
        this.listOfActors = new ArrayList();
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Actor> getListOfActors() {
        return this.listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addActor(Actor newActor) {
        boolean alreadyExists = false;

        for(Actor actor : this.listOfActors) {
            if (actor.equals(newActor)) {
                alreadyExists = true;
                break;
            }
        }

        if (alreadyExists) {
            System.out.printf("Актёр %s уже добавлен в список", newActor);
        } else {
            this.listOfActors.add(newActor);
            System.out.printf("Актёр %s успешно добавлен\n", newActor);
        }

    }

    public void printActors() {
        if (this.listOfActors.isEmpty()) {
            System.out.printf("В представлении '%s' пока нет актёров\n", this.title);
        } else {
            System.out.printf("Список актёров представления '%s':\n", this.title);

            for(Actor actor : this.listOfActors) {
                System.out.println(actor);
            }

        }
    }

    public boolean isActorReplaced(Actor newActor, String surnameToReplace) {
        ArrayList<Integer> indexes = new ArrayList();

        for(int i = 0; i < this.listOfActors.size(); ++i) {
            if (((Actor)this.listOfActors.get(i)).getSurname().equalsIgnoreCase(surnameToReplace)) {
                indexes.add(i);
            }
        }

        if (indexes.isEmpty()) {
            System.out.println("Актёр с фамилией '" + surnameToReplace + "' не найден!");
            return false;
        }
        if (indexes.size() == 1) {
            int index = indexes.get(0);
            Actor oldActor = listOfActors.set(index, newActor);
            System.out.println("Заменен " + oldActor.toString() + " на " + newActor.toString());
            return true;
        } else {
            System.out.println("Найдено " + indexes.size() + " актёра с фамилией '" + surnameToReplace + "':");
            for(int i = 0; i < indexes.size(); ++i) {
                int actorIndex = indexes.get(i);
                System.out.println("[" + (i + 1) + "]" + listOfActors.get(actorIndex));
            }

            System.out.println("Введите номер актёра, которого необходимо заменить:");
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: нужно ввести число!");
                scanner.next();
                return false;
            } else {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= indexes.size()) {
                    int index = indexes.get(choice - 1);
                    Actor oldActor = listOfActors.set(index, newActor);
                    System.out.println("Заменен " + oldActor.toString() + " на " + newActor.toString());
                    return true;
                } else {
                    System.out.println("Ошибка: неверный номер!");
                    return false;
                }
            }
        }
    }
}