package PersistenceTXT.Model;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String phoneNumber;

    public Person(String name,String lastName,int age,String phoneNumber) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Person(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name= " + name + " lastName= " + lastName + " age= "+age+" phoneNumber= "+ phoneNumber + "\n";
    }
}
