public class Horse extends Animal{
    int hooves;
    String mane;
    public Horse(String name, int weight) {
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
        System.out.println("Животное Конь издает звук Иго го" );
    }
}
