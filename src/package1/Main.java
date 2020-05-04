package package1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .name("Janusz")
                .surname("Warszawa")
                .build();
        System.out.println(person.toString());
    }


}
