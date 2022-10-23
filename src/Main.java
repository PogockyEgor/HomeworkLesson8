public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(500, 170);
        System.out.println(cow.eat());
        Tiger tiger = new Tiger(420, 140);
        System.out.println(tiger.eat());
    }
}