package entity;

public class Pet {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String breed;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet(\nId: " + this.id + ";\nfirstName: " + this.firstName + "\nlastName: " + this.lastName + "\nage: "
                + this.age + "\nbreed: " + this.breed + "\n)";
    }

}
