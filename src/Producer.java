public class Producer {
    public int[] produce(int iterations, Generator generator) {
        return generator.produce(iterations);
    }
}
