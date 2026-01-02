import models.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    people.add(new Employee("Fogel", "McLovin", "Musician", 68045.78));
    people.add(new Employee("Charlie", "Kirk", "Guitarist", 59340.00));
    people.add(new Student("Donald", "Tramp", 2.0));
    people.add(new Student("John", "Cena", 3.5));

    Collections.sort(people);

    printData(people);
  }

  public static void printData(Iterable<Person> payables) {
    for (Person p : payables) {
      System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
    }
  }
}