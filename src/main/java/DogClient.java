public class DogClient {
    public static void main(String[] args) {
        Dog genericDog = new Dog();
        Dog rover = new Dog("Rover", 5, "Corgi");
        System.out.println(genericDog);
        System.out.println(rover);
        System.out.println("Noise:");
        rover.makeNoise();
        System.out.println(rover.getBreed());
        System.out.println(rover.getAge());
        System.out.println(rover.getName());
    }
}