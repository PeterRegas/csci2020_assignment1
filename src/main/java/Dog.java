public class Dog implements Animal {

    /**
     *prints out type of animal
     */
    @Override
    public void Identify() {
        System.out.println("Dog");
    }

    /**
     *prints out if animal can fly
     */
    @Override
    public void canFly(){
        System.out.println("Can Not Fly");
        return;
    }

    /**
     *prints out weight of animal
     */
    @Override
    public void Weight(){
        System.out.println("80 pounds");
        return;
    }

}
