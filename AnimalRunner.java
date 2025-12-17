public class AnimalRunner{
    public static void main(String[]args){
        Animal animal = new Cow();
        System.out.println(animal.toString());

        animal = new Cat();
        System.out.println(animal.toString());

    }
}
abstract class Animal{
    protected String kind;

    public Animal(){  }

    public String toString(){
        return "I am a " + kind + " and I go " + speak();

    }
    public abstract String speak();
}
class Cat extends Animal{
    public Cat() {
        kind = "cat";

    }
    public String speak(){
        return "meow";
    }
}
class Cow extends Animal{
    public Cow(){
        kind = "cow";
    }
    public String speak(){
        return "moo";
    }
}