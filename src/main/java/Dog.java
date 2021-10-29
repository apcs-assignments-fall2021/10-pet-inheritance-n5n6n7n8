public class Dog extends Pet {
    private String breed;
    public Dog(String name, int age, String breed) { //dog constructor
        super(name, age);
        this.breed=breed;
    }
    public Dog() {//generic dog constructor
        super("Max", 1);
        this.breed="Golden retriever";
    }
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + this.breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String str) {
        this.breed=str;
    }
}