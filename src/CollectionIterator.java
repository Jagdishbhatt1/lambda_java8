import java.util.Arrays;
import java.util.List;

public class CollectionIterator {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("jag", "bhatt", 34),
                new Person("jatin", "chauhan", 33),
                new Person("raghav", "arora", 32));
        //External Iterators
        System.out.println("using for loop");
        for (int i=0; i <people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("using for in loop");
        for (Person person : people){
            System.out.println(person);
        }

        //internal or runtime iterator
        System.out.println("using lambda loop");
        people.forEach(person -> System.out.println(person));
        people.forEach(System.out :: println); // Method reference

    }
}
