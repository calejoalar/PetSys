package entity;

public class Owner {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;

    public int getId() {
        return id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Owner(\nId: " + this.id + ";\nfirstName: " + this.firstName + "\nlastName: " + this.lastName + "\nemail: "
                + this.email + "\ntelephone: " + this.telephone + "\n)";
    }

}
