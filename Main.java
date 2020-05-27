import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Using syso to say Hi
    System.out.println("Hi!");

    // Using a static method to say hi
    hiEveryone();

    // Creating an object of this class and calling sayHi
    Main m = new Main();
    m.sayHi();

    // Creating an object of another class and calling their sayHello
    SecondClass sebastian = new SecondClass();
    sebastian.sayHello();

    // Passing a function to an interface and calling their myNameIs --Eminem
    Hi world = (a) -> System.out.println(a + " says hi hi hi :)");
    world.myNameIs("Sebastian");

    // Creating a list and then using a stream to print out only Sebastian
    // using functional programing concepts
    List<String> names = new ArrayList<>();
    names.add("James");
    names.add("Sebastian");
    names.add("sebastian");
    names.add("SeBaStIaN");
    names.stream().filter(name -> name.equalsIgnoreCase("Sebastian"))
        .forEach(name -> System.out.println(name + " says Hola"));

    // I am bored and decided to play around

  }

  public static void hiEveryone() {
    System.out.println("Hi everyone!!!");
  }

  public void sayHi() {
    System.out.println("HEEELLOOO HUMANS!");
  }
}

class SecondClass {
  // No access to this string -- Encapsulation
  // no getter or setter ---sayHello might be a getter...
  private String name;

  public SecondClass() {
    name = "Sebastian";
  }

  public void sayHello() {
    System.out.println(name + " is saying hello to the world!");
  }
}

interface Hi {
  // Method without a body of code 0.0
  public void myNameIs(String name);
}