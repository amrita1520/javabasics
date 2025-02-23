//student is the class
public class Student {
private  String name ; //name is a variable
private int age ; //age is a variable
public Student (String names , int ages ){ //constructor--> initialize the variables and create the object
    name = names;
    age = ages;
}
public void display() { //function
    System.out.println("name" + name + "age" + age);
}
}


