public class Person {
    private int age;
    private String name;
    private Gender gender;

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
