public abstract class Animal {
    private String name;
    private int weight;


    public Animal (String name,int weight){
              this.name= name;
              this.weight=weight;

    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void makeSound();
}
