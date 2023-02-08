// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

public class Pet {
//Generics are <...> inside of them tells our Collection the object type to expect. 
    // List<Integer> petNames = new LinkedList<>();
    // ArrayList<String> petName2 = new ArrayList<>();
    // ArrayList<String> petName3 = new ArrayList<String>();

    // public List<Integer> testMethod(){
    //     petNames.add(15);
    //     return petNames;
    // }

    //Wrapper Classes - convert primitives to objects
    // int | Integer
    //double | Double
    //float | Float
    //char | Character
    // short | Short
    // byte | Byte
    //long | Long
    // boolean |  Boolean



    public String name;
    public String sound;

    public Pet(String name1, String sound1){
        this.name = name1;
        this.sound = sound1;
    }

    public Pet(){

    }


    public String toString(){
        return (this.name + ", " + this.sound + "!");
    }


}
