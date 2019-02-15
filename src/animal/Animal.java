package animal;

public class Animal {
    protected int age;
    protected int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getWeight() {

        return weight;
    }

    public String run() {
        String run = "可以跑";
        return run;
    }

    public String eat() {

        String eat="需要吃东西";
        return eat;
    }
}
