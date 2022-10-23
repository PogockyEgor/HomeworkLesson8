public class Cow extends Animal{

    public Cow(int weight, int height) {
        super(weight, height);
    }

    @Override
    public String eat() {
        return "I'm eating grass";
    }
}
