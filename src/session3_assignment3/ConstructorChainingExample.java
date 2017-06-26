package session3_assignment3;

public class ConstructorChainingExample {

  
    public static void main(String args[]) {
    
        //this will first call one argument constructor of Child Class which
        //in turn call corresponding constructor of super class using super(String)
        System.out.println("Constructor chaining Example in Java");
        Child child = new Child("Jeremy");
      
        //this constructor will call no argument constructor of Child,
        //which then call one argument constructor of
        //same class, which finally call corresponding one argument constructor
        // of super class Parent.
        System.out.println("---------------------------------");
        Child emptyChild = new Child();
    } 
  
}

