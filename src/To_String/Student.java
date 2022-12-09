package To_String;//toString()-:return String obj representing the value of this integer
//toString(int i)-:return a string obj representing the specified integer

public class Student {
    private String name;
    private String city;
    private String gender;
   private int age;

    public Student(String name, String city, String gender, Integer age) {
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
