package TutorialWeek02;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Ishu ");
        person1.setSurname("Poornavi");
        person1.setAge(20);
        System.out.println ("Ishu "+ person1.getSurname()+" "+ person1.getAge());

        Person person2= new Person("Benu");
        person2.setSurname("Chathurya");
        person2.setAge(22);
        person2.displayName();

    }
}
