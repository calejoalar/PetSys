import java.util.Scanner;
import entity.*;

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Pet pet = new Pet();
        Owner owner = new Owner();

        System.out.println("Registro de la mascota:");
        System.out.println("-----------------------");
        System.out.println("Tipo de animal:");
        pet.setBreed(scn.next());
        System.out.println("Nombres:");
        pet.setFirstName(scn.next());
        System.out.println("Apellidos:");
        pet.setLastName(scn.next());
        System.out.println("Edad:");
        pet.setAge(scn.nextInt());
        System.out.println("Raza:");
        pet.setBreed(scn.next());
        
        System.out.println("\n");

        System.out.println("Registro del dueño:");
        System.out.println("-------------------");
        System.out.println("Nombres:");
        owner.setFirstName(scn.next());
        System.out.println("Apellidos:");
        owner.setLastName(scn.next());
        System.out.println("Correo electronico:");
        owner.setEmail(scn.next());
        System.out.println("Telefóno fijo / Celular:");
        owner.setTelephone(scn.next());
        
        System.out.println("\n");

        System.out.println("Se registro la siguiente información:");
        System.out.println(pet.toString());
        System.out.println("\n");
        System.out.println(owner.toString());

    }
}