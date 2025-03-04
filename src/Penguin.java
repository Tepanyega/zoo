import java.io.Serial;
import java.io.Serializable;

public class Penguin extends Animal implements Walk, Swim, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    boolean isSwimming;
    int walkSpeed;
    int swimSpeed;

    public Penguin()
    { super("Penguin"); }

    public boolean isSwimming(){ return isSwimming; }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "isSwimming=" + isSwimming +
                ", walkSpeed=" + walkSpeed +
                ", swimSpeed=" + swimSpeed +
                '}';
    }
}