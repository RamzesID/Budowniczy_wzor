package package1;

public class Person {
    private String name = "";
    private String surname = "";
    private String pesel  = "";
    private String city = "";

    public static class PersonBuilder {
        private String name = "";
        private String surname = "";
        private String pesel  = "";
        private String city = "";

        public PersonBuilder() {
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }
        public PersonBuilder pesel(String pesel) {
            this.pesel = pesel;
            return this;
        }
        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(PersonBuilder builder){
        name =builder.name;
        surname =builder.surname;
        pesel=builder.pesel;
        city =builder.city;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + city;
    }
}

