import java.util.function.BiConsumer;

public class Exceptionhandling {

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6};
        int key = 0;
        process(arr, key, (t,v)-> System.out.println(t+v));

        //exception handling
        process(arr, key, (t,v)-> {
            try {
                System.out.println(t/v);
            } catch (ArithmeticException exception){
                System.out.println("Exception happened");
            }
        });


    }

    public static void process(int[] arr, int key, BiConsumer<Integer, Integer> biConsumer) {
        for(int i : arr){
            //System.out.println(i);
            biConsumer.accept(i,key);
        }
    }
}
