//interfaces define a contract that multiple classes can implement
//it can even help you achieve multiple inheritance
//as java doesn't support multiple inheritance
public interface Swim {

    //abstract method, you don't have to implicitly specify the access modifier
    void swimming();

//you can only have abstract method and default method
//which allows you to have a method with body
//but don't forget to use the default key word

//Again you can have concrete methods, but these method will not be accesses in the subclasses
}