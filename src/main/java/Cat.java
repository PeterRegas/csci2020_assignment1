public class Cat implements Animal {
    @Override
    public void Identify() {
        System.out.println("Cat");
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
        System.out.println("15 pounds");
        return;
    }

}



