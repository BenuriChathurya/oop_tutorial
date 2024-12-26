package TutorialWeek02;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name){
       this.name = name;
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void displayName(){
        System.out.print(name+" "+surname+" "+age);
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getSurname(){
        return surname;
    }
}
