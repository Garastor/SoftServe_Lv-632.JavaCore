package lesson3.HW3;

import lesson3.HW3.model.Person;
import lesson3.HW3.utils.OperationPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW3App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OperationPerson operationPerson = new OperationPerson();
        System.out.println("Hello! ");
        List<Person> personList = new ArrayList<Person>();

        Person person1 = new Person("Anton","Sh");
        person1.changeName("Denys","Sh");
        operationPerson.output(person1);

        personList.add(person1);
        personList.add(new Person("Max","Sh"));
        personList.add(new Person("Makar","Sh"));
        personList.add(new Person("Anton","Sh"));
        personList.add(new Person("Alex","Sh"));

        for (Person person : personList) {
            person.setbYear(Integer.parseInt(operationPerson.input(reader)));
            System.out.println("Your age: " + operationPerson.getAge(person));
            operationPerson.output(person);
        }
    }

}
