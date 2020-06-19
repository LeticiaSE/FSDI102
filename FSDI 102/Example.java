public class Example {
    public static void main(String[] args) {
        
        User Kenny = new User("Kenny", 33);
        Kenny.printUser();

        //add another user of type User

        User Leticia = new User("Lety",27);
        Leticia.printUser();

        User dyllan = new User("Dyllan",27);
        dyllan.printUser();

        /**class Student*/
        Student lety = new Student("Lety",27,102);
        lety.printStudent();

        //add another object of the type student

        Student Paola = new Student("Paola",27,102);
        Paola.printStudent();

        Student nala = new Student ("Nalani",23,102);
        nala.printStudent();

        /**class Animal */
        Animal baby = new Animal("baby","shark");
        baby.printAnimal();
        baby.attacks(Kenny);
        baby.attacks(lety);

        //add another object of the type Animal

        Animal cow = new Animal("Lola","cow");
        cow.printAnimal();
        cow.attacks(Leticia);
        cow.attacks(Paola);
        
        Animal alligator = new Animal("Robert", "alligator");
        alligator.printAnimal();
        alligator.attacks(dyllan);
        alligator.attacks(nala);
    }
}