import java.util.Scanner;
public class assignment1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AnimalFactory anAnimalfactory = new AnimalFactory();
        Animal anAnimal = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of animal would you like to adopt(dog, cat, bird): ");
        String animal = userInput.nextLine();
        anAnimal = anAnimalfactory.chooseAnimal(animal);
        adoptAnimal(anAnimal);
    }

    /**
     * shows information on adopted animal
     * @param anAnimal
     *
     */
    public static final void adoptAnimal(Animal anAnimal){
        anAnimal.Identify();
        anAnimal.Weight();
        anAnimal.canFly();
    }

}
