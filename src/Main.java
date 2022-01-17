public class Main {
    public static void main(String [] args){
        Animal horse = new Horse("bucefal",5);
        Animal cat = new Cat("Snezok", 2);
        Animal koala = new Koala("Oz",8);
        koala.makeSound();
        horse.makeSound();
        cat.makeSound();
        System.out.println(horse.equals(cat));
        System.out.println(cat.equals(koala));
        System.out.println(horse.equals(koala));
    }
}
