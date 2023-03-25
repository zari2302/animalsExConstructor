public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setName("Bobi");
        parrot.setColor("Raznosvetnyi");
        parrot.setBreed("Korelly");
        parrot.setAge(2);
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setColor("belyi,krasnyi");
        fish.setBreed("Kloun");
        fish.setAge(1);
        Cat cat = new Cat();
        cat.setName("Mia");
        cat.setColor("belyi");
        cat.setBreed("Burmila");
        cat.setAge(3);
        Dog dog = new Dog();
        dog.setName("laika");
        dog.setColor("chernyi");
        dog.setBreed("Akita");
        dog.setAge(4);
        System.out.println(parrot.getName() + "\n" + parrot.getColor() +
                "\n" + parrot.getBreed() + "\n" + parrot.getAge());
        System.out.println(fish.getName() + "\n" + fish.getColor() + "\n"
                + fish.getBreed() + "\n" + fish.getAge());
        System.out.println(cat.getName() + "\n" + cat.getColor() + "\n" +
                cat.getBreed() + "\n" + cat.getAge());
        System.out.println(dog.getName() + "\n" + dog.getColor() + "\n" +
                dog.getBreed() + "\n" + dog.getAge());
    }
}