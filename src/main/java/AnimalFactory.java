public class AnimalFactory {
    /**
     * given a string representing animal type will return an animal object of that type
     * @param AnimalType
     * @return
     */
    public Animal chooseAnimal(String AnimalType){
        if(AnimalType == null){
            return null;
        }
        if(AnimalType.equalsIgnoreCase("dog")){
            return new Dog();

        } else if(AnimalType.equalsIgnoreCase("cat")){
            return new Cat();

        } else if(AnimalType.equalsIgnoreCase("bird")){
            return new Bird();
        }
        return null;
    }
}
