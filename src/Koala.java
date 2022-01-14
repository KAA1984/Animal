public class Koala extends Animal{
    public Koala(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
        System.out.println("Животное Коала издает звук ХМ Хм" );
    }
}
