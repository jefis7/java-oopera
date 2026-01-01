import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Николай", "Болонский", Gender.MALE, 184);
        Actor actor2 = new Actor("Tom", "Hardy", Gender.MALE, 182);
        Actor actor3 = new Actor("Scarlett", "Johansson", Gender.FEMALE, 176);
        Actor actor4 = new Actor("Степан", "Иванов", Gender.MALE, 180);
        Actor actor5 = new Actor("Иван", "Иванов", Gender.MALE, 178);
        Director director1 = new Director("Дмитрий", "Кондратьев", Gender.MALE, 10);
        Director director2 = new Director("Алексей", "Балабанов", Gender.MALE, 30);
        Person musicAuthor = new Person("Алексей", "Дубинский", Gender.MALE);
        Person choreographer = new Person("Анастасия", "Калачёва", Gender.FEMALE);
        Show drama = new Show("Огни ночного города", 120, director2);
        Opera opera = new Opera("Одиссея", 180, director1, musicAuthor, "Это эпическое произведение, основанное на древнегреческой поэме Гомера", 8);
        Ballet ballet = new Ballet("Шаг вперёд", 80, director1, musicAuthor, "История любви танцора - преступника из низов общества и балерины из престижной школы искусств.", choreographer);
        drama.addActor(actor1);
        drama.addActor(actor2);
        drama.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor3);
        drama.printActors();
        opera.printActors();
        ballet.printActors();
        if (ballet.isActorReplaced(actor2, "Болонский")) {
            System.out.println("Замена актёров прошла успешно.");
        } else {
            System.out.println("Замена не состоялась! Попробуйте ещё раз.");
        }

        ballet.printActors();
        if (opera.isActorReplaced(actor3, "Сидоров")) {
            System.out.println("Замена актёров прошла успешно.");
        } else {
            System.out.println("Замена не состоялась! Попробуйте ещё раз.");
        }

        opera.addActor(actor4);
        opera.addActor(actor5);
        opera.printActors();
        if (opera.isActorReplaced(actor3, "Иванов")) {
            System.out.println("Замена актёров прошла успешно.");
        } else {
            System.out.println("Замена не состоялась! Попробуйте ещё раз.");
        }

        opera.printActors();
    }
}
