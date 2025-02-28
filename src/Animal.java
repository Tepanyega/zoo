import java.io.Serial;
import java.io.Serializable;

//this is my abstract class which happens to act as a super class
//abstract classes can have both abstract and concrete methods
abstract public class Animal implements Eat, Serializable { //the class is abstract meaning you cannot instantiate it
    //this class further implements serialization, indicating that the instances of this class can be serialized
    // (converted to bytes stream for saving to a file, network transmission)

    //the animal implements the interface eat interface,
    //the class must provide implementation for all abstract methods.

    @Serial //this annotation introduces java 14, to mark the field as the serial version UID, used for version control
    private static final long serialVersionUID = 1L;

    //the use of private, actually introduces the concept of encapsulation
    //these are instance variable or properties of the Animal
    //represents the core characteristics of an Animal
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    //having a default constructor to initialize the name of animal to unknown
    public Animal(){
        nameOfAnimal = "unknown";
    }
    //parametised constructor
    public Animal(String nameOfAnimal){
        this.nameOfAnimal = nameOfAnimal;
        //set the initial or default property values
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    //getting setters and the getters
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //implementation of the eating food method
    @Override
    public void eatingFood(){
        System.out.println("The animal:" + nameOfAnimal + " is eating.");
    }
}
