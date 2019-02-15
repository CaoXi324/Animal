package animal;

public class Main {
    public static void main(String[] args) {
        Tigers tiger = new Tigers(5,200);
        System.out.println(tiger.age);
        System.out.println(tiger.weight);
        tiger.howl();
        System.out.println("老虎"+tiger.run());
        System.out.println("老虎"+tiger.eat());
    }
}
