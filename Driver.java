import java.util.Scanner;

public class Driver{

    public static void main(String[] args){

        PetStoreService pss = new PetStoreService();
        Scanner sc = new Scanner(System.in);
        pss.menu(sc);

        // Pet p = new Pet();
        // System.out.println(p.testMethod());

    }
}