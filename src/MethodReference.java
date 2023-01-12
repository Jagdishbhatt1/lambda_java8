import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("jag", "bhatt", 34),
                new Person("jatin", "chauhan", 33),
                new Person("raghav", "arora", 32));




        //print all element in the list
        System.out.println("all people are:");
        printConditionally(people, p -> true, System.out :: println);// p->method(p)



    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> c) {
        for(Person person : people){
            if (predicate.test(person)){
                c.accept(person);
            }
        }
    }
}


