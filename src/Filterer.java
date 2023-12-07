public class Filterer {
    public boolean filter(String string,Filter filter){
        return filter.accept(string);
    }
}
