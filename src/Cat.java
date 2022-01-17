public class Cat extends Animal{
    String mustache;
    public Cat(String name, int weight) {
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
        System.out.println("Животное Кот издает звук Мяу Мяу" );
    }
}
