import java.io.Serializable;

public class Dolphin extends Animal implements Swim, Eat, Serializable {
    //some unique properties
    private  String color;
    private int swimmingSpeed;

    //constructor
    public Dolphin(){super("Dolphin");}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed(){ return swimmingSpeed;}

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    String name = getNameOfAnimal();
    @Override
    public void eatFood() {
        System.out.println( name + " is eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println(name + " have eaten fish");
    }
    @Override
    public void swimming(){
        System.out.println(name + " Is swimming at the speed of " + swimmingSpeed);
    }
}