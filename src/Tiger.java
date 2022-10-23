public class Tiger extends Animal{

    public Tiger(int weight, int height) {
        super(weight, height);
    }

    @Override
    public String eat() {
        return "I'm eating cow";
    }
}
