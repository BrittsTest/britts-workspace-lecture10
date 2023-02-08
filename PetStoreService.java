import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetStoreService {

    List<Pet> pets;
    

    public PetStoreService(){
        pets = new ArrayList<Pet>();
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void purchasePet(int id){
        pets.remove(id);
    }

    public void purchasePet(String name){
        for(int i = 0; i < pets.size(); i++){
            Pet currentPet = pets.get(i);
            String currentPetName = currentPet.name;
            if(currentPetName.equals(name)){
                //if this point is reached, the pet name that matches
                //the pet we are searching for needs to be removed. 
                pets.remove(i);
            }
        }
    }

    //I want to be able to print my pets, and I can just do that by printing my list. 
    public List<Pet> getPets(){
        return pets;
    }


    //menu method
    public void menu(Scanner sc){
        boolean willLoop = true;
        while(willLoop){
            System.out.println("Please choose: Add | Purchase | Exit");
            List<Pet> allPets = getPets();
            System.out.println("Current pets: " + allPets);
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Add")){
                System.out.println("Pet's name");
                String name = sc.nextLine();
                System.out.println("Pet's sound");
                String sound = sc.nextLine();
                Pet newPet = new Pet(name, sound);
                addPet(newPet);
            }else if(input.equalsIgnoreCase("Purchase")){
                System.out.println("What pet would you like to purchase");
                String name = sc.nextLine();
                purchasePet(name);
            }else if(input.equalsIgnoreCase("Exit")){
                willLoop = false;
                //should break the while loop
            }
        }
        }
    }
    

    

