package Run;

import Build.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Charly", 3, "2024-05-13", "Husky", 0);
        Cat cat1 = new Cat("Miau", 5, "2023-01-12", "Blue", true);
        Parrot parrot1 = new Parrot("Doty", 1, "2023-03-05", true, true, "Asia", true);
        Canary canary1 = new Canary("Cana", 0, "2024-01-14", true, true, "Yellow", true);

        Inventory inventory = new Inventory();

        inventory.insertPet(dog1);
        inventory.insertPet(cat1);
        inventory.insertPet(parrot1);
        inventory.insertPet(canary1);

        inventory.showPetList();
        inventory.showAllPets();

        Scanner sc = new Scanner(System.in);
        String out;
        out = sc.nextLine();
        System.out.println(out);
    }
}