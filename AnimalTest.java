// Parent class Animal
class Animal {
    // This Method will be overridden by subclasses
    public void makeSound() {
        System.out.println("This animal makes a sound");
    }
}

// Dog class inheriting from Animal
class Dog extends Animal {
    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks: boow Boow....");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow Meow....");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos: Moo Moo");
    }
}

// main class
public class AnimalTest {
    public static void main(String[] args) {
        // Polymorphism in action

        // Animal reference, Dog object
        Animal myDog = new Dog();
        myDog.makeSound();  // overridden 

        Animal myCat = new Cat();
        myCat.makeSound(); 

        Animal myCow = new Cow();
        myCow.makeSound(); 
    }
}
