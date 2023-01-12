import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaFunctionPredicate {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("jag", "bhatt", 34),
                new Person("jatin", "chauhan", 33),
                new Person("raghav", "arora", 32));


        //sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //print all element in the list
        System.out.println("all people are:");
        printConditionally(people, (p -> true));

        //print all people that have last name starts with b
        printConditionally(people, (p -> p.getLastName().startsWith("c")));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for(Person person : people){
            if (predicate.test(person)){
                System.out.println(person);
            }
        }
    }
}
