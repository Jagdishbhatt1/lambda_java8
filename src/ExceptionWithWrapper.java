import java.util.function.BiConsumer;

public class ExceptionWithWrapper {

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6};
        int key = 0;

        //exception handling
        process(arr, key, wrapperlambda((t,v)-> System.out.println(t/v)));

    }

    public static BiConsumer<Integer, Integer> wrapperlambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e){

                System.out.println("Exception happened");
            }
        };
    }

    public static void process(int[] arr, int key, BiConsumer<Integer, Integer> biConsumer) {
        for(int i : arr){
            //System.out.println(i);
            biConsumer.accept(i,key);
        }
    }
}
