package session3_assignment3;

class Child extends Parent{
    private String name;
  
    /*
     * Calling constructor same class with one argument
     */
    protected Child(){
        this("");
        System.out.println("No argument constructor of Child called ");
    }
  
    /*
     * Calling constructor of super class with one argument
     * call to super() must be first line in constructor
     */
    protected Child(String name){
        super(name);
        System.out.println("One argument constructor of Super class called from sub class ");
    }
}

