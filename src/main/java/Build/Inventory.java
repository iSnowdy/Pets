package Build;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Pets> petsList;
    public Inventory() {
        this.petsList = new ArrayList<Pets>();
    }

    public String getPetType(Pets pets) { // Instance of returns boolean
        if (pets instanceof Dog) {
            return "Doggie";
        } else if (pets instanceof Cat) {
            return "Cat";
        } else if (pets instanceof Parrot) {
            return "Parrot";
        } else if (pets instanceof Canary) {
            return "Canary";
        } else {
            return "What the fuck is this?";
        }
    }

    public void showPetList() {
        System.out.println("======= PETS LIST =======");
        for (int i = 0; i < this.petsList.size(); i ++) {
            Pets pet = this.petsList.get(i);
            String type = getPetType(pet);
            String name = pet.getPetName();
            System.out.println(i + ": " + type + " " + name);
        }
    }

    public void showIndividualData(int index) {
        if (index >= 0 && index < this.petsList.size()) {
            System.out.println("======= PET + " + index + " =======");
            Pets pet = this.petsList.get(index);
            pet.showPet();
        }
    }

    public void showAllPets() {
        for (int i = 0; i < this.petsList.size(); i ++) {
            showIndividualData(i);
        }
    }

    public void insertPet(Pets pet){
        this.petsList.add(pet);
    }
    public void deletePet(Pets pet){
        this.petsList.remove(pet);
    }

    public void emptyList() {
        this.petsList.removeAll(petsList);
    }
}
