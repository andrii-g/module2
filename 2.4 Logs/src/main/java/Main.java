import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.*;

/**
 * Created by Andrii_Grygoruk on 10/18/2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();

        Person person1 = new Person(personArrayList,"Joe", "Garden", "j@g.com", 0, "ski");

        Person person2 = new Person(personArrayList, "Mike", "Mou", "m@m.com", 1, "trips");

        Person person3 = new Person(personArrayList, "Kyle", "Walker", "k@2.com", 2, "football");

        Person person4 = new Person(personArrayList, "Raheem", "Sterling", "r@2.com", -2, "football");

        Person person5 = new Person(personArrayList, "David", "Silva", "d@2.com", 1, "football");

    }

}
