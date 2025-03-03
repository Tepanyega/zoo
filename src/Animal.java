import java.io.Serial;
import java.io.Serializable;

//abstract classes can have both abstract and concrete methods
abstract public class Animal implements Eat, Serializable { //the class is abstract meaning you cannot instantiate it
   
    @Serial 
    private static final long serialVersionUID = 1L;

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
