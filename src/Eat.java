//interfaces define a contract that multiple classes can implement,
//can even help you achieve multiple inheritance
public interface Eat{

     //abstract method, you don't have to implicitly specify the access modifier
     void eatFood();
     void eatingCompleted();

     //implementation of the eating food method
     //this is polymorphism
     void eatingFood();

     //you can only have abstract method and default method
     //which allows you to have a method with body
     //but don't forget to use the default key word

     //Again you can have concrete methods, but these method will not be accesses in the subclasses

}