public class Bird implements Animal {
    /**
     *prints out type of animal
     */
    @Override
    public void Identify() {
        System.out.println("Bird");
    }
    /**
     *prints out if animal can fly
     */
    @Override
    public void canFly(){
        System.out.println("Can Fly");
        return;
    }
    /**
     *prints out weight of animal
     */
    @Override
    public void Weight(){
        System.out.println("3 pounds");
        return;
    }

}


