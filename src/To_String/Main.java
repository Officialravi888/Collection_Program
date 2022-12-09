package To_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> personList= new ArrayList<>();
        personList.add(new Student("ravi", "lucknow","male",23));
        personList.add(new Student("ravi", "kanpur","male",32));
        personList.add(new Student("ravi", "noida","male",22));
        personList.add(new Student("ravi", "gurugon","male",22));
        personList.stream().filter(x->x.getAge()<32).collect(Collectors.toList()).forEach(System.out::println);
    }
}
