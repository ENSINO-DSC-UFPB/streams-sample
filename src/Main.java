import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public interface Addable{
        int add(int a, int b);
    }
    public static void main(String[] args) {

        // Lambda
//        int x = 10;
//        Runnable r = () -> {
//            System.out.println("Hello World");
//        };
//        r.run();
//        Addable sum = (a, b) -> a + b;
//        System.out.println(sum.add(1,1));

        //Optional
//        Optional<String> optional = Optional.of("Hello World");
//        Optional<Integer> optionalNullable = Optional.ofNullable(null);
//        Optional<String> optionalEmpty = Optional.empty();
//
//        if(optional.isPresent()) {
//            System.out.println(optional.get());
//        }
//        optionalEmpty.ifPresent(System.out::println);
//
//        System.out.println(optionalNullable.orElse(-1));
//        System.out.println(optionalNullable.orElseGet( () -> -2));
//        System.out.println(optionalNullable.orElseThrow(() -> new RuntimeException("Null value")));

        // Streams
//        List<String> list = Arrays.asList("a", "a", "c");
//        Stream<String> stream = list.stream();
//        String [] array = {"one", "two", "three", "four", "five", "five", "five", "five"};
//        Stream<String> stream2 = Arrays.stream(array);
//
//        List<String> result = list.stream()
//                .filter(s -> s.startsWith("a"))
//                .map(s -> s.toUpperCase())
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//
//        List<String> numbers = stream2
//                .sorted()
//                .distinct()
//                .toList();
//        System.out.println(numbers);
//
//        Arrays.stream(array).forEach(System.out::println);
//
//        Optional<String> opt = Arrays.stream(array)
//                .distinct()
//                .reduce((concatenate, item) -> concatenate + " " + item);
//        String combined = Arrays.stream(array)
//                .distinct()
//                .reduce("",(concatenate, item) -> concatenate + " " + item);
//
//        opt.ifPresent(System.out::println);
//
//        System.out.println(Arrays.stream(array).distinct().count());
//
//        List<String> result2 = Arrays.stream(array)
//                .distinct()
//                .filter(s -> s.length() > 3)
//                .map(String::toUpperCase)
//                .sorted()
//                .toList();
//        System.out.println(result2);

    //Loop vs streams

        // Loop
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        List<String> result = new ArrayList<>();

        for(String s : list){
            if(s.length() > 3){
                result.add(s.toUpperCase());
            }
        }

        Collections.sort(result);
        System.out.println(result);

        //Streams
        List<String> resutWithStreams = list.stream()
                .filter(s -> s.length() >3)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resutWithStreams);



    }

}