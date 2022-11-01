public class Dog extends Animal { //extending is like "inheriting"

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes; // initializing the fields relating to Dog
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //calls the super equivalent of that class. Ex: the superclass is "Animal", then it's going to look at the "eat" method and call that
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

}

//if it has the word "super" next to it, it will execute that method first, because you overrided it
