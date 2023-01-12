import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaWays {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("jag", "bhatt", 34),
                new Person("jatin", "chauhan", 33),
                new Person("raghav", "arora", 32));


        //sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

       /* Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });*/

        //print all element in the list
        System.out.println("all people are:");
       // printAll(people);
        printConditionally(people, (p -> true));
        System.out.println();

        //print all people that have last name starts with b

        printConditionally(people, (p -> p.getLastName().startsWith("c")));

        /*printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("a");
            }
        });*/
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person person : people){
            if (condition.test(person)){
                System.out.println(person);
            }
        }
    }


   /* private static void printAll(List<Person> people) {
        for(Person person: people){
            System.out.println(person);
        }
    }*/

}
