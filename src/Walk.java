//interfaces define a contract that multiple classes can implement
//it can even help you achieve multiple inheritance
//as java doesnt support multiple inheritance
public interface Walk {

    //abstract method, you don't have to implicitly specify the access modifier
    void walking();

//you can only have abstract method and default method
//which allows you to have a method with body
//but dont forget to use the default key word

//Again you can have concrete methods, but these method will not be accesses in the subclasses
}