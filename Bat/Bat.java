public class Bat extends Specimen {

    public void fly(){
        System.out.println("Flying...");
        energyLevel-=50;
    }
    public void eatHumans(){
        System.out.println("Never mind");
        energyLevel+=25;
    }
    public void attackTown(){
        System.out.println("The town is on fire");
        energyLevel-=100;
    }
}