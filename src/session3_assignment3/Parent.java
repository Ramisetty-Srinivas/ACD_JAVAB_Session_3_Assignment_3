package session3_assignment3;

class Parent{
    private String name;
    /*
     * Calling constructor of same class with one String argument
     */
    protected Parent(){
        this("");
        System.out.println("No argument constructor of Parent called ");
    }
  
    protected Parent(String name){
        this.name = name;
        System.out.println("One String argument constructor of Parent called ");
    }
}

