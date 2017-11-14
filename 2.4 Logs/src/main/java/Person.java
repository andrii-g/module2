/**
 * Created by Andrii_Grygoruk on 10/18/2017.
 */

import org.slf4j.*;

import java.util.*;
import java.util.logging.Level;

public class Person {
    static Logger LOGGER = LoggerFactory.getLogger(Person.class);

    private String name;
    private String surname;
    private String email;
    private int childrenQuantity;
    private String hobby;


    public Person(ArrayList<Person> personArrayList, String name, String surname, String email, int childrenQuantity, String hobby) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.childrenQuantity = childrenQuantity;
        this.hobby = hobby;

        personArrayList.add(this);
        printLog(personArrayList, this);
    }

    static void printLog(ArrayList<Person> persons, Person person) {
        LOGGER.info("Statistics started: ");

        if (person.getChildrenQuantity() < 0) {
            LOGGER.warn("Person " + person.name + " has " + person.getChildrenQuantity() + " children");
        } else {
            LOGGER.info("Person " + person.name + " has " + person.getChildrenQuantity() + " children");
        }

        ArrayList<String> arrayListHobbies = new ArrayList<>();
        HashSet<String> stringHashSetHobbies = new HashSet<>();
        ArrayList<Integer> arrayListChildren = new ArrayList<>();
        HashSet<Integer> stringHashSetChildren = new HashSet<>();

        for (int i = 0; i < persons.size(); i++) {
            arrayListHobbies.add(persons.get(i).getHobby());
            stringHashSetHobbies.add(persons.get(i).getHobby());
            arrayListChildren.add(persons.get(i).getChildrenQuantity());
            stringHashSetChildren.add(persons.get(i).getChildrenQuantity());
        }

        LOGGER.debug("Hobbies statistic:");
        for (String hobby : stringHashSetHobbies) {
            int counter = Collections.frequency(new ArrayList<String>(arrayListHobbies), hobby);
            LOGGER.info(counter + " person(s) have " + hobby + " as a hobby");
        }

        LOGGER.debug("Children amount statistic:");
        for (Integer children : stringHashSetChildren) {
            int counter = Collections.frequency(new ArrayList<Integer>(arrayListChildren), children);
            LOGGER.info(counter + " person(s) have " + children + " children");
        }

        LOGGER.info("Statistics finished\n");
    }

    void printPerson() {
        System.out.println("Name:\t\t\t\t" + getName());
        System.out.println("Surname:\t\t\t" + getSurname());
        System.out.println("Email:\t\t\t\t" + getEmail());
        System.out.println("Children quantity:\t" + getChildrenQuantity());
        System.out.println("Hobby:\t\t\t\t" + getHobby());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getChildrenQuantity() {
        return childrenQuantity;
    }

    public void setChildrenQuantity(int childrenQuantity) {
        this.childrenQuantity = childrenQuantity;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
