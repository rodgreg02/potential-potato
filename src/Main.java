import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //-----------------------------------------------------------------------------------
        Operation add = Integer::sum;
        Operation subtract = (x, y) -> x - y;
        Operation multiply = (x, y) -> x * y;
        Operation divide = (x, y) -> x / y;

        Calculator calculator = new Calculator();


        System.out.println(calculator.executeOperation(4, 2, subtract));
        System.out.println(calculator.executeOperation(2, 2, multiply));
        System.out.println(calculator.executeOperation(4, 2, divide));

        //-----------------------------------------------------------------------------------
        Filter stringLessThan5 = (string) -> string.length() < 5;
        Filterer filterer = new Filterer();
        String[] strings = {"ahhhhhhhhhh", "wreee", "ahah", "hii"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(stringLessThan5.accept(strings[i]));
        }
        //-----------------------------------------------------------------------------------
        Transformation getLength = String::length;
        Transformer transformer = new Transformer();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(getLength.transform(strings[i]));
        }

        //-----------------------------------------------------------------------------------
        Action printString = System.out::println;
        Executor executor = new Executor();
        for (int i = 0; i < strings.length; i++) {
            printString.execute(strings[i]);
        }


        //-----------------------------------------------------------------------------------
        Generator produceInt = (iterations) -> {
            int[] array = new int[iterations];
            Random random = new Random();
            for (int i = 0; i < iterations; i++) {

                array[i] = random.nextInt(1000);
            }
            return array;
        };
        Producer producer = new Producer();
        int[] array = produceInt.produce(20);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}