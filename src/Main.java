public class Main {
    public static void main(String [] args){
        Animal horse = new Horse("bucefal",5);
        Animal cat = new Cat("Snezok", 2);
        Animal koala = new Koala("Oz",8);
        koala.makeSound();
        horse.makeSound();
        cat.makeSound();

    }
}
