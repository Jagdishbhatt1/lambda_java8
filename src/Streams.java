import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("jag", "bhatt", 34),
                new Person("jatin", "chauhan", 33),
                new Person("raghav", "arora", 32));

        people.stream().filter(t -> t.getLastName().startsWith("b")).forEach(System.out :: println);

    }
}
